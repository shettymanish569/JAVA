// /**
//  * Innerfunction
//  */
//  class Pen {
//     String color;
//     String type;

//     public static void write(){
//         System.out.println("Write Something");
//     }
// }
// public class function {
// public static void main(String[] args) {
//     Pen pen1=new Pen();
//     pen1.color="Black";
//     pen1.type="gel";
//     pen1.write();
// }
    
// }

// function overloading is used in compile time
// function overwriting is used in run time

class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name,int age){
        System.out.println(name +" " +age);
    }
}

public class function {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Manish";
        s1.age=20;
        s1.printInfo(s1.name,s1.age);
    }
    
}