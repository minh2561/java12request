package com.example.trangthai.controller;

import com.example.trangthai.model.in.RoleIn;
import com.example.trangthai.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("Role")
@CrossOrigin("*")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping("")
    public ResponseEntity<?> getAll() {

        return new ResponseEntity<>(roleService.getAll(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<?>create(@RequestBody RoleIn RoleIn){
        return new ResponseEntity<>(roleService.create(RoleIn),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{Id_Role}")
    public ResponseEntity<?>delete(@PathVariable Integer Id_Role){
        return new ResponseEntity<>(roleService.delete(Id_Role),HttpStatus.OK);
    }

    @PutMapping("/update/{Id_Role}")
    public ResponseEntity<?>update(@PathVariable Integer Id_Role, @RequestBody RoleIn RoleIn){
        return new ResponseEntity<>(roleService.update(Id_Role, RoleIn),HttpStatus.OK);
    }
}
