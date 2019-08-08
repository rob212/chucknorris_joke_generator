package com.woita.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mcbrydr on 08/08/19
 */
@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes quoter;

    public JokeServiceImpl() {
        this.quoter = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return this.quoter.getRandomQuote();
    }
}
