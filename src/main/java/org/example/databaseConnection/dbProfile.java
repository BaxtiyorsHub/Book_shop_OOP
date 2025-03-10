package org.example.databaseConnection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entities.ProfileEntity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class dbProfile {
    private File file = new File("profile.json");
    private ObjectMapper objectMapper = new ObjectMapper();

    public void write(ProfileEntity profileEntity) {
        List<ProfileEntity> profileEntities = new ArrayList<>();
        profileEntities.add(profileEntity);
        write(profileEntities);
    }

    public void write(List<ProfileEntity> profileEntityList) {
        List<ProfileEntity> registedProfile = readData();
        registedProfile.addAll(profileEntityList);
        try {
            objectMapper.writeValue(file, registedProfile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<ProfileEntity> readData() {
        List<ProfileEntity> profiles = new ArrayList<>();
        try {
            List<ProfileEntity> profileEntities = objectMapper.readValue(file, new TypeReference<List<ProfileEntity>>() {
            });
            if (profileEntities.isEmpty()) return new ArrayList<>();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return profiles;
    }
}
