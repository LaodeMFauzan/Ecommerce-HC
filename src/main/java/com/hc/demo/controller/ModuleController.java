package com.hc.demo.controller;

import com.hc.demo.model.ModuleModel;
import com.hc.demo.repository.ModuleRepository;
import com.hc.demo.repository.UserRepository;
import com.hc.demo.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/module")
public class ModuleController {

    @Autowired
    private ModuleService service;


  @GetMapping("/")
    public String get() {
        return "hello dimwit";
    }

    @RequestMapping("/all")
    public List<ModuleModel> getAll(){
        return service.getAll();
    }

    @RequestMapping("{id}")
    public ModuleModel getModule(@PathVariable("id") Long id){
        return service.getModule(id);
    }

    @RequestMapping("/user/{user_id}")
    public List<ModuleModel> getModuleByUserId(@PathVariable("user_id") Long user_id){
        return service.getModuleByUserId(user_id);
    }

}
