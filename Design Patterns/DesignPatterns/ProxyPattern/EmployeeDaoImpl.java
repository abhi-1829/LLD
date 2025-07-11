package DesignPatterns.ProxyPattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{
    private static volatile EmployeeDaoImpl instance;
    List<Employee> employeeList;
    private EmployeeDaoImpl() {
        employeeList = new ArrayList<>();
    }
    public static EmployeeDaoImpl getInstance() {
        if (instance == null) {
            synchronized (EmployeeDaoImpl.class) {
                if (instance == null) {
                    instance = new EmployeeDaoImpl();
                }
            }
        }
        return instance;
    }

    @Override
    public void create(Employee employee) {
        employeeList.add(employee);
        System.out.println("Employee added");
    }
}
