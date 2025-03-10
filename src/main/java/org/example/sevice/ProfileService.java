package org.example.sevice;

import org.example.entities.ProfileEntity;
import org.example.exp.ProfileIncorrectException;
import org.example.repository.ProfileRepository;
import org.example.requests.ProfileRequest;

public class ProfileService {

    private ProfileRepository profileRepository = new ProfileRepository();

    public void register(ProfileRequest request) throws ProfileIncorrectException {
        checkRequest(request);
        ProfileEntity profileEntity = new ProfileEntity(
                request.name(),
                request.phone(),
                request.password(),
                request.age()
        );;
        profileRepository.register(profileEntity);
    }

    private void checkRequest(ProfileRequest request) throws ProfileIncorrectException{
        if (request.age() == null) throw new ProfileIncorrectException("Age is null");
        if (request.name() == null) throw new ProfileIncorrectException("Name is null");
        if (request.phone() == null) throw new ProfileIncorrectException("Phone is null");
        if (request.password() == null) throw new ProfileIncorrectException("Password is null");
    }
}
