package PokerMath;

/**
 * Created by Tony on 15.06.2017.
 */
public class Calculation {

    private PokerMove bank;
    private PokerMove toCall;

    public Calculation() {
        bank = new PokerMove("Bank");
        toCall = new PokerMove("To Call");
    }

    public void printChmances() {
        if (bank.getValue() > toCall.getValue()) {
            System.out.println("error");
        } else {
            System.out.println("chances = " + (bank.getValue() * toCall.getValue())/(0.001));
        }
    }

    public void start() {
        bank.readValueFromConsole();
        toCall.readValueFromConsole();
        printChmances();
    }
}
