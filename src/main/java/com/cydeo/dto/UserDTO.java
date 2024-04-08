package com.cydeo.dto;

import com.cydeo.Emum.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private boolean enable;
    private String phone;
    private RoleDTO roleDTO;
    private Gender gender;

}
