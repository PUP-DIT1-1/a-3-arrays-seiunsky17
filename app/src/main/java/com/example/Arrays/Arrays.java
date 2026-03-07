
package com.example.Arrays;
import java.util.Scanner;
public class Arrays {
    
    static Scanner scan=new Scanner(System.in);
    static String [][]students={
        {"Julian Marie Amores", "1.25", "1.25"}, 
        {"Lea May Pinoc", "1.30", "1.20"},
        {"Joy Espinosa", "1.40", "1.10"},
        {"Jasmin Insorio", "1.50", "1.30"},
        {"Jim Malangsa", "1.20", "1.20"},
        {"James Aldrin DelosSantos", "1.50", "1.25"},
        {"Kirk Jancey Paz", "1.25", "1.10"},
        {"Jex Kean Alfonso", "1.20", "1.0"},
        {"Rodmar Apeta", "1.15", "1.25"},
        {"Kyle Villamor", "1.50", "1.20"},
    };
    
    public static void main(String[] args) {
        System.out.println("\n ---Student Record System---");
        
        while(true){
            displayMenu();
            System.out.print("\n Enter choice: ");
            String choice=scan.nextLine().trim();
            
            switch(choice){
                case "1" ->{
                    viewStudents();
                    break;
                }
                case "2" ->{
                    gradesAverage();
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
    //viewStudents
    static void viewStudents(){
        System.out.printf("\n%-30s %-10s %-10s%n", "Names", "Midterm", "Finals");
        System.out.println("--------------------------------------------------");
        for(int i=0; i < students.length; i++){
            System.out.printf("%-30s %-10s %-10s%n", 
            students[i][0], 
            students[i][1], 
            students[i][2]);
        }
    }
    //Computes Average
    static void gradesAverage(){
        System.out.printf("\n%-25s %-10s %-10s %-10s%n", "Names", "Midterms" , "Finals", "General Average");
        System.out.println("---------------------------------------------------------------");
        for(int i=0; i < students.length; i++){
            double midterm = Double.parseDouble(students[i][1]);
            double finals = Double.parseDouble(students[i][2]);
            double average= (midterm + finals) / 2.0;
            
            System.out.printf("%-25s %-10s %-10s %-10.2f%n", 
            students[i][0], 
            students[i][1], 
            students[i][2], 
            average);
        }
    }
}
