package com.pradeep.jotdown.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Notes {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long notesId;
	
	private String topic;
	private String subTopic;
	private String heading;
	@Lob
	private String description;
	@Lob
	private String example;
	@Lob
	private String codeSnippet;
	@Lob
	private String comments;
	public long getNotesId() {
		return notesId;
	}
	public void setNotesId(long notesId) {
		this.notesId = notesId;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getSubTopic() {
		return subTopic;
	}
	public void setSubTopic(String subTopic) {
		this.subTopic = subTopic;
	}
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getExample() {
		return example;
	}
	public void setExample(String example) {
		this.example = example;
	}
	public String getCodeSnippet() {
		return codeSnippet;
	}
	public void setCodeSnippet(String codeSnippet) {
		this.codeSnippet = codeSnippet;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
