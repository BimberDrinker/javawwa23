package com.example.demo.nbp;

import com.example.demo.NbpGoldPrice;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "nbpFeignClient", url = "http://api.nbp.pl/api")
public interface NbpFeignClient extends NbpClient {

    @RequestMapping("/cenyzlota")
    @Override
    List<NbpGoldPrice> getTodaysPrice();

}
