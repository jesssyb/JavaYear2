/*
Author: Jessica B
Date: 12/13/21
Description: Custom Student class with different constructor types
*/

public class Student
{
   private int studentID, grade, age;
   private String name;
   
   public Student()
   {
      name = "";
   }
   
   public Student(String n)
   {
      name = n;
   }
   
   public Student(String n, int ID, int a, int g)
   {
      name = n;
      studentID = ID;
      age = a;
      grade = g;
   }
   
   public void print()
   {
      System.out.println("Student name: " + name);
      System.out.println("Student ID: " + studentID);
      System.out.println("Student age: " + age);
      System.out.println("Student grade: " + grade + "\n");
   }
   
   public static void main(String [] args)
   {
      Student john = new Student();
      Student mary = new Student("Mary Jane");
      Student alex = new Student("Alex James", 12345, 14, 9);
      john.print();
      mary.print();
      alex.print();
   }
}