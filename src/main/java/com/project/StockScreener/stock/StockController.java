package com.project.StockScreener.stock;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StockController {

    @GetMapping("/")
    public String get() {
        /*RestTemplate restTemplate = new RestTemplate();
        Stock stock = restTemplate.getForObject("https://sandbox.iexapis.com/stable/stock/QQQ/quote?token=Tpk_d6a217598fe344f48fd75d254eb1896f", Stock.class);
        return stock.toString();*/

        return "index";
    }

    @PostMapping("/search")
    public String showStock(@RequestParam(name="symbol", required = false, defaultValue = "QQQ") String symbol, Model model) {
        model.addAttribute("stock", symbol);
        return "search";
    }

}
