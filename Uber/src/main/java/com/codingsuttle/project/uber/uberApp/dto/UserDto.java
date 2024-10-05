package com.codingsuttle.project.uber.uberApp.dto;

import com.codingsuttle.project.uber.uberApp.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String name;
    private String  email;
    private Set<Role> roles;
}
