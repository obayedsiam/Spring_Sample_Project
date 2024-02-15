package main;

import main.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"model", "proxies", "repositories", "services"})
public class ProjectConfig {

//    @Bean
//    Book book(){
//        var book = new Book();
//        book.setBookName("The Prophet");
//        return book;
//    }
//
//    @Bean
//    Writer writer(){
//        var writer  = new Writer();
//        writer.setWriterName("Abdullah Mahmud");
//        writer.setWrittenBook(book());
//        return writer;
//    }

}
