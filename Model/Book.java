package com.Sb.test.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "Book")
public class Book {
	@Id
	private int id;
	private String bookName;
	private String authorName;
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
}