package PokerMath;

import java.util.Scanner;

/**
 * Created by Tony on 15.06.2017.
 */
public class PokerMove {

    private double value = 0;
    private String name;

    public PokerMove() {
    }

    public PokerMove(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void readValueFromConsole() {
        System.out.println(this.name + ": ");
        Scanner scan = new Scanner(System.in);
        this.value = Double.parseDouble(scan.nextLine());
    }
}
