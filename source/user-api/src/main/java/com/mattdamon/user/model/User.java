package com.mattdamon.user.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4725590899120827366L;

	@Setter
	@Getter
	private String name;

	@Setter
	@Getter
	private int age;
}
