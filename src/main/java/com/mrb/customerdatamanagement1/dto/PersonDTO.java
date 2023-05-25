package com.mrb.customerdatamanagement1.dto;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class PersonDTO  implements Serializable{
  @Autowired
	private Integer id;
	private String name;
	private String email;
}
