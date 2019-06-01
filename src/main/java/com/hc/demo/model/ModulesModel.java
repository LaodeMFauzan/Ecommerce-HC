package com.hc.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "modules")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
public class ModulesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private ModuleModel[] moduleModels;

    public ModulesModel(ModuleModel[] moduleModels) {
        this.moduleModels = moduleModels;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ModuleModel[] getModuleModels() {
        return moduleModels;
    }

    public void setModuleModels(ModuleModel[] moduleModels) {
        this.moduleModels = moduleModels;
    }
}
