class Process {
    //variables
    private String id;
    private int arrival;
    private int execute;

    // constructor
    public Process(String id, int arrival, int execute) 
    {
        this.id = id;
        this.arrival = arrival;
        this.execute = execute;
    }

    // getter
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

    // setter
    public void setName(String id) 
    {
        this.id = id; 
    }
    public void setCode(int arrival) 
    {
        this.arrival = arrival; 
    }
    public void setExecute(int execute) 
    {
        this.execute = execute;
    }
}