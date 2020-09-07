package com.avenegasm.poc.wikiredis.wikiredis.client;

import com.avenegasm.poc.wikiredis.wikiredis.dto.WikipediaOkResponse;
import feign.RequestLine;

public interface WikipediaClient {

    @RequestLine("GET")
    WikipediaOkResponse pageSearch();
}
