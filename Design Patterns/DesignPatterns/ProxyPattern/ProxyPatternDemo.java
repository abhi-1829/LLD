package DesignPatterns.ProxyPattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        EmployeeDaoProxy employeeDaoProxy = new EmployeeDaoProxy(EmployeeType.ADMIN);
        Employee swe = new SoftwareEngineer();
        Employee ds = new DataScientist();
        employeeDaoProxy.create(swe);
        employeeDaoProxy.create(ds);
        EmployeeDaoProxy employeeDaoProxy2 = new EmployeeDaoProxy(EmployeeType.NONADMIN);
        Employee swe1 = new SoftwareEngineer();
        employeeDaoProxy2.create(swe1);
    }
}
