package EmployeeInfo;

public class EmployeeData implements Comparable<EmployeeData>{
    private final int EmpId;
    private final String EmployeeName;
    private final int EmpAge;
    private final String Department;

    public EmployeeData(int empId, String employeeName, int empAge, String department) {
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
    public int compareTo(EmployeeData employeeData) {
        return Integer.compare(this.EmpId,employeeData.EmpId);
    }
}
