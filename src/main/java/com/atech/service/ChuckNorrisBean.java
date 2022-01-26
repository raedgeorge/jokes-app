package com.atech.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ChuckNorrisBean {

    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){

        return new ChuckNorrisQuotes();
    }
}
