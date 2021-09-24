package com.exercise;

public class Ex30Person {

   private String firstName;
   private String lastName;
   private int age = 0;

   public String getFirstName() {
      return firstName;
   }
   public String getLastName() {
      return lastName;
   }
   public int getAge() {
      return age;
   }
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
   public void setAge(int age) {
      this.age = (age < 0 || age > 100) ? 0 : age;
   }
   public boolean isTeen() {
      if (age > 12 && age < 20) {
         return true;
      }
      return false;
   }
   public String getFullName() {
      if (firstName.isEmpty() && lastName.isEmpty()) {
         return "";
      }
      if (firstName.isEmpty()) {
         return lastName;
      }
      if (lastName.isEmpty()) {
         return firstName;
      }
      return firstName + " " + lastName;
   }
}