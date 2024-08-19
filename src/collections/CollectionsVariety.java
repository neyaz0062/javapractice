package collections;

import java.util.*;

public class CollectionsVariety {
    public static void main(String[] args) {

        Vector v = new Vector();
        v.add("Neyaz");
        v.add(7);
        v.add('w');

        for(Object o : v){
            System.out.print(o+" ");
        }

        Stack s = new Stack();
        s.push(9);
        s.push(7);
        s.push(6);

        Collections.sort(s);

        while(!s.empty()){
            System.out.print(s.pop()+" ");
        }

        System.out.println();
        List l = new ArrayList();

        l.add(new Student(1, "Dolly", 15));
        l.add(new Student(3, "Jack", 25));
        l.add(new Student(2, "Abhi", 14));

        Collections.sort(l, new StudentComparator());

        for(Object o : l){
            System.out.println(o+" ");
        }

    }

}

class Student /*implements Comparable<Student>*/{
    private int id;
   private String name;
   private int age;

   public Student(int id, String name, int age) {
       this.id = id;
       this.name = name;
       this.age = age;
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



//    @Override
//    public int compareTo(Student o) {
//       return this.name.compareTo(o.name);
//    }
}

class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
