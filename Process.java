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

    // constructor
    public Process() 
    {
        id = "";
        arrival = 0;
        execute = 0;
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
}