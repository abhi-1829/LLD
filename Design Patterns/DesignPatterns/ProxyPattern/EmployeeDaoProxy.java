package DesignPatterns.ProxyPattern;

import java.util.List;

public class EmployeeDaoProxy implements EmployeeDao{
    private final EmployeeDao employeeDao;
    EmployeeType employeeType;
    EmployeeDaoProxy(EmployeeType employeeType) {
        this.employeeType = employeeType;
        employeeDao = EmployeeDaoImpl.getInstance();
    }

    @Override
    public void create(Employee employee) {
        switch (employeeType) {
            case ADMIN :
                employeeDao.create(employee);
                break;
            case NONADMIN:
                System.out.println("Access denied, you are not an admin");
                break;
            default:
                System.out.println("Not present");
                break;
        }
    }
}
