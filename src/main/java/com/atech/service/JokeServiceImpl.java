package com.atech.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JokeServiceImpl implements JokeService{

    private ChuckNorrisQuotes chuckNorrisQuotes;

    @Autowired
    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getRandomQuote() {

        return chuckNorrisQuotes.getRandomQuote();
    }
}
