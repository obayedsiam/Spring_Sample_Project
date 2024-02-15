package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Writer {


    private String writerName = "Rahim";

//    @Autowired
    private Book writtenBook;


    public String getWriterName() {
        return writerName;
    }

//    @PostConstruct
//    private void init(){
//        this.setWriterName("Humayun Ahmed");
//        this.setWrittenBook(new Book());
//    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public Book getWrittenBook() {
        return writtenBook;
    }

    public void setWrittenBook(Book writtenBook) {
        this.writtenBook = writtenBook;
    }

}
