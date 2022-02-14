package com.shop.victor.profile;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/profile")
public class ProfileController {


    private ProfileService profileService;

    @PostMapping("/changeProfile")
    public void changeProfile(@RequestBody Profile profile) {
        profileService.UpdateProfile(profile);
    }

    @GetMapping("/getProfile")
    public Profile getProfile(@RequestParam(name="userId", required = true) String userId) {
        Integer userID = Integer.parseInt(userId);
        return profileService.getProfile(userID);
    }

}
