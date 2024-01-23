package com.devsuperior.dscatalog.dto;

import java.util.HashSet;
import java.util.Set;

import com.devsuperior.dscatalog.entities.Role;
import com.devsuperior.dscatalog.entities.User;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserDTO {

    private long id;

    @NotBlank(message = "Required field")
    private String firstName;
    private String lastName;

    @Email(message = "Invalid Email")
    private String email;   

    Set<RoleDTO> roles = new HashSet<>();

    public UserDTO() {
    }

    public UserDTO(long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public UserDTO(User entity) {
        id = entity.getId();
        firstName = entity.getFirstName();
        lastName = entity.getLastName();
        email = entity.getEmail();

        for(Role role : entity.getRoles()) {
            roles.add(new RoleDTO(role));
        }
    }

    public long getId() {
        return id;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String mail) {
        this.email = mail;
    }

    public Set<RoleDTO> getRoles() {
        return roles;
    }
    
}
