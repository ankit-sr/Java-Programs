package p2;
import p1.*;
public class School
{
 public static void main(String[] args)
 {
  Student s = new Student();
  Teacher t = new Teacher();
  s.setage(20);
  t.setsubject("Physics");
  t.setname("Rajendra");
  s.setroll(1903);
  s.setname("Ankit");
  System.out.println("Roll number = "+s.getrollno());
  System.out.println("Student name = "+s.getname());
  System.out.println("Student age = "+s.getage());
  System.out.println("Teacher name = "+t.getname());
  System.out.println("Teacher's subject = "+t.getsubject());
  
 }
}