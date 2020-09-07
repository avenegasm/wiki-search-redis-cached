package com.avenegasm.poc.wikiredis.wikiredis.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class WikipediaOkResponse implements Serializable {
    ParseDto parse;
    ErrorDto error;
}
