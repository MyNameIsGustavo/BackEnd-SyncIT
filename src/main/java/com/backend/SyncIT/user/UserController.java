package com.backend.SyncIT.user;

import com.backend.SyncIT.user.dto.CreateUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuario")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping()
    public ResponseEntity<CreateUserDTO> createNewUser(@RequestBody CreateUserDTO objectRequest){
        CreateUserDTO objUser = userService.createUser(objectRequest);
        return ResponseEntity.ok().body(objUser);
    }

}
