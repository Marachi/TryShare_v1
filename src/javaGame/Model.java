package javaGame;


import java.util.Random;


public class Model {

    private int start; //start of range
    private int end;    //end of range
    private int goal;   //number which should be guessed by user

    // The Program logic
   
    /**
     * in this method goal field will be set by
     * value
     * @param goal
     * @return sum
     */
    private void setGoal(int goal) {
        this.goal = goal;
    }
    
    /**
     * in this method goal field will be set by
     * random value with setGoal(int goal).
     * Value is generated randomly  in range [0,100]
     */
    public void rand(){
        this.start=0;
        this.end=100;
        Random random = new Random();
        setGoal(random.nextInt(View.RAND_MAX));
    }

    /**
     * in this method goal field will be set by
     * random value.
     * Value is generated randomly  in range [start,end]
     * @param start
     * @param end
     */
    public void rand(int start, int end){
        this.start=start;
        this.end=end;
        setGoal(start + (int)(Math.random() * ((end - start) + 1)));

    }

    /**
     * this method compares user's number
     * and goal.
     * If user failed, range will be
     * shortened considering user's number
     * @param userPoint
     * @return result
     */
    public boolean tryGuess(int userPoint){
        if(userPoint==goal){
            return true;
        }
        else{
            if(userPoint>goal)
                this.end=userPoint;
            else
                this.start=userPoint;
            return false;
        }
    }

    /**
     * this method returns start
     * @return start
     */
    public int getStart() {
        return start;
    }

    /**
     * this method returns end
     * @return end
     */
    public int getEnd() {
        return end;
    }



}
