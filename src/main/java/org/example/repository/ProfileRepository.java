package org.example.repository;

import org.example.databaseConnection.dbProfile;
import org.example.entities.ProfileEntity;

public class ProfileRepository {

    private dbProfile dbProfile = new dbProfile();

    public void register(ProfileEntity profileEntity) {
        if (profileEntity != null) dbProfile.write(profileEntity);
    }
}
