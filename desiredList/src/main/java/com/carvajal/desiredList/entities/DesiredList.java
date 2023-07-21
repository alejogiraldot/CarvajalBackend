package com.carvajal.desiredList.entities;

import jakarta.persistence.*;

@Entity
@Table(name="desiredList")
public class DesiredList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private long userId;

    private long productId;


    public DesiredList(){}

    public DesiredList(long id, long userId, long productId) {
        Id = id;
        this.userId = userId;
        this.productId = productId;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }
}
