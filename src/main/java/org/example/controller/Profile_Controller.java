package org.example.controller;

import org.example.requests.ProfileRequest;
import org.example.sevice.ProfileService;

public class Profile_Controller {

    private ProfileService profile_service = new ProfileService();

    public void register(ProfileRequest request) {
        if (request != null) profile_service.register(request);
    }
}
