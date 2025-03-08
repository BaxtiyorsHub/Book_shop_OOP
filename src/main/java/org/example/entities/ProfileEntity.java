package org.example.entities;

import lombok.*;
import org.example.enums.ProfileRole;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter

public class ProfileEntity extends BaseEntity {
   private String name;
   private String phone;
   private String password;
   private Short age;
   private Double balance;
   private ProfileRole role;
}
