
package com.example.Arrays;
import java.util.Scanner;
public class Arrays {
    
    static Scanner scan=new Scanner(System.in);
    static String [][]students={
        {"Julian Marie Amores", "Lea May Pinoc", "James Aldrin Delos Santos", "Joy Espinosa", "Jim Malangsa", "Kirk Jancey Paz", 
        "Jasmine Insorio", "Jex Kean Alfonso", "Rodmar Apeta", "Kyle Cedric Villamor" },
        {"1.20", "1.30" ,"1.10", "1.40", "1.50", "1.20", "1.20", "1.25", "1.15", "1.30"},
        {"1.25", "1.15", "1.20", "1.10", "1.20", "1.25", "1.3", "1.0", "1.10", "1.20"}};
    
    public static void main(String[] args) {
        System.out.println("\n ---Student Record System---");
        
        while(true){
            displayMenu();
            System.out.print("\n Enter choice: ");
            String choice=scan.nextLine().trim();
            
            switch(choice){
                case "1" ->{
                    //viewStudents();
                    break;
                }
                case "2" ->{
                    //gradesAverage();
                    break;
                }
                case "3" ->{
                    //sortsGrades();
                    break;
                }
                case "4" ->{
                    //searchStudent();
                    break;
                }
                case "5" ->{
                    return;
                }
                default-> {
                   System.out.println("Invalid input! Please try again");
               }
            }
        }
    }
    //Display menu
    static void displayMenu(){
        System.out.println("  \n  1. View All Students");
        System.out.println("  2. General Weighted Average");
        System.out.println("  3. Sorts Grades");
        System.out.println("  4. Search for a student");
        System.out.println("  5. Exit");
    }
}
