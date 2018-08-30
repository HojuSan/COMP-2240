/*.java 
Assignment 1
Author:     Juyong Kim
Student No: c3244203
Date:       09/08/18
Description: has all the details about the process
*/
public class Process {
    //variables
    private String id;
    private int arrival;
    private int execute;
    //turnaround time
    private int tr;
    //waiting time
    private int wt;

    // constructor
    public Process() 
    {
        id = "";
        arrival = 0;
        execute = 0;
        tr = 0;
        wt = 0;
    }

    // getters
    public String getId() 
    { 
        return id; 
    }
    public int getArrival() 
    { 
        return arrival; 
    }
    public int getExecute()
    {
        return execute;
    }
    public int getTr() 
    {
        return tr; 
    }
    public int getWt() 
    {
        return wt;
    }

    // setters
    public void setId(String id) 
    {
        this.id = id; 
    }
    public void setArrival(int arrival) 
    {
        this.arrival = arrival; 
    }
    public void setExecute(int execute) 
    {
        this.execute = execute;
    }
    public void setTr(int tr) 
    {
        this.tr = tr; 
    }
    public void setWt(int wt) 
    {
        this.wt = wt;
    }
}