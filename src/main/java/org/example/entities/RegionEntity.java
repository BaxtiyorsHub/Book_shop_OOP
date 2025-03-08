package org.example.entities;

import java.util.UUID;

public class RegionEntity {
    private UUID regionId;
    private String nameUz;
    private String nameRu;
    private String nameEn;

    public RegionEntity(String nameUz, String nameEng, String nameRu) {
        this.nameUz = nameUz;
        this.nameEn = nameEng;
        this.nameRu = nameRu;
        this.regionId = UUID.randomUUID();
    }
}
