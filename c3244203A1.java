/*.java 
Assignment 1
Author:     Juyong Kim
Student No: c3244203
Date:       09/08/18
Description: 
*/
import java.util.*;
import java.io.*;

public class c3244203A1
{

    static Scanner input = new Scanner(System.in);    
    static Process process = new Process();
    static FCFS fcfs = new FCFS();

    public static void main (String [] args)
    {
        int total = 0;


        System.out.println("How many process do you wish to evaluate");
        total = input.nextLine();

        for(int i = 0; i <= total; i++)
        {
            addProcess();
        }
    }     

    //Adds new process 
    public static void addProcess()
	{
		String id;
		int execute,arrival;
		
		System.out.println("What is the id:");
		id = input.nextLine();
		
		System.out.println("What is the arrival time:");
		arrival = input.nextInt();
		
		System.out.println("What is the execution time:");
		execute = input.nextInt();
		
		pro.addProcess(id,arrival,execute);   		
	}
}