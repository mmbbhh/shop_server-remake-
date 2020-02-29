package com.mmbbhh.shop.model;

import java.io.Serializable;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

//使用lombok简化setter、getter等
@Data

//自动生成的sql反向转化的商品实体
public class Good implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * goods_type
     */
    private String goods_type;

    /**
     * category_id
     */
    private Integer category_id;

    /**
     * category_name
     */
    private String category_name;

    /**
     * goods_sn
     */
    private String goods_sn;

    /**
     * name
     */
    private String name;

    /**
     * brand_id
     */
    private Integer brand_id;

    /**
     * goods_number
     */
    private String goods_number;

    /**
     * keywords
     */
    private String keywords;

    /**
     * goods_brief
     */
    private String goods_brief;

    /**
     * goods_desc
     */
    private String goods_desc;

    /**
     * is_on_sale
     */
    private boolean is_on_sale;

    /**
     * add_time
     */
    private Date add_time;

    /**
     * sort_order
     */
    private Integer sort_order;

    /**
     * is_delete
     */
    private boolean is_delete;

    /**
     * attribute_category
     */
    private Integer attribute_category;

    /**
     * 专柜价格
     */
    private BigDecimal counter_price;

    /**
     * 附加价格
     */
    private BigDecimal extra_price;

    /**
     * is_new
     */
    private boolean is_new;

    /**
     * 商品单位
     */
    private String goods_unit;

    /**
     * 商品主图
     */
    private String primary_pic_url;

    /**
     * 商品列表图
     */
    private String list_pic_url;

    /**
     * 零售价格
     */
    private BigDecimal retail_price;

    /**
     * 销售量
     */
    private Integer sell_volume;

    /**
     * 主sku　product_id
     */
    private Integer primary_product_id;

    /**
     * 单位价格，单价
     */
    private BigDecimal unit_price;

    /**
     * promotion_desc
     */
    private String promotion_desc;

    /**
     * promotion_tag
     */
    private String promotion_tag;

    /**
     * app专享价
     */
    private BigDecimal app_exclusive_price;

    /**
     * 是否是app专属
     */
    private boolean is_app_exclusive;

    /**
     * is_limited
     */
    private boolean is_limited;

    /**
     * is_hot
     */
    private boolean is_hot;

    /**
     * market_price
     */
    private BigDecimal market_price;

    /**
     * 创建人id
     */
    private Long create_user_id;

    /**
     * 修改人id
     */
    private Long update_user_id;

    /**
     * 修改时间
     */
    private Date update_time;

    /**
     * create_user_dept_id
     */
    private Long create_user_dept_id;

    public Good() {

    }
}