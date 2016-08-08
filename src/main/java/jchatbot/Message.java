package jchatbot;

import java.util.Date;

public class Message {

	private String name;
	private String content;
	private Date dateTime;

	public Message() {
	}

	public Message(String name, String content, Date dateTime) {
		this.name = name;
		this.content = content;
		this.dateTime = dateTime;
	}

	public String getContent() {
		return content;
	}

	public String getName() {
		return name;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public Date getDateTime() {
		return dateTime;
	}

	@Override
	public String toString() {
		return "Message [name=" + name + ", content=" + content + "]";
	}

}
