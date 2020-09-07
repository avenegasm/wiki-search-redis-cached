package com.avenegasm.poc.wikiredis.wikiredis.controller;

import com.avenegasm.poc.wikiredis.wikiredis.dto.WikipediaOkResponse;
import com.avenegasm.poc.wikiredis.wikiredis.service.WikipediaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("wiki")
@RestController
public class WikipediaController {

    Logger logger = LoggerFactory.getLogger(WikipediaController.class);

    @Autowired
    WikipediaService wikipediaClient;


    @GetMapping("/{search}")
    public ResponseEntity<WikipediaOkResponse> search(@PathVariable String search) {
        logger.info("Controlador invocado");
        return new ResponseEntity(wikipediaClient.realizarBusqueda(search), HttpStatus.OK);
    }
}
