package com.in28minutes.rest.webservices.restfulwebservices.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@ToString
public class ErrorDetails {

    private LocalDateTime timestamp;
    private String mesage;
    private String details;

}
