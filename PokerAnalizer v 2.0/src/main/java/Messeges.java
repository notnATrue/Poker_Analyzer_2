/**
 * Created by Tony on 15.06.2017.
 */
public class Messeges {

    public static void flopDefault() {
       // System.out.println("Enter amount of your chips > ");
        System.out.println("Enter count of bank > ");

        System.out.println("Enter amount of chips to call > ");
    }
    public static void flopResult() {
        System.out.println("Bank chance = " + Variables.getBankChance());
    }
    public static void error(){
        System.out.print("Some error here");
    }
}
