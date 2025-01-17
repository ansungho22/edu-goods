package com.example.demo.service;



import com.example.demo.dto.GoodsDto;
import com.example.demo.dto.GoodsProperties;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class GoodsService {
    private final GoodsProperties goodsProperties;

    public GoodsService(GoodsProperties goodsProperties) {
        this.goodsProperties = goodsProperties;
    }

    public GoodsDto getGoodsByNo(String goodsNo) {
        GoodsProperties.Goods goods = goodsProperties.getGoods().get(goodsNo);
        if (goods != null) {
            return new GoodsDto(goods.getGoodsNo(), goods.getGoodsName());
        }
        return null;
    }
}