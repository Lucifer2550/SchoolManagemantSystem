package com.Lucifer.Project.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Teacher {

	private Long id;
	private String name;
	private String phno;
	private String subject;
	private Double experience;
	private Long salary;
	private String qualification;
	private String email;
	private String classteacher;
	private String address;
	private String password;
}
