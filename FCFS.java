/*.java 
Assignment 1
Author:     Juyong Kim
Student No: c3244203
Date:       09/08/18
Description: First come first serve
*/

import java.lang.System;
import java.util.PriorityQueue;

public class FCFS
{
    //private ArrayQueue<Process> que,done;
    private PriorityQueue<Process> que;// = new PriorityQueue<>();
    private PriorityQueue<Process> done;// = new PriorityQueue<>();
    private Process[] pro;// = new Process();
	private int total1;
    private int total2;

    public FCFS()
    {
        que = new PriorityQueue<Process>();
        done = new PriorityQueue<Process>();
        pro = new Process[0]; 
        total2 = 0;
        total1 = 0;
    }
/*
        //Setting the process into a list
        public void addProcess(String id, int arrival, int execute)
        {
            if (check(id) == 0)
            {
                setProcess(pro[total1],id,arrival,execute);
                que.add(pro[total1]);
                total1++;
    
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
            if (total1 > 0)
            {
                for(int i = 0; i < total1; i++)
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
            reProcess = new Process[process.length+1];
    
            for (int i = 0; i < process.length; i++)
            {
                reProcess[i] = process[i];
            }
    
            process = reProcess;
        }
    }
*/
/*
    public void doStuff()
    {
        int counter = 0;
        int num = total1;
        System.out.println("FCFS:");

        for (int i = 0; i <= num; i++)
        {
            counter += c3244203A1.getDis();

            System.out.println("T" + counter + ":" + pro[i].getId());
            counter += pro[i].getExecute();

            for (int i = 0; i < total1; i++)
            {
                pro[i].setTr(pro[i].getTr() + counter);
            }

            done.add(pro[i]);
            total2++;
            que.push(pro[i]);
            total1--;
        }

        System.out.println("Process Turnaround Time Waiting Time");
        for (int i = 0; i <= total; i++)
        {
            System.out.println(pro[i].getId() + "  " + pro[i].getTr() + "      " + pro[i].getWt());
        }*/
    }
