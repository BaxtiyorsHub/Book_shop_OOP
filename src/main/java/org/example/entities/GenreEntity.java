package org.example.entities;

import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class GenreEntity {
    private UUID id;
    private String nameUz;
    private String nameEng;
    private String nameRu;

    public GenreEntity(String nameUz, String nameEng, String nameRu) {
        this.nameUz = nameUz;
        this.nameEng = nameEng;
        this.nameRu = nameRu;
        this.id = UUID.randomUUID();
    }
}
