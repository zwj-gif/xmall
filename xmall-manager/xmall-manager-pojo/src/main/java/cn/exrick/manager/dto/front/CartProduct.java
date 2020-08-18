package cn.exrick.manager.dto.front;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Exrickx
 * 产品列表
 */
public class CartProduct implements Serializable{

    private Long productId;//产品id

    private BigDecimal salePrice;//销售价格

    private Long productNum;//产品数量

    private Long limitNum;//

    private String checked;

    private String productName;

    private String productImg;

    public Long getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Long limitNum) {
        this.limitNum = limitNum;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public Long getProductNum() {
        return productNum;
    }

    public void setProductNum(Long productNum) {
        this.productNum = productNum;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }
}
