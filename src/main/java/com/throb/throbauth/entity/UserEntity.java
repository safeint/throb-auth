package com.throb.throbauth.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user", schema = "throb_cam")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 32)
    private String name;

    @Column(name = "password", nullable = false, length = 1024)
    private String password;

    @Column(name = "role_id", nullable = false)
    private Integer roleId;

    public Integer getRoleId() {
        return roleId;
    }

    public UserEntity setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserEntity setName(String name) {
        this.name = name;
        return this;
    }

    public Long getId() {
        return id;
    }

    public UserEntity setId(Long id) {
        this.id = id;
        return this;
    }
}