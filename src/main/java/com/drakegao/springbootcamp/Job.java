package com.drakegao.springbootcamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Job {
	@Id // primary key
	@GeneratedValue(strategy=GenerationType.AUTO) // auto increment
	private long id;
	
	@NotNull
	@Size(min=3)
	private String title;
	
	@NotNull
	@Size(min=4)
	private String employer;
	
	@NotNull
	@Size(min=10)
	private String description;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
