package people;


public class Person {
    
    String name;
    int age;
    
    public Person(String name, int age){
        
        this.name = name;
        this.age = age;
        
    }
    
    public void printPerson(){
        
        System.out.println("Hello! My name is " + name + " and I'm " + age + " years old. ");
    }
    
}
