package ooplabtask;

public class Classandobject {
    int id;
    String name;

    Classandobject(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(" Name: " + name + " ID: " + id);
    }

    public static void main(String[] args) {
        
        Classandobject obj1 = new Classandobject(1075, "Abubakar");
        Classandobject obj2 = new Classandobject(1043, "Bashar");

      
        obj1.display();
        obj2.display();
    }
    
}
