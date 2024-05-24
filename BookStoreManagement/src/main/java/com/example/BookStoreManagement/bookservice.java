package com.example.BookStoreManagement;

import java.util.List;

public interface bookservice {
    public String createbook(bookdetails details);
    public String updatebook(bookdetails details);
    public String getbook(String bookid);
    public String deletebook(String bookid);
    public List<bookdetails>getallbookdetails();

}
