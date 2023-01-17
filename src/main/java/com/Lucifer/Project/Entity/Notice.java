package com.Lucifer.Project.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Notice {

	private Long id;
	private String subject;
	private String message;
	private String producedby;
	private String rsvp;
}
