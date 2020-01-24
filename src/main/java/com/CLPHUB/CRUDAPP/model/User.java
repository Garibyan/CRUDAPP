package com.CLPHUB.CRUDAPP.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "birthdate")
    private String birthDate;
    @Column(name = "pid")
    private Long pId;
    @Column(name = "address")
    private String address;

}
