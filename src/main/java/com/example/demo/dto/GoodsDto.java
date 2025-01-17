package com.example.demo.dto;


public class GoodsDto {
    private String goodsNo;
    private String goodsName;

    public GoodsDto(String goodsNo, String goodsName) {
        this.goodsNo = goodsNo;
        this.goodsName = goodsName;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
}