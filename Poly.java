/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poly;

/**
 *
 * @author anzoh
 */
class Bird{
    public void sing(){
    System.out.println("tweet!");
    }
}

class Pigeon extends Bird{
    @Override
    public void sing(){
    System.out.println("Quack!");
    }

}

public class Poly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pigeon p1 = new Pigeon();
        p1.sing();
    }
    
}
