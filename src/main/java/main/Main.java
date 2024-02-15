package main;

import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Comment comment = new Comment();
        comment.setAuthor("Rahim");
        comment.setText("Hello ! How are you ?");

        CommentService service = context.getBean(CommentService.class);

//        CommentRepository repository = new DBCommentRepository();
//        CommentNotificationProxy proxy = new EmailCommentNotificationProxy();
//        CommentService service = new CommentService(proxy, repository);

        service.publishComment(comment);




//        Book book = context.getBean(Book.class);
//        Writer writer = context.getBean(Writer.class);

//        System.out.println("Book Name : "+book);
//        System.out.println("Writer Name :"+writer.getWriterName());
//        System.out.println("Writer's Book Name :"+writer.getWrittenBook().getBookName());


//        Book book = context.getBean("book", Book.class);
//        System.out.println(book.getBookName());
//
//        Book book2 = context.getBean("book2", Book.class);
//        System.out.println(book2.getBookName());
//
//        String string = context.getBean(String.class);
//        System.out.println(string);
//
//        Integer integer = context.getBean(Integer.class);
//        System.out.println(integer);
    }
}
