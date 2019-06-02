package com.hc.demo.service;

import com.hc.demo.model.UserModel;
import com.hc.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserModel getUser(Long idUser){
        if (userRepository.existsById(idUser)){
            return userRepository.getOne(idUser);
        }
        return null;
    }

    public List<UserModel> getAll(){
        return userRepository.findAll();
    }
}
