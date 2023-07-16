package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
//@JsonIgnoreProperties("field1")
@JsonFilter("SomeBeanFilter")
public class SomeBean {

    private String field1;

//    @JsonIgnore
    private String field2;

    private String field3;

}
