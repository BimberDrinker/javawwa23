package com.example.demo;

import com.example.demo.nbp.NbpClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class GoldPriceRetriever {

    @Qualifier("nbpFeignClient")
    private final NbpClient nbpClient;

    NbpGoldPrice getTodaysPrice() {
        return nbpClient.getTodaysPrice().get(0);
    }

}
