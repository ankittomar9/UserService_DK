package com.company.userservice_dk.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Role extends BaseModel {
    private Long id;
    private String value;

}
