package com.xhustore.domain;

public class Goods {
    private Long id;

    private String name;

    private String type;

    private Float price;

    private String depict;

    private Integer amount;

    public Goods() {

    }

    public Goods(Long id, String name, String type, Float price, String depict, Integer amount) {
        super();
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.depict = depict;
        this.amount = amount;
    }

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

}
