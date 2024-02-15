package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;
import model.Comment;

@Service
public class CommentService {

    @Autowired
    private CommentNotificationProxy commentNotificationProxy;

    @Autowired
    private CommentRepository commentRepository;


    public CommentService(CommentNotificationProxy commentNotificationProxy, CommentRepository commentRepository) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
