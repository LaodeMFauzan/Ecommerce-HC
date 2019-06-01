package com.hc.demo.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;

    private ModulesModel moduls;

    public UserModel(ModulesModel moduls) {
        this.moduls = moduls;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ModulesModel getModuls() {
        return moduls;
    }

    public void setModuls(ModulesModel moduls) {
        this.moduls = moduls;
    }
}
