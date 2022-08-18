package com.example.trangthai.controller;

import com.example.trangthai.model.in.StatusIn;
import com.example.trangthai.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("Status")
@CrossOrigin("*")
public class StatusController {
    @Autowired
    private StatusService statusService;

    @GetMapping("")
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(statusService.getAll(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<?>create(@RequestBody StatusIn StatusIn){
        return new ResponseEntity<>(statusService.create(StatusIn),HttpStatus.CREATED);
    }

//    @DeleteMapping("/{Id_Status}")
//    public ResponseEntity<?>delete(@PathVariable Integer Id_Status){
//        return new ResponseEntity<>(statusService.delete(Id_Status),HttpStatus.OK);
//    }

    @PutMapping("/{Id_Status}")
    public ResponseEntity<?>update(@PathVariable Integer Id_Status, @RequestBody StatusIn StatusIn){
        return new ResponseEntity<>(statusService.update(Id_Status, StatusIn),HttpStatus.OK);
    }
}
