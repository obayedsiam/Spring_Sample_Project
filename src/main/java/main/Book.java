package main;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Book {

    private String bookName = "Book 1";

//    @PostConstruct
//    public void init(){
//        this.bookName = "Opekkha";
//    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }




}
