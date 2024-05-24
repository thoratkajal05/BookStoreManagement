package com.example.BookStoreManagement;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class bookimplement implements bookservice{
    bookrepo repo;
    public bookimplement(bookrepo repo){
        this.repo = repo;
    }
    @Override
    public String createbook(bookdetails details) {
        // TODO Auto-generated method stub
        repo.save(details);
        return "book created";
        //throw new UnsupportedOperationException("Unimplemented method 'createbook'");
    }
    @Override
    public String updatebook(bookdetails details) {
        // TODO Auto-generated method stub
        repo.save(details);
        return "updated successfully";
        //throw new UnsupportedOperationException("Unimplemented method 'updatebook'");
    }
    @Override
    public String getbook(String bookid) {
        // TODO Auto-generated method stub
        repo.findById(bookid);
        return "success";
        //throw new UnsupportedOperationException("Unimplemented method 'getbook'");
    }
    @Override
    public String deletebook(String bookid) {
        // TODO Auto-generated method stub
        repo.deleteById(bookid);
        return "deleted successfully";
       // throw new UnsupportedOperationException("Unimplemented method 'deletebook'");
    }
    @Override
    public List<bookdetails> getallbookdetails() {
        // TODO Auto-generated method stub
        return repo.findAll();
        //throw new UnsupportedOperationException("Unimplemented method 'getallbookdetails'");
    }
    
    
}
