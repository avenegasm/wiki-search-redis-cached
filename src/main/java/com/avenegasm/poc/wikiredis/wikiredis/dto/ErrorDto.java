package com.avenegasm.poc.wikiredis.wikiredis.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ErrorDto implements Serializable {
     String code;
     String info;
     String docref;
}
