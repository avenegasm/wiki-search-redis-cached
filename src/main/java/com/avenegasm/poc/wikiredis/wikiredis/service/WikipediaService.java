package com.avenegasm.poc.wikiredis.wikiredis.service;


import com.avenegasm.poc.wikiredis.wikiredis.dto.WikipediaOkResponse;

public interface WikipediaService {

    WikipediaOkResponse realizarBusqueda(String search);

}
