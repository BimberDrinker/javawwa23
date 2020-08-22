package com.example.demo.nbp;

import com.example.demo.NbpGoldPrice;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class RestTemplateNbpClient implements NbpClient {
    @Override
    public List<NbpGoldPrice> getTodaysPrice() {
        return Arrays.asList(
                new RestTemplate().getForObject(
                        "http://api.nbp.pl/api/cenyzlota/", NbpGoldPrice[].class
                )
        );
    }
}
