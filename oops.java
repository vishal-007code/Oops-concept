//////////////////////////////////////class and object///////////////////////////////////
// class Pen {

//   String color;
//   int Quantity;

//   public void Write() {
//     System.out.println("hello");
//   }

//   public void printColor() {
//     System.out.println(this.color);
//     System.out.println(this.Quantity);
//   }

//   //   Pen(){
//   //     System.out.println("bye");
//   //   }
//   Pen(Pen pen2) {
//     this.color = pen2.color;
//     this.Quantity = pen2.Quantity;
//   }
//   Pen(){

//   }
// }

// public class oops {

//   public static void main(String[] args) {
//     Pen s1 = new Pen();
//     s1.Quantity = 10;
//     s1.color = "Blue";

//     Pen pen2 = new Pen(s1);
//     // pen2.color = "yellow";

//     // pen1.Write();
//     pen2.printColor();
//     // pen2.printColor();
//   }
// }

////////////////////////////////////////////////Polymorphism//////////////////////////////////////////////////////////
///////////////////////////Compiled-time polumorphism and method overloading////////////////////////////////////

// class Student {

//   String name;
//   int age;

//   public void printInfo(String name) {
//     System.out.println(name);
//   }

//   public void printInfo(int age) {
//     System.out.println(age);
//   }

//   public void printInfo(String name , int age) {
//     System.out.println(name + " " + age);
//   }
// }

///////////////////////////runtime polymorphism and method overriding////////////////////////////////////////////////
// class Shape {

//   void draw() {
//     System.out.println("creating…");
//   }
// }

// class square extends Shape {

//   void draw() {
//     System.out.println("creating square…");
//   }
// }

// class Triangle extends Shape {

//   void draw() {
//     System.out.println("creating triangle…");
//   }
// }

// class Pentagon extends Shape {

//   void draw() {
//     System.out.println("creating pentagon…");
//   }
// }

// class TestPolymorphism2 {

//   public static void main(String args[]) {
//     Shape s;

//     s = new square();

//     s.draw();

//     s = new Triangle();

//     s.draw();

//     s = new Pentagon();

//     s.draw();
//   }
// }
//////////////////////////////////////////Inheritance////////////////////////////////////
///////////////////////////Single-level inheritance//////////////////////////////////
// class Shape{
//   public void area() {
//     System.out.println("display the area");

//   }

// }
// class Triangle extends Shape{
//   public void area(int b,int h) {
//     System.out.println(1/2*b*h);
//   }
// }
////////////////////////Multi-level Inheritance///////////////
// class Shape{
//   public void area() {
//     System.out.println("display the area");

//   }

// }
// class Triangle extends Shape{
//   public void area(int b,int h) {
//     System.out.println(1/2*b*h);
//   }
// }
// class Rightangledtriangle extends Triangle{
//   public void area() {
//     System.out.println();

//   }
// }
/////////////Hierarchial Inheritance//////////////////
// class Shape {
//   public void area() {
//       System.out.println("Displays Area of Shape");
//   }
// }
// class Triangle extends Shape {
//   public void area(int h, int b) {
//       System.out.println((1/2)*b*h);
//   }
// }
// class Circle extends Shape {
//   public void area(int r) {
//       System.out.println((3.14)*r*r);
//   }
// }

///////////////Hybrid Inhertance////////////

// class Shape{
//   public void area() {
//     System.out.println("display the area");

//   }
// class Triangle extends Shape {
//   public void area(int h, int b) {
//       System.out.println((1/2)*b*h);
//   }
// }
// class Circle extends Shape {
//   public void area(int r) {
//       System.out.println((3.14)*r*r);
//   }
// }

//////////////////////Packages///////////
// package Oops;

// class Account{

// }

// public class oops {
//   public static void main(String[] args) {

//   }

// }

// ///////////////Access Modifier and  getter&setter////////////
// package newpackage;

// class Account {
//    public String name;
//    protected String email;
//    private String password;

//    public String getPassword(){
//     return this.password;
//    }

//    public void setPassword(String password) {///setter//
//        this.password = password;
//    }

//   }
//   public class oops {
//      public static void main(String args[]) {
//          Account a1 = new Account();
//          a1.name = "Apna College";
//          a1.setPassword("abcd");
//          a1.email = "hello@apnacollege.com";
//      }
//   }
/////////upper class is example of Encapsulation//////////
///////////Abstraction////////////
//////////Abstract class//////
// abstract class Animals {

//   abstract void walk();
// }

// class Horse extends Animals {

//   public void walk() {
//     System.out.println("Walk on 4 legs");
//   }
// }

// class Chicken extends Animals {

//   public void walk() {
//     System.out.println("walk on 2 legs");
//   }
// }

// public class oops {

//   public static void main(String[] args) {
//     Horse horse = new Horse();
//     horse.walk();
//   }
// }
////////Interfaces///////
interface Animals{
    int eyes = 2;////static and final cannot change if fixed once
    void walk();
}
interface Hervivor{

}
class Horse implements Animals,Hervivor{
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}

public class oops{
    public static void main(String[] agrs) {
        Horse horse = new Horse();
        horse.walk();
        
    }
}