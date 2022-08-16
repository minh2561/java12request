package com.example.trangthai.controller;

import com.example.trangthai.model.in.UserIn;
import com.example.trangthai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("Controller")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<?>create(@RequestBody UserIn UserIn){
        return new ResponseEntity<>(userService.create(UserIn),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{Id_User}")
    public ResponseEntity<?>delete(@PathVariable Integer Id_User){
        return new ResponseEntity<>(userService.delete(Id_User),HttpStatus.OK);
    }

    @PutMapping("/update/{Id_User}")
    public ResponseEntity<?>update(@PathVariable Integer Id_User, @RequestBody UserIn UserIn){
        return new ResponseEntity<>(userService.update(Id_User, UserIn),HttpStatus.OK);
    }
}
