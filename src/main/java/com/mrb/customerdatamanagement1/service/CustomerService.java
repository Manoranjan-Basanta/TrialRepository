package com.mrb.customerdatamanagement1.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.mrb.customerdatamanagement1.dto.CustomerDTO;
import com.mrb.customerdatamanagement1.dto.ResponseStructure;
import com.mrb.customerdatamanagement1.entity.Customer;
import com.mrb.customerdatamanagement1.repository.CustomerDAO;

@Service
public class CustomerService {
	@Autowired
	private CustomerDAO dao;
	
	public ResponseStructure<Customer> saveCustomer(CustomerDTO dto) {
		Customer cus=new Customer(dto);
		Customer customer = dao.saveCustomer(cus);
		ResponseStructure<Customer> rs = new ResponseStructure<>();
		rs.setData(customer);
		rs.setStatusCode(HttpStatus.OK.value());
		rs.setMessage("Customer data saved successfully");
		rs.setTimeStamp(LocalDateTime.now());
		return rs;
	}
	
	public ResponseStructure<Customer> updateCustomer(Customer customer) {
		Customer cus=dao.saveCustomer(customer);
		ResponseStructure<Customer> rs=new ResponseStructure<>();
		rs.setData(cus);
		rs.setStatusCode(HttpStatus.ACCEPTED.value());
		rs.setTimeStamp(LocalDateTime.now());
		rs.setMessage(HttpStatus.ACCEPTED.name());
		return rs;
	}
	
	public ResponseStructure<List<Customer>> getAllCustomerData() {
		List<Customer> list=dao.getAllCustomerData();
		ResponseStructure<List<Customer>> rs = new ResponseStructure<>();
		if(list.size()!=0) {
			rs.setStatusCode(HttpStatus.FOUND.value());
			rs.setData(list);
			rs.setTimeStamp(LocalDateTime.now());
			rs.setMessage("Customers entry found in database");
		}else {
			rs.setStatusCode(HttpStatus.NOT_FOUND.value());
			rs.setData(null);
			rs.setTimeStamp(LocalDateTime.now());
			rs.setMessage("No Customers entry found in database");
		}
		return rs;
	}
	
	public Customer getCustomerDataById(int id) {
		return dao.getCustomerDataById(id);
	}
	
	public Customer deleteCustomerDataById(int id) {
		return dao.deleteCustomerDataById(id);
	}
	
	public List<Customer> getCustomerByName(String name) {
		return dao.getCustomerByName(name);
	}
	
	public List<Customer> validateCustomer(String name, String email) {
		return dao.validateCustomer(name, email);
	}


}
