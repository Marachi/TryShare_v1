package javaGame;

/**
 * Created by User on 17.03.2016.
 */
public class View {
    // Text's constants
    public static final String INPUT_INT_DATA_BETWEEN = "Input INT value between ";
    public static final String CONGRATULATION = "Congratulations! The number is guessed!!!";
    public static final String KEEP_BORDER = "Please, TRY input your value in a specified range.";
    public static final String FAIL = "Try one more  ";

    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    //int constants
    public static final int RAND_MAX = 101;
    //console print
    public void printMessage(String message){
        System.out.println(message);
    }
    public void printMessageAndTwoInt(String message, int value1,int value2){
        System.out.println(message + value1+" and " +value2);
    }


}
