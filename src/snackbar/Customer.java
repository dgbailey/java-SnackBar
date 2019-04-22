ackage snackbar;

public class Customer
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double int coh;


    public Customer( String name, double coh)
    {
        maxId++
        this.id = maxId;
        this.name = name;
        this.coh = coh;
        

    }

    public void addCash(double cashAmount)
    {
        this.coh = this.coh + cashAmount;
    }

    public  getCashTotal()
    {
        return this.coh;
    }

    public void buySnack(double cashAmount)
    {
        this.coh = this.coh - cashAmount;
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