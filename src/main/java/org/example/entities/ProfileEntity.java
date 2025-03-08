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
   @NonNull
   private Double balance;
   @NonNull
   private ProfileRole role;
   public ProfileEntity(String name, String phone, String password, Short age) {
      this.name = name;
      this.phone = phone;
      this.password = password;
      this.age = age;
      this.balance = 0.0;
      this.role = ProfileRole.USER;
   }
}
