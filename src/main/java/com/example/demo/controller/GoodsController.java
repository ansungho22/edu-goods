package com.example.demo.controller;


import com.example.demo.dto.GoodsDto;
import com.example.demo.service.GoodsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/v1/goods")
public class GoodsController {
    private final GoodsService goodsService;

    public GoodsController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    @GetMapping("/api/v1/goods/{goodsNo}")
    public GoodsDto getGoods(@PathVariable String goodsNo) {
        return goodsService.getGoodsByNo(goodsNo);
    }

    @GetMapping("/")
    public String healthCheck() {
        return "ok";
    }
}