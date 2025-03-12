package org.example.repository;

import org.example.databaseConnection.dbProfile;
import org.example.entities.ProfileEntity;

import java.util.List;

public class ProfileRepository {

    private dbProfile dbProfile = new dbProfile();

    public void register(ProfileEntity profileEntity) {
        if (profileEntity != null) dbProfile.write(profileEntity);
    }

    public List<ProfileEntity> getProfile(String phone, String password) {
        List<ProfileEntity> list = dbProfile.readData().stream().
                filter(p -> p.getPhone().equals(phone) && p.getPassword().equals(password))
                .toList();
    }
}
