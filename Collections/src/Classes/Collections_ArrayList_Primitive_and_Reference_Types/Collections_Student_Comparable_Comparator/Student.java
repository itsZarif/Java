package Classes.Collections_ArrayList_Primitive_and_Reference_Types.Collections_Student_Comparable_Comparator;

import java.util.Comparator;

public class Student implements Comparable<Student>{ //Comparable<ClassName> interface is used to compare classes

    String name;
    double cgpa;

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() { //Override toString() method to print our own object in your own way while printing in sout

        return "{Name: " + name + ", CGPA: " + cgpa + "}";

    }

    // compareTo(ClassName c) compares the parameter object with the object of this class
    // returns a integer that shows which object is bigger or smaller
    // +ve means this object is larger than parameter object, -ve means parameter object is greater, 0 means equal
    // compares by cgpa
    public int compareTo(Student s)
    {
        if(this.cgpa > s.cgpa) return 1;
        else if(this.cgpa < s.cgpa) return -1;
        else return 0;
    }
}

