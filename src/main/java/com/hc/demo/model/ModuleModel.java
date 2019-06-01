package com.hc.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "module")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
public class ModuleModel {

    @Id
    private Integer id;

    private String moduleName;

    private int moduleOrder;

    public ModuleModel(Integer id, String moduleName, int moduleOrder) {
        this.id = id;
        this.moduleName = moduleName;
        this.moduleOrder = moduleOrder;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public int getModuleOrder() {
        return moduleOrder;
    }

    public void setModuleOrder(int moduleOrder) {
        this.moduleOrder = moduleOrder;
    }
}
