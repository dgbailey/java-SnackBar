package snackbar;

public class Snack
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double int cost;
    private int vendingMachineId;


    public Snack(String name, int quantity,double cost,int vendingMachineId)
    {
        maxId++
        this.id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;

    }

    public getId(){
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

    public getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }
    
        

    public getVendingMachineId()
    {
        return vendingMachineId;
    }

    public void setVendingMachineId(double cost)
    {
        this.vendingMachineId = vendingMachineId;
    }

    public getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public void addQuantity(int amountAdded)
    {
        this.quantity = amountAdded + this.quantity;
    }

    public buySnack(int numberSnacks)
    {
        this.quantity = this.quantity - numberSnacks;
    }

    public totalCost(double quantSnacks)
    {
        return this.cost*quantSnacks;
    }




}