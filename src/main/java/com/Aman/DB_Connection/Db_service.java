package com.Aman.DB_Connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Db_service {

    @Autowired
    Db_repository objrepo;

    public void addStudent(book Book)throws Exception{
        if(objrepo.findById(Book.getId()).get()!=null){
            throw new Exception("Book is already present");
        }
        else{
            objrepo.save(Book);
        }
    }
    public book getstudent(int id){
        return objrepo.findById(id).get();
    }
    public void update_book(update_book ub){
        book B = objrepo.findById(ub.getId()).get();
        B.setPages(ub.getPages());
        objrepo.save(B);
    }
}
