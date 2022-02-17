package com.shop.victor.profile;

import lombok.*;

import javax.persistence.*;


@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String sunName;
    private Integer phoneNumber;
    private String adress1;
    private String adress2;
    private Integer postcode;
    private String state;
    private String pictureLink;
    private String username;
    private String email;
    private String country;
    private Integer userId;

    public Profile(String username, String email, Integer userId) {
        this.username = username;
        this.email = email;
        this.userId = userId;
    }



}