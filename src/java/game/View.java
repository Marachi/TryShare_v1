package java.game;

/**
 * Created by User on 17.03.2016.
 */
public class View {
    // Text's constants
    public static final String INPUT_INT_DATA = "Input INT value = ";
    public static final String INPUT_START_INT_DATA = "Input start INT value = ";
    public static final String INPUT_END_INT_DATA = "Input end INT value = ";
    public static final String INPUT_BIGGER_INT_DATA = "Input bigger INT value = ";


    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String OUR_INT = "INT value = ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndInt(String message, int value){
        System.out.println(message + value);
    }

}
