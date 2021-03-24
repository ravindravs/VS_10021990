package com.javatech.com.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "card")
@Data
public class Card implements Comparable<Card>{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column
    private String cardNumber;

    @Column
    private String bankName;

    @Column
    private String expiryDate;

    @Override
    public int compareTo(Card o) {
        if (getExpiryDate() == null || o.getExpiryDate() == null) {
            return 0;
        }
        return getExpiryDate().compareTo(o.getExpiryDate());
    }
}

