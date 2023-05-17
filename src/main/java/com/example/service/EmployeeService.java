package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeService {
    // Repositoryをフィールドに用意する
    private final EmployeeRepository employeeRepository;

    // コンストラクタでRepositoryをインジェクションします
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    // ビジネスロジック用のメソッドを以降に定義します

    public List<Employee> findAllEmployee() {
    	return this.employeeRepository.findAll();
    }
}