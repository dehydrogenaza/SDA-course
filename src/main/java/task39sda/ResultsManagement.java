package task39sda;

public class ResultsManagement {
    private static Double bestTime = 99.9;
    //private static final Object lock = new Object();

    public static synchronized Double getResult(){
        return bestTime;
    }

    public static synchronized void updateResult(Double lastValue, Double newValue){
        if(lastValue.equals(bestTime)){
            bestTime=newValue;
            System.out.println("Value updated: "+bestTime);
        } else {
            System.out.println("Update rejected.");
        }
    }


}