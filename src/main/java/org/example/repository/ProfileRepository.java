package org.example.repository;

import org.example.databaseConnection.dbProfile;
import org.example.entities.ProfileEntity;

import java.util.List;

public class ProfileRepository {

    private dbProfile dbProfile = new dbProfile();

    public String register(ProfileEntity profileEntity) {
        return dbProfile.write(profileEntity);
    }

    public List<ProfileEntity> getProfile(String phone, String password) {
        return dbProfile.readData().stream().
                filter(p -> p.getPhone().equals(phone) && p.getPassword().equals(password))
                .toList();
    }
}
