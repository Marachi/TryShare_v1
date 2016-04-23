package javaGame;

import java.util.Scanner;


public class Controller {
    private Model model;
    private View view;

    // Constructor
    Controller(Model model, View view) {
        this.model = model;
        this.view = view;

    }

    // The Work method
    void processUser() {
        Scanner sc = new Scanner(System.in);
        model.rand();
        // model.rand(5,15);
        while (!model.tryGuess(inputIntValueWithScanner(sc))) {
            view.printMessage(view.FAIL);
        }
        view.printMessage(view.CONGRATULATION);

    }

    // The Utility methods
    private int inputIntValueWithScanner(Scanner sc) {
        view.printMessageAndTwoInt(view.INPUT_INT_DATA_BETWEEN, model.getStart(), model.getEnd());
        
        while (!sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA);
            view.printMessageAndTwoInt(view.INPUT_INT_DATA_BETWEEN, model.getStart(), model.getEnd());
            sc.next();
        }
        int a = sc.nextInt();
        while (a <= model.getStart() || a >= model.getEnd()) {
            view.printMessage(view.KEEP_BORDER);
            a = inputIntValueWithScanner(sc);
        }
        return a;
    }
}
