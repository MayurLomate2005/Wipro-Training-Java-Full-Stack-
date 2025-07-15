package Assignment_1;

class Animal{
    String name;
    void eat(String name){
        this.name = name ;
        System.out.println(name+"is eating");
    }
    void walk(String name){
        this.name = name ;
        System.out.println(name+"is walking");

    }
    void fly(){
        System.out.println("i am flying");
    }
}

class Bird extends Animal{


    void fly(){
        System.out.println(name+"is flying");
    } 

}

public class Inheritance {
    public static void main(String[] args){
        Animal an = new Bird();
         an.fly();
        
        
    }
    
}
