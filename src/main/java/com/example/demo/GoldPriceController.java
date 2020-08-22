package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
@RequestMapping("/gold")
public class GoldPriceController {

    private final GoldPriceRetriever goldPriceRetriever;

    @GetMapping()
    public BigDecimal byFeignClient() {
        return goldPriceRetriever.getTodaysPrice().getPrice();
    }



}
