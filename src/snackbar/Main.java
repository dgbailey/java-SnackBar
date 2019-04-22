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


        //Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
        Jane.buySnack(3*Soda.getCost());
        Soda.setQuantity(Soda.getQuantity() - 3);
        System.out.println(Jane.getCashTotal());
        System.out.println(Soda.getQuantity());

        Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.

    }

    public static void main(String[] args)
    {
        workWithData();

        // System.out.println(h1);
    }

}