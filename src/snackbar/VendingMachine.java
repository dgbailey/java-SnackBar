package snackbar;

public class VendingMachine
{
    private static int maxId = 0;
    private int id;
    private String name;


    public VendingMachine(int id, String name)
    {
        maxId++
        this.id = maxId;
        this.name = name;
        

    }

    public getId()
    {
    return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    
    }
     
}