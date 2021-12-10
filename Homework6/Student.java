import java.util.Comparator;
import java.util.Date;

public class Student {
    private int id;
    private String name;
    private double gpa;
    private Date dateOfBirth;

    public Student(int id, String name, double gpa,  Date dateOfBirth){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.dateOfBirth = dateOfBirth;
    }

    public void setId(int id){
        this.id  = id;
    }
    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name  = name;
    }
    public String getName(){
        return name;
    }

    public void setGpa(double gpa){
        this.gpa  = gpa;
    }
    public double getGpa(){
        return gpa;
    }

    public void setDateOfBirth(Date birth){
        this.dateOfBirth  = birth;
    }
    public Date getDateOfBirth(){
        return dateOfBirth;
    }

    public static class NameComparator implements Comparator<Student> {
        @Override
        public int compare(Student t1, Student t2) {
            return t1.getName().compareTo(t2.getName());
        }
    }

    public static class GpaComparator implements Comparator<Student> {
        public int compare(Student t1, Student t2){
            return Double.compare(t1.getGpa(),t2.getGpa());
        }
    }

    public static class DateOfBirthComparator implements Comparator<Student> {

        @Override
        public int compare(Student t1, Student t2) {
            return t1.getDateOfBirth().compareTo(t2.getDateOfBirth());
        }
    }

    public String toString(){
        return this.id + " " + this.name+ " " + this.gpa+ " " + this.dateOfBirth;
    }


}