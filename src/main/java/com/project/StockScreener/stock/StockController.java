package com.project.StockScreener.stock;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Controller
public class StockController {

    @RequestMapping("/")
    public String get() {
        RestTemplate restTemplate = new RestTemplate();
        Stock stock = restTemplate.getForObject("https://sandbox.iexapis.com/stable/stock/QQQ/quote?token=Tpk_d6a217598fe344f48fd75d254eb1896f", Stock.class);
        return stock.toString();
    }

    @GetMapping("/search")
    public String showStock(@RequestParam(name="stock", required = false, defaultValue = "QQQ") String stock, Model model) {
        model.addAttribute("stock", stock);
        return "search";
    }

}
