package com.BrainrotWebApp.BrainRotBackend.Controllers;

import com.BrainrotWebApp.BrainRotBackend.Entities.Users;
import com.BrainrotWebApp.BrainRotBackend.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Brain/Rot")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("onlyget")
    public ResponseEntity<List<Users>> getuserdetails()
    {
        return ResponseEntity.ok(userService.getuserdetails());
    }

    @PostMapping
    public ResponseEntity<Users> insertintousers(@RequestBody Users users)
    {
        return ResponseEntity.ok(userService.insertintousers(users));
    }

    @PutMapping("{id}")
    public ResponseEntity<Users> updateintousers(@RequestBody Users users, @PathVariable long id)
    {
        return ResponseEntity.ok(userService.updateintousers(users, id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Users> deleteintousers(@PathVariable long id)
    {
        return ResponseEntity.ok(userService.deleteintousers(id));
    }
}
