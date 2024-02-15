package proxies;

import model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("e-mail")
public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending email comment notification : "+comment.getText());
    }
}
