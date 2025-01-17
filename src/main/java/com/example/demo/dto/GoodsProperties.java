package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Map;

@Component
@ConfigurationProperties(prefix = "test")
@Validated
public class GoodsProperties {
    @NotNull
    private Map<String, Goods> goods;

    public Map<String, Goods> getGoods() {
        return goods;
    }

    public void setGoods(Map<String, Goods> goods) {
        this.goods = goods;
    }

    @Getter
    @Setter
    public static class Goods {
        private String goodsNo;
        private String goodsName;

    }
}