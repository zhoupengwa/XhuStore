package com.xhustore.dto;

public class GoodsDTO {
    private Long id;

    private String name;

    private String type;

    private Float price;

    private String depict;

    private Integer amount;

    private String firstImage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDepict() {
        return depict;
    }

    public void setDepict(String depict) {
        this.depict = depict;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getFirstImage() {
        return firstImage;
    }

    public void setFirstImage(String firstImage) {
        this.firstImage = firstImage;
    }

    @Override
    public String toString() {
        return "GoodsDTO [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", depict=" + depict
                + ", amount=" + amount + ", firstImage=" + firstImage + "]";
    }

}
