package com.example.demo.controller;


import com.example.demo.dto.DataSourceConfig;
import com.example.demo.dto.GoodsDto;
import com.example.demo.service.GoodsService;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
//@RequestMapping("/api/v1/goods")
public class GoodsController {
    private final GoodsService goodsService;
    private final DataSourceConfig dataSourceConfig;



    public GoodsController(GoodsService goodsService, DataSourceConfig dataSourceConfig) {
        this.goodsService = goodsService;
        this.dataSourceConfig = dataSourceConfig;
    }

    @GetMapping("/api/v1/goods/{goodsNo}")
    public GoodsDto getGoods(@PathVariable String goodsNo) {
        return goodsService.getGoodsByNo(goodsNo);
    }

    @GetMapping("/")
    public String healthCheck() {
        return "ok";
    }

    @GetMapping("/configmap")
    public Map<String, String> getConfigMap() {
        Map<String, String> configMap = new HashMap<>();
        configMap.put("hostip", dataSourceConfig.getHostip());
        configMap.put("username", dataSourceConfig.getUsername());
        configMap.put("password", dataSourceConfig.getPassword());
        return configMap;
    }
}