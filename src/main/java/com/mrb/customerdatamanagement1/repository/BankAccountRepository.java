package com.mrb.customerdatamanagement1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrb.customerdatamanagement1.entity.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Integer>{

}
