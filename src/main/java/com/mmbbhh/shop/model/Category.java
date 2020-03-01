package com.mmbbhh.shop.model;

import java.io.Serializable;
import lombok.Data;

//使用lombok简化setter、getter等
@Data

public class Category implements Serializable {

    /**
     * id
     */
    private Integer id;

    /**
     * category_id
     */
    private Integer category_id;

    /**
     * category_name
     */
    private String category_name;

    /**
     * name
     */
    private String name;

    /**
     * 商品主图
     */
    private String primary_pic_url;

    public Category() {

    }
}