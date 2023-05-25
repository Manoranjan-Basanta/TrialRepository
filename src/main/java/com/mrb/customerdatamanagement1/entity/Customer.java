package com.mrb.customerdatamanagement1.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mrb.customerdatamanagement1.dto.CustomerDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //(from lombok) used to remove repeated code
@NoArgsConstructor //to create no args constructor
@AllArgsConstructor //to create args constructor
@Entity
@Table(name = "customer_infor")
public class Customer implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false)
	private String name;
	private String email;
	
	public Customer(CustomerDTO dto) {
		this.id=dto.getId();
		this.name=dto.getName();
		this.email=dto.getEmail();
	}

}
