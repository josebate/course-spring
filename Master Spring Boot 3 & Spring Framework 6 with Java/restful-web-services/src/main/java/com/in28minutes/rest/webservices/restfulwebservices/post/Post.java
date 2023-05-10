package com.in28minutes.rest.webservices.restfulwebservices.post;

import com.in28minutes.rest.webservices.restfulwebservices.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
//@Entity
public class Post {

    //@Id
    //@GeneratedValue
    private Integer id;

    private String description;

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JsonIgnore
    private User user;

}
