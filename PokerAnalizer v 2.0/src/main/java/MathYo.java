/**
 * Created by Tony on 15.06.2017.
 */
public class MathYo {
    public static void calculateBankChance() {
        Variables.setBankChance( Variables.getBank() / Variables.getToCall());
        Variables.setBankChance(Math.round(Variables.getBankChance()));
    }
}
