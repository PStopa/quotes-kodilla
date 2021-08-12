package com.kodilla.quotes.controller;

import com.kodilla.quotes.model.Quote;
import com.kodilla.quotes.service.QuoteService;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuoteController {

    private final QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping("/quote/random")
    public Quote getRandom() {
        return quoteService.getRandomQuote();
    }

    @GetMapping("/quote/{id}")
    public Quote getQuoteById(@PathVariable(name = "id") Long id) {
        return quoteService.getQuoteById(id);
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
