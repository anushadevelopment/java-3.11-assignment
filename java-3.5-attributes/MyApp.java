public class MyApp {
    public static void main(String[] args) {
        VendingMachine ntuVendingMachine = new VendingMachine("NTU");

        ntuVendingMachine.insertCoin(1);
        ntuVendingMachine.selectDrink(Drink.COKE); // should not dispense, insufficient payment
        ntuVendingMachine.insertCoin(0.5);
        ntuVendingMachine.selectDrink(Drink.COKE);

        ntuVendingMachine.insertCoin(0.5); // should not dispense, insufficient payment
        ntuVendingMachine.selectDrink(Drink.WATER);
        ntuVendingMachine.insertCoin(1);
        ntuVendingMachine.selectDrink(Drink.WATER);

        ntuVendingMachine.printEarnings();
    }
}
