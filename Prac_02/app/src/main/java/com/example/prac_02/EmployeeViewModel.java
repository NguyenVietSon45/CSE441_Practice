package com.example.prac_02;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class EmployeeViewModel extends ViewModel {
    private final MutableLiveData<List<Employee>> employees = new MutableLiveData<>();

    public LiveData<List<Employee>> getEmployees() {
        return employees;
    }

    public void loadEmployees() {
        // Giả lập dữ liệu, có thể thay thế bằng dữ liệu từ API hoặc cơ sở dữ liệu
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Nguyễn Văn A", "Lập trình viên"));
        employeeList.add(new Employee(2, "Trần Thị B", "Thiết kế"));
        employeeList.add(new Employee(3, "Lê Văn C", "Quản lý dự án"));
        employees.setValue(employeeList);
    }
}
