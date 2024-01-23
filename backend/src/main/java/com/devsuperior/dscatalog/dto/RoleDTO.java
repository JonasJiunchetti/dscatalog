package com.devsuperior.dscatalog.dto;

import com.devsuperior.dscatalog.entities.Role;

public class RoleDTO {
    
    private long id;
    private String authority;

    public RoleDTO() {
    }

    public RoleDTO(long id, String authority) {
        this.id = id;
        this.authority = authority;
    }

    public RoleDTO(Role entity) {
        id = entity.getId();
        authority = entity.getAuthority();
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getAuthority() {
        return this.authority;
    }

    public void setAuthority(String authority){
        this.authority = authority;
    }
    
}
