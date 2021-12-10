import java.util.*;

public class HW6_Main {
    public static void main(String[] args){
        Student t1 = new Student(1,"YZ",4.0,new Date(1998,02,07));
        Student t2 = new Student(2,"BA",2.0,new Date(1988,07,06));
        Student t3 = new Student(3,"AQZ",3.0,new Date(1997,11,11));
        Student t4 = new Student(4,"DY",3.2,new Date(1990,03,23));
        Student t5 = new Student(5,"CN",2.9,new Date(2000,05,21));
        Student t6 = new Student(6,"EY",3.8,new Date(1998,02,03));

        List<Student> list = new ArrayList<Student>();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        list.add(t5);
        list.add(t6);

        Student.NameComparator sortByName = new Student.NameComparator();
        Student.GpaComparator sortByGpa = new Student.GpaComparator();
        Student.DateOfBirthComparator sortByBirth = new Student.DateOfBirthComparator();

        Collections.sort(list, sortByName);
        System.out.println("--------------Sort by Names--------------");
        for(Student t : list){
            System.out.println(t.toString());
        }

        System.out.println();
        Collections.sort(list, sortByGpa);
        System.out.println("--------------Sort by GPA--------------");
        for(Student t : list){
            System.out.println(t.toString());
        }

        System.out.println();
        Collections.sort(list, sortByBirth);
        System.out.println("--------------Sort by Date of Birth--------------");
        for(Student t : list){
            System.out.println(t.toString());
        }
    }
}