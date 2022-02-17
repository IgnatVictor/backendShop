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
    private String userUser;
    private String userEmail;
    private String country;
    private Integer userId;

    public Profile(String username, String email, Integer userId) {
        this.userUser = username;
        this.userEmail = email;
        this.userId = userId;
    }



}