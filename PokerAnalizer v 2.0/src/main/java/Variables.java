/**
 * Created by Tony on 15.06.2017.
 */
public class Variables {

    private static double stack;
    private static double toCall;
    private static double bank;
    private static double bankChance;

    public static void setBankChance(double bankChance) {
        Variables.bankChance = bankChance;
    }

    public static double getBankChance() {
        return bankChance;
    }

    public static void setBank(double bank) {
        Variables.bank = bank;
    }

    public static double getBank() {
        return bank;
    }

    public static void setStack(double stack) {
        Variables.stack = stack;
    }

    public static double getStack() {
        return stack;
    }

    public static void setToCall(double toCall) {
        Variables.toCall = toCall;
    }

    public static double getToCall() {
        return toCall;
    }
}
