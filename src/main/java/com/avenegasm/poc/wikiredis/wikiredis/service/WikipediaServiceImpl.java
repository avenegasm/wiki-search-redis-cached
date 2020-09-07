package com.avenegasm.poc.wikiredis.wikiredis.service;

import com.avenegasm.poc.wikiredis.wikiredis.client.WikipediaClient;
import com.avenegasm.poc.wikiredis.wikiredis.dto.WikipediaOkResponse;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;

@Service
public class WikipediaServiceImpl implements WikipediaService {

    Logger logger = LoggerFactory.getLogger(WikipediaServiceImpl.class);

    @Value("${app.wikipedia.url}")
    String url;

    @Cacheable(value = "wikiSearch", key = "#search")
    @Override
    public WikipediaOkResponse realizarBusqueda(String search) {
        logger.info("Realizando búsqueda en wikipedia ...");
        String urlGenerada = MessageFormat.format(url, search);
        logger.info("Url generada :{}", urlGenerada);
        WikipediaOkResponse pageSearch = Feign.builder()
                .client(new OkHttpClient())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .logger(new Slf4jLogger(WikipediaClient.class))
                .logLevel(feign.Logger.Level.FULL)
                .target(WikipediaClient.class, urlGenerada).pageSearch();
        logger.info("Búsqueda realizada con éxito, guardada en cache.");
        return pageSearch;
    }
}
