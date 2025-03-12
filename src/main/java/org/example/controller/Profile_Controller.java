package org.example.controller;

import org.example.entities.ProfileEntity;
import org.example.exp.ProfileIncorrectException;
import org.example.requests.ProfileRequest;
import org.example.sevice.ProfileService;

public class Profile_Controller {

    private ProfileService profile_service = new ProfileService();

    public String register(ProfileRequest request) throws ProfileIncorrectException {
        return profile_service.register(request);
    }

    public ProfileEntity login(String phone, String password) throws ProfileIncorrectException {
        return profile_service.login(phone, password);
    }
}
