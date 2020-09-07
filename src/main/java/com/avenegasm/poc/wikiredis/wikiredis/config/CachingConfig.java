package com.avenegasm.poc.wikiredis.wikiredis.config;


import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class CachingConfig {
    //Se habilita el cache manager de redis por properties con la notacion enableCaching en algun config
}