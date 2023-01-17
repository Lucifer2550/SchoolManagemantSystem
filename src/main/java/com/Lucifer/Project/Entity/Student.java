package com.Lucifer.Project.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {

	private Long id;
	private String name;
	private String phno;
	private String address;
	private String email;
	private String grades;
	private String classno;
	private String parentphno;
}
