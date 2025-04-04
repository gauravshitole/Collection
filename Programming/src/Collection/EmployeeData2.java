package EmployeeInfo;

import java.util.Comparator;

public class EmployeeData2 implements Comparator<EmployeeData2> {
    private final int EmpId;
    private final String EmployeeName;
    private final int EmpAge;
    private final String Department;

    public EmployeeData2(int empId, String employeeName, int empAge, String department) {
        EmpId = empId;
        EmployeeName = employeeName;
        EmpAge = empAge;
        Department = department;
    }

    @Override
    public String toString() {
        return "EmployeeData{" +
                "EmpId=" + EmpId +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", EmpAge=" + EmpAge +
                ", Department='" + Department + '\'' +
                '}';
    }

    @Override
    public int compare(EmployeeData2 employeeData2, EmployeeData2 employeeData1) {
        return Integer.compare(employeeData2.EmpId,employeeData1.EmpId);
    }
}
