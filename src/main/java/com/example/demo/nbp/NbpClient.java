package com.example.demo.nbp;

import com.example.demo.NbpGoldPrice;

import java.util.List;

public interface NbpClient {

    List<NbpGoldPrice> getTodaysPrice();

}
