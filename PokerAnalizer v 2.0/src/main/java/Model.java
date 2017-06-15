import java.util.Scanner;

/**
 * Created by Tony on 15.06.2017.
 */
public class Model {
    public static void flopScanner() {
        Scanner scan = new Scanner(System.in);
        // Variables.setStack(scan.nextDouble());
        Variables.setBank(scan.nextDouble());
        Variables.setToCall(scan.nextDouble());

        if (Variables.getToCall() >= Variables.getBank()) {
            Messeges.error();
        }
        else {
            MathYo.calculateBankChance();
            Control.afterMathRes();
        }
    }
}
