package  lab2;




class Student{
 // @JsonProperty("name")
String name;
 // @JsonProperty("surename")
String surename;
 // @JsonProperty("phone")
String phone;
 // @JsonProperty("street")
String street;
 // @JsonProperty("build")
int build;
 // @JsonProperty("flat")
int flat; 
Student(String name,
String surename,
String phone,
String street) {
this.name=name;
this.surename=surename;
this.phone=phone;
this.street=street;

};

public  boolean equals(Student st) 
 
 {
  if(st.name!=this.name) return false;
   if(st.surename!=this.surename) return false;
    if(st.phone!=this.phone) return false;
     if(st.street!=this.street) return false;
      if(st.build!=this.build) return false;
       if(st.flat!=this.flat) return false;
  return true;
};
}

class Main {


  public static void main(String[] args) {
    Student s;
   Student s1 = new Student("Vasya","Pupkin","01","Pashkovsky");
    Student s2 = new Student("Vasya","Pupkin","01","Pashkovsky");
     Student s3 = new Student("Genya","Gora","02","Pashkovsky");
    System.out.println(s1.equals(s2));
  }
}