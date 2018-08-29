/*.java 
Assignment 1
Author:     Juyong Kim
Student No: c3244203
Date:       09/08/18
Description: First come first serve
*/

public class FCFS
{
    final private int MAX = 5;
    private Process[] process;
	private int total;

    public FCFS()
    {
        process = new Process[MAX];
        total = 0;
    }

    public void addProcess(String id, int arrival, int execute)
    {
        if (check(id) == 0)
        {
            process[total] = new Process();
            setProcess(process[total],id,arrival,execute);
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