package com.backend.SyncIT.user;

import com.backend.SyncIT.user.dto.CreateUserDTO;
import com.backend.SyncIT.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/usuario")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<UserEntity>> endPointFindByID(@PathVariable Long id){
        Optional<UserEntity> user = userService.findByIDService(id);
        return ResponseEntity.ok().body(user);
    }

    @GetMapping()
    public ResponseEntity<List<UserEntity>> endPointGetAllUsers(){
        List<UserEntity> list = userService.getAllUsersService();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping()
    public ResponseEntity<CreateUserDTO> endPointCreateNewUser(@RequestBody CreateUserDTO objectRequest){
        CreateUserDTO objUser = userService.createUserService(objectRequest);
        return ResponseEntity.ok().body(objUser);
    }
}
