package jchatbot;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
	protected final Logger log = LoggerFactory.getLogger(getClass());

	@MessageMapping("/message")
	@SendTo("/topic/messages")
	public Message message(Message message) throws Exception {
		log.info(message.toString());
		Message re = new Message(message.getName(), message.getContent(), new Date());
		return re;
	}
}
