package com.Aman.DB_Connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Db_Controller {

    @Autowired
    Db_service  objservice;
    @PostMapping("/add_book")
    public void add_student(@RequestBody() book Book){
        try{objservice.addStudent(Book);}
        catch(Exception e){
            System.out.println(e);
        }
    }
    @GetMapping("/get_book")
    public book getStudent(@RequestParam("id") int id){
        return objservice.getstudent(id);
    }
    @PutMapping("/Update_book")
    public void updateBook(@RequestBody() update_book ub){
        objservice.update_book(ub);
    }
}
