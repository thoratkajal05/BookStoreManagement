package com.example.BookStoreManagement;

import org.springframework.data.jpa.repository.JpaRepository;

public interface bookrepo extends JpaRepository<bookdetails,String> {
    
}

