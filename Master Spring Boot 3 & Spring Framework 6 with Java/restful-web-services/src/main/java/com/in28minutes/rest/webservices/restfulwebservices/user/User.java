package com.in28minutes.rest.webservices.restfulwebservices.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.in28minutes.rest.webservices.restfulwebservices.post.Post;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
//@Entity(name = "user_details")
public class User {

//    @Id
//    @GeneratedValue
    private Integer id;

    @Size(min=2, message = "Name should have at least 2 characters.")
    @JsonProperty("user_name")
    private String name;

    @Past(message = "Birth Date should be in the past.")
    @JsonProperty("birth_date")
    private LocalDate birthDate;

    //@OneToMany(mappedBy = "user")
//    @JsonIgnore
    private List<Post> posts;

}
