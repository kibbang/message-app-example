package app.messages;

import org.apache.commons.logging.*;

public class MessageRepository {

    private final static Log log = LogFactory.getLog(MessageRepository.class);

    public void saveMessage(Message message) {
        // DB에 메시지 저장
        log.info("Saved message: " + message.getText());
    }
 }
