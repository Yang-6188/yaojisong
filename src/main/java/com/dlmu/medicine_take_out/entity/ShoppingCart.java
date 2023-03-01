package com.dlmu.medicine_take_out.entity;

import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 购物车
 */
@Data
public class ShoppingCart implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    //名称
    private String name;

    //用户id
    /**
     * 表示的是这是当前哪一个用户的用户Id
     */
    private Long userId;

    //菜品id
    /**
     * 是菜品的话购物车提交的就是dishId
     */
    private Long medicineId;

    //套餐id
    /**
     * 提交的是就是setmealId
     */
    private Long packagesId;

    //口味
    private String medicineRequirement;

    //数量
    private Integer number;

    //金额
    private BigDecimal amount;

    //图片
    private String image;

    private LocalDateTime createTime;
}
