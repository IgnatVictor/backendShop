package com.shop.victor.profile;

import com.shop.victor.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;




@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {


    Profile getProfileByUserId(Integer id) ;
    Profile getProfileByUsername(String username);



}
