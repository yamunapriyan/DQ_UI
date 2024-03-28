package com.sampleProject;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {

    String name;
    String emailId;
    String password;


}
