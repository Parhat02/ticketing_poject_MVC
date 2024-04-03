package org.cydeo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.cydeo.enums.Gender;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class User extends BaseEntity{

    private String firstName;
    private String LastName;
    private String userName;
    private String password;
    private boolean enabled;
    private String phone;
    private Role role;
    private Gender gender;

    public User(Long id, LocalDateTime insertDateTime, Long insertUserId, LocalDateTime lastUpdatedTime,
                Long lastUpdatedUserId, String firstName, String lastName, String userName, String password,
                boolean enabled, String phone, Role role, Gender gender) {

        super(id, insertDateTime, insertUserId, lastUpdatedTime, lastUpdatedUserId);
        this.firstName = firstName;
        LastName = lastName;
        this.userName = userName;
        this.password = password;
        this.enabled = enabled;
        this.phone = phone;
        this.role = role;
        this.gender = gender;

    }
}
