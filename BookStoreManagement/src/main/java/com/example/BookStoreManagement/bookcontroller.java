package com.example.BookStoreManagement;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookdetails")
public class bookcontroller {
    bookservice service;

    public bookcontroller(bookservice service){
        this.service=service;
    }
    @GetMapping("{bookid}")
    public String getbookdetails(@PathVariable("bookid") String bookid){
        return service.getbook(bookid);
    }
    
    @PostMapping
    public String createbookdetails(@RequestBody bookdetails details){
        service.createbook(details);
        return "created successfully";
    }
    @PutMapping
    public String updatebookdetails(@RequestBody bookdetails details){
        service.updatebook(details);
        return "updated successfully";
    }
    @DeleteMapping("{bookid}")
    public String deletebookdetails(@PathVariable("bookid")String bookid){
        service.deletebook(null);
        return "deleted successfully";
    }

}
