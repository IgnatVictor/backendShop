package com.shop.victor.profile;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.event.PublicInvocationEvent;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    @Autowired
    ProfileRepository profileRepository;

    public void UpdateProfile(Profile profile) {
        if (profileRepository.findByUserId(profile.getUserId()) == null) {
            profileRepository.save(profile);
        } else {
            profileRepository.findByUserId(profile.getUserId()).setCountry(profile.getName());
            profileRepository.findByUserId(profile.getUserId()).setPhoneNumber(profile.getPhoneNumber());
            profileRepository.findByUserId(profile.getUserId()).setAdress1(profile.getAdress1());
            profileRepository.findByUserId(profile.getUserId()).setAdress2(profile.getAdress2());
            profileRepository.findByUserId(profile.getUserId()).setPostcode(profile.getPostcode());
            profileRepository.findByUserId(profile.getUserId()).setState(profile.getState());
            profileRepository.findByUserId(profile.getUserId()).setPictureLink(profile.getPictureLink());
            profileRepository.findByUserId(profile.getUserId()).setUsername(profile.getUsername());
            profileRepository.findByUserId(profile.getUserId()).setEmail(profile.getEmail());
            profileRepository.findByUserId(profile.getUserId()).setCountry(profile.getCountry());
        }




    }

    public Profile getProfile(Integer userId) {
        return profileRepository.findByUserId(userId);
    }

}
