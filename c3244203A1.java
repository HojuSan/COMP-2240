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
    static FCFS fcfs = new FCFS();
    //static RR rr = new RR();
    //static FB fb = new FB();
    //static NRR nrr = new NRR();
    

    public static void main (String [] args)
    {
        int total = 0;
        int dispatcher = 0;

        //setting dispatcher 
        System.out.println("Dispatcher runtime?");
        dispatcher = input.nextint();

        //setting amount of process in usage
        System.out.println("How many process do you wish to evaluate");
        total = input.nextint();

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
		
        fcfs.addProcess(id,arrival,execute);   
        //rr.addProcess(id,arrival,execute);   
        //fb.addProcess(id,arrival,execute);   
		//nrr.addProcess(id,arrival,execute);   		
	}

    public static int getDispatcher()
    {
        return dispatcher;
    }
}