package br.avcaliani.cache.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class UserService implements Serializable {

    @Autowired
    private UserRepository repository;

    public List<User> find() {
        return repository.find();
    }

}
