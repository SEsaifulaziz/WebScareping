package com.WebScraping.Controller;

import com.WebScraping.Model.ScrapeResponse;
import com.WebScraping.Service.ScraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ScrapeController {

    @Autowired
    private ScraperService scraperService;

    @GetMapping("/api/scrape")
    public ScrapeResponse scrape(@RequestParam String url) throws IOException {
        return scraperService.webScrape(url);
    }
}
