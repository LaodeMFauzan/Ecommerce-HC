package com.hc.demo.service;

import com.hc.demo.model.ModuleModel;
import com.hc.demo.model.ModulesModel;
import com.hc.demo.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.Hashtable;

@Service
public class UserService {
    Hashtable<String, UserModel> userHashtable = new Hashtable<String, UserModel>();

    public UserService() {
        ModuleModel[] moduls = new ModuleModel[5];
        moduls[0] =  new ModuleModel(1,"Promo",1);
        ModulesModel modulesModel = new ModulesModel(moduls);

        UserModel userModel = new UserModel(modulesModel);

        userHashtable.put("1",userModel);
    }

    public UserModel getUser(String idUser){
        if (userHashtable.contains(idUser)){
            return userHashtable.get(idUser);
        }
        return null;
    }

    public Hashtable<String, UserModel> getAll(){
        return userHashtable;
    }
}
