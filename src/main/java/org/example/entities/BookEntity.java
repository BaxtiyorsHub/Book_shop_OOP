package org.example.entities;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class BookEntity extends BaseEntity {
    private String title;
    private String authorName;
    private Integer year;
    private Double price;
    private RegionEntity regionEntity;
    private List<GenreEntity> genres;
    private ProfileEntity profile;
}
