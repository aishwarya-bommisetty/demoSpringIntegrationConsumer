package com.example.demoSpringIntegration;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

//Lombok: avoid cluttering code with getters, setters, and other trivial stuff
// The event - that is post to be published.
@Getter
@Setter
@Builder
public class PostPublishedEvent {
   
   private String postUrl;
   private String postTitle;    
   private List<String> emails;

}