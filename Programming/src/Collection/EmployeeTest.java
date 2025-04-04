package EmployeeInfo;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
EmployeeData sujit =new EmployeeData(1,"Sujit",24,"It Department");
EmployeeData Ganesh =new EmployeeData(3,"Ganesh",32,"Hr department");
EmployeeData Sumit =new EmployeeData(2,"Sumit",29,"Data Analytic");

        List<EmployeeData> list=new LinkedList<>();
        list.add(sujit);
        list.add(Ganesh);
        list.add(Sumit);
        Collections.sort(list);
        Iterator<EmployeeData> itr= list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
