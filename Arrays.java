/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author anzoh
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] names = {"yozen", "nataku", "taikobo"};
        System.out.println(names[1]);
        
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println(numbers[2]);
        
        //decalre the amount of elements in out array
        int[] grades = new int[5];
        
        
        // Asign them...
        
        grades[0] = 55;
        grades[1] = 95;
        grades[2] = 66;
        grades[3] = 45;
        grades[4] = 33;

        
        System.out.println(grades[2]);

//        grades[5] = 100; out of bounds


    String[] color; //Declaration
    
    //Initialisation
    color = new String[3];
    
    color[0] = "red";
    color[1] = "green";
    color[2] = "blue";
    
    String[] fruits = {"Apples", "Bananas", "Mango"}; 
    
    System.out.println(fruits[0]);
    System.out.println(fruits[1]);
    
    System.out.println("The length of this array is: " + fruits.length);
    
    String[] birds = {"Pigeon", "Robin", "Chicken"};
    
    System.out.println("Iterating through the birds array!");
    
    for(int i = 0; i< birds.length; i++){
    System.out.println("Bird at index " + i + ": " + birds[i]);
    }
    
    String[] animals = {"Lion", "Bear", "Tiger"};
    
    System.out.println("Enhanced iteration!");
    
    for(String animal : animals){
    System.out.println("Animal name: " + animal); // for each String animal in the animals array!
    }
    }
    
    

    }
    
    

