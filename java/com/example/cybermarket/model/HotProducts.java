package com.example.cybermarket.model;

public class HotProducts {
    Integer id;
    Integer image;

    public HotProducts(Integer id, Integer image) {
        this.id = id;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
