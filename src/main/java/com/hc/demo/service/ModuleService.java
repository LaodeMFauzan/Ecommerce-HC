package com.hc.demo.service;

import com.hc.demo.model.ModuleModel;
import com.hc.demo.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ModuleService {
    private final ModuleRepository moduleRepository;

    @Autowired
    public ModuleService(ModuleRepository moduleRepository) {
        this.moduleRepository = moduleRepository;
    }

    public List<ModuleModel> getAll(){
        return moduleRepository.findAll();
    }

    public ModuleModel getModule(Long idModule){
        if (moduleRepository.existsById(idModule)){
            return moduleRepository.getOne(idModule);
        }
        return null;
    }

    public List<ModuleModel> getModuleByUserId(Long userId){
        List<ModuleModel> moduleModels = moduleRepository.findAll();
        moduleModels.removeIf(moduleModel -> !moduleModel.getUsers().getId().equals(userId));
        return moduleModels;
    }

}
