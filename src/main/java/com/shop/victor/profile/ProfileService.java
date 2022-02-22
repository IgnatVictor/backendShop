package com.shop.victor.profile;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    @Autowired
    ProfileRepository profileRepository;

    public void UpdateProfile(Profile profile) {

        if (profileRepository.getProfileByUserId(profile.getUserId()) == null) {

            profileRepository.save(profile);
        } else {
            System.out.println(profile.toString());
            Profile profileModified = profileRepository.getProfileByUserId(profile.getUserId());
            if(profile.getName() != "") {
                profileModified.setName(profile.getName());
            }
            if(profile.getSunName() != "") {
                profileModified.setSunName(profile.getSunName());
            }
            if(profile.getPhoneNumber() != null) {
                profileModified.setPhoneNumber(profile.getPhoneNumber());
            }
            if(profile.getAdress1() != "") {
                profileModified.setAdress1(profile.getAdress1());
            }
            if(profile.getAdress2() != "") {
                profileModified.setAdress2(profile.getAdress2());
            }
            if(profile.getPostcode() != null) {
                profileModified.setPostcode(profile.getPostcode());
            }
            if(profile.getState() != "") {
                profileModified.setState(profile.getState());
            }
            if(profile.getPictureLink() != "") {
                profileModified.setPictureLink(profile.getPictureLink());
            }
            if(profile.getUsername() != "") {
                profileModified.setUsername(profile.getUsername());
            }
            if(profile.getEmail() != "") {
                profileModified.setEmail(profile.getEmail());
            }
            if(profile.getCountry() != "") {
                profileModified.setCountry(profile.getCountry());
            }

            profileRepository.save(profileModified);
        }




    }

    public Profile getProfile(Integer userId) {

        return profileRepository.getProfileByUserId(userId);
    }

}