package org.example.repository;

import org.example.databaseConnection.dbProfile;
import org.example.entities.ProfileEntity;

import java.util.List;

public class ProfileRepository {

    private dbProfile dbProfile = new dbProfile();

    public String register(ProfileEntity profileEntity) {
        return dbProfile.write(profileEntity);
    }

    public ProfileEntity getProfile(String phone, String password) {
        List<ProfileEntity> profileEntities = dbProfile.readData();
        for (ProfileEntity profileEntity : profileEntities) {
            if (profileEntity.getPhone().equals(phone) && profileEntity.getPassword().equals(password)) {
                return profileEntity;
            }
        }
        return null;
    }
}
