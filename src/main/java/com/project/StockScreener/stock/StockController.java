package com.project.StockScreener.stock;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StockController {

    @RequestMapping("/")
    public String get() {
        RestTemplate restTemplate = new RestTemplate();
        Stock stock = restTemplate.getForObject("https://sandbox.iexapis.com/stable/stock/QQQ/quote?token=Tpk_d6a217598fe344f48fd75d254eb1896f", Stock.class);
        return stock.toString();
    }

    @GetMapping("/search")
    public String showStock() {
        // placeholder
        return "...";
    }

}
