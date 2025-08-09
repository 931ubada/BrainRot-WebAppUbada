package com.BrainrotWebApp.BrainRotBackend.Services;

import com.BrainrotWebApp.BrainRotBackend.Entities.Users;
import com.BrainrotWebApp.BrainRotBackend.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Users> getuserdetails()
    {
        return userRepository.findAll();
    }


    public Users insertintousers(Users users)
    {
        return userRepository.save(users);
    }

    public Users updateintousers(Users users, long id)
    {
        Users users1=userRepository.findById(id).orElse(null);
        users1.setUsername(users.getUsername());
        users1.setDate_of_Birth(users.getDate_of_Birth());
        users1.setEmail(users.getEmail());
        users1.setIs_active(users.getIs_active());
        users1.setCreated_at(users.getCreated_at());
        users1.setPassword_hash(users.getPassword_hash());
        users1.setTimezone(users.getTimezone());
        users1.setUpdated_at(users.getUpdated_at());
        return userRepository.save(users1);
    }

    public Users deleteintousers(long id)
    {
        Users users2=userRepository.findById(id).orElse(null);
        if(users2 != null)
        {
            userRepository.delete(users2);
        }
        return users2;
    }
}
