import java.util.Random;

public class Car {
    private Integer distance;
    private Random random;
    private Integer Debt;
    private Integer Mph;
    public Car(){
        random = new Random();
        distance = 0;
        Debt = 500;
        Mph = 0;
    }

    private void collectDebt(boolean debt){
        if (debt){
            Debt += 500;
        }else Debt -= Mph;
    }

    private boolean crashed(Integer mph){
        Double chanceOfCrashing = mph / 250.0 * 100.0;
        Integer crash = random.nextInt(100);

        if (crash <= chanceOfCrashing) {
            collectDebt(true);
            return true;
        }
        else{
            collectDebt(false);
            return false;
        }
    }

    public String  drive(Integer mph, Integer hours){
        distance += mph * hours;
        Mph = mph;
        boolean crash = crashed(mph);
        if (crash){
            return "You crashed";
        }else
            return "You managed to avoid a crash";

    }

    public Integer getDistanceCovered(){
        return distance;
    }

    public Integer getDebt(){
        return Debt;
    }
}
