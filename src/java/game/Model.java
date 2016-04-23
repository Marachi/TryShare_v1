package java.game;


/**
 * Created by User on 17.03.2016.
 */
public class Model {
    private int value;
    private int start;
    private int end;
    private int goal;

    // The Program logic
    public void setDiapasone(int a[]) {
        this.start = a[0];
        this.end = a[1];
    }

    public void goGame(){

    }
    /**
     * in this method add valueInt with this.value
     * @param valueInt
     * @return sum
     */
    public int addIntOurValue(int valueInt){
        return value += valueInt;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public void setGoalPoint(int goal) {
        this.goal = goal;
    }
}
