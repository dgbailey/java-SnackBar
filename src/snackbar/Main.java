package snackbar;

public class Main
{

    private static void workWithData ()
    {
        Customer Jane = new Customer("Jane",45.25);
        Customer Bob = new Customer("Bob",33.14);

        VendingMachine Food = new VendingMachine("Food");
        VendingMachine Drink = new VendingMachine("Drink");
        VendingMachine Office = new VendingMachine("Office");

        Snack Chips = new Snack("Chips",36,1.75,Food.getId());
        Snack ChocolateBar = new Snack("ChocolateBar",36,1.00,Food.getId());
        Snack Pretzel = new Snack("Pretzel",30,2.00,Food.getId());

        Snack Soda = new Snack("Soda",24,2.50,Drink.getId());
        Snack Water = new Snack("Water",20,2.75,Drink.getId());


        Food.vend(Jane,Soda,3);
        Food.vend(Jane,Pretzel,1);
        Food.vend(Bob,Soda,4);
        Jane.addCash(10);
        System.out.println(Jane.getCashTotal());
        Food.vend(Bob,ChocolateBar,1);
        Pretzel.addQuantity(12);
        System.out.println(Pretzel.getQuantity());
        Food.vend(Bob,Pretzel,3);



        

        

    }

    public static void main(String[] args)
    {
        workWithData();

    
    }

}