package com.momo.springbootfailureanalyzer.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticService {
    public ArithmeticService() {
        int i = 1 / 0;
    }
}
