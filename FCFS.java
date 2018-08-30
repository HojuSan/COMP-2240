/*.java 
Assignment 1
Author:     Juyong Kim
Student No: c3244203
Date:       09/08/18
Description: First come first serve
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class FCFS
{
    //variable for amount of process there will be initially
    final private int MAX = 5;
    private Process[] process;
	private int total = 0;
    private int dis = 0;
    //not sure why not calling
    static c3244203A1 a1 = new c3244203A1();

    public FCFS()
    {
        process = new Process[MAX];
        total = 0;
    }

    public void doStuff()
    {
        int counter = 0

        System.out.println("FCFS:");

        for (int i = 0; i <= total; i++)
        {
            counter += a1.getDispatcher();

            System.out.println("T", counter, ":", process[i].getId());
        }

        System.out.println("Process Turnaround Time Waiting Time");
        for (int i = 0; i <= total; i++)
        {
            System.out.println(process[i].getId(), "  ", process[i].getTr()"      ", process[i].getWt());
        }
    }

    //Setting the process into a list
    public void addProcess(String id, int arrival, int execute)
    {
        if (dis == 0)
        {
            dis = a1.getDispatcher();
        } 

        if (check(id) == 0)
        {
            process[total] = new Process();
            setProcess(process[total],id,arrival,execute);
            add(Process process[total]);
            total++;

            if(total == process.length)
            {
                resize();
            }
        }
        
        else if (check(id) == 1)
        {
            System.out.println("ID already exists");
        }
    }

    public int check(String id)
    {
        if (total > 0)
        {
            for(int i = 0; i < total; i++)
            {
                if (process[i].getId() == id)
                {
                    return 1;
                }
            }
        }

        return 0;
    }

    public void setProcess(Process process, String id, int a, int e)
    {
        process.setId(id);
        process.setArrival(a);
        process.setExecute(e);
    }

    public void resize()
    {
        Process [] reProcess;
        reProcess = new Process[process.length+1];

        for (int i = 0; i < process.length; i++)
        {
            reProcess[i] = process[i]
        }

        process = reprocess;
    }
}