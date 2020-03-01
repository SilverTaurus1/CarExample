import java.util.Random;

public class Car {
    private Integer distance;
    private Random random;

    public Car(){
        random = new Random();
        distance = 0;
    }
    private boolean crashed(Integer mph){
        Double chanceOfCrashing = mph / 250.0 * 100.0;
        Integer crash = random.nextInt(100);

        if (crash <= chanceOfCrashing)
            return true;
        else return false;
    }

    public String  drive(Integer mph, Integer hours){
        distance += mph * hours;
        boolean crash = crashed(mph);
        if (crash){
            return "You crashed";
        }else
            return "You managed to avoid a crash";

    }

    public Integer getDistanceCovered(){
        return distance;
    }
}
