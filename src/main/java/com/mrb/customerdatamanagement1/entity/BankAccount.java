package com.mrb.customerdatamanagement1.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class BankAccount  implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="p_id")
	private Integer  pId;
	private String name;
	@Column(name="account_number")
	private  Long accountNumber;
	@ManyToOne
	@JoinColumn
	private Person person;
	
	
}
