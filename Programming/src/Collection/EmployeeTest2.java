package EmployeeInfo;

import java.util.*;

public class EmployeeTest2 {
    public static void main(String[] args) {
        EmployeeData2 sujit =new EmployeeData2(1,"Sujit",24,"It Department");
        EmployeeData2 Ganesh =new EmployeeData2(3,"Ganesh",32,"Hr department");
        EmployeeData2 Sumit =new EmployeeData2(2,"Sumit",29,"Data Analytic");

        List<EmployeeData2> list1=new LinkedList<>();
        list1.add(sujit);
        list1.add(Ganesh);
        list1.add(Sumit);
        Collections.sort(list1, Comparator.comparing(EmployeeData2::toString));
        Iterator<EmployeeData2> itr= list1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
