package java.game;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by User on 17.03.2016.
 */
public class Controller {
    // The Constants
    public static final double PI = 3.14;

    // The Regex
    // «nick@mail.com»
    public static final String REGEX_MAIL = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
    // «http://www.my-site.com»
    public static final String REGEX_URL = "^((https?|ftp)\\:\\/\\/)?([a-z0-9]{1})((\\.[a-z0-9-])|([a-z0-9-]))*\\.([a-z]{2,6})(\\/?)$";
    // «+38(044)555-55-55»
    public static final String REGEX_PHONE = "^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";

    // Constructor
    Model model;
    View view;
    Random random;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;

    }





    // The Work method
    public void rand(){

        model.setGoalPoint(random.nextInt(100));
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);

        model.setDiapasone(inputIntValueWithScanner(sc));
        model.goGame();

        view.printMessageAndInt(view.OUR_INT, model.getValue());
    }


    // The Utility methods
    public int[] inputIntValueWithScanner(Scanner sc) {
        int a[] = new int[2];
        view.printMessage(view.INPUT_START_INT_DATA);
        while( ! sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_DATA);
            sc.next();
        }
        a[0]= sc.nextInt();
        view.printMessage(view.INPUT_END_INT_DATA);
        while( ! sc.hasNextInt()|| sc.nextInt()<=a[0]){
            if(! sc.hasNextInt()){
                view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_DATA);
            }
            else{
                view.printMessage(view.INPUT_BIGGER_INT_DATA + view.INPUT_INT_DATA);
            }
            sc.next();
        }
        a[1] = sc.nextInt();
        return a;
    }

}
