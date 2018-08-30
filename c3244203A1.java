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
    private FCFS fcfs;
    

    public static void main (String [] args)
    {
        FCFS fcfs = new FCFS();
        //static RR rr;
        //static FB fb;
        //static NRR nrr;
        int dis = 1;

        System.out.println("working");
 //       fcfs.addProcess("p1",0,10);
 //       fcfs.addProcess("p2",0,1);
 //       fcfs.addProcess("p3",0,2);
//      fcfs.addProcess("p4",0,1);
 //       fcfs.addProcess("p5",0,5);
/*
        //setting dispatcher 
        System.out.println("Dispatcher runtime?");
        dis = Integer.parseInt(input.nextLine());

        //setting amount of process in usage
        System.out.println("How many process do you wish to evaluate");
        int total = Integer.parseInt(input.nextLine());

        for(int i = 0; i <= total; i++)
        {
            addProcess();
        }      
*/
    }
 
/*
    //Adds new process 
    public static void addProcess()
	{
        System.out.println("What is the id:");
		String id = input.nextLine();

        System.out.println("What is the execution time:");
		int execute = Integer.parseInt(input.nextLine());

        System.out.println("What is the arrival time:");
		int arrival = Integer.parseInt(input.nextLine());
		
        fcfs.addProcess(id,arrival,execute);   
        //rr.addProcess(id,arrival,execute);   
        //fb.addProcess(id,arrival,execute);   
		//nrr.addProcess(id,arrival,execute);   		
	}
*/
    public int getDis()
    {
        return dis;
    }
}