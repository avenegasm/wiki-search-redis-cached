package com.avenegasm.poc.wikiredis.wikiredis.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ParseDto implements Serializable {
    String title;
    Long pageId;
    String wikitext;
}
