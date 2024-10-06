interface Athlete {
    void train();
    void compete();
}

abstract class Runner implements Athlete {
    protected double bestTime;

    public Runner(double bestTime) {
        this.bestTime = bestTime;
    }

    public double getBestTime() {
        return bestTime;
    }
}

class Sprinter extends Runner {
    public Sprinter(double bestTime) {
        super(bestTime);
    }

    @Override
    public void train() {
        System.out.println("Спринтер тренируется для коротких дистанций.");
    }

    @Override
    public void compete() {
        System.out.println("Спринтер участвует в соревнованиях на короткие дистанции.");
    }
}

class MarathonRunner extends Runner {
    public MarathonRunner(double bestTime) {
        super(bestTime);
    }

    @Override
    public void train() {
        System.out.println("Марафонец тренируется для длинных дистанций.");
    }

    @Override
    public void compete() {
        System.out.println("Марафонец участвует в марафоне.");
    }
}

public class Sports {
    public static void main(String[] args) {

        Runner sprinter = new Sprinter(9.58);
        Runner marathonRunner = new MarathonRunner(120.0);

        sprinter.train();
        sprinter.compete();
        System.out.println("Лучшее время спринтера: " + sprinter.getBestTime() + " секунд");

        marathonRunner.train();
        marathonRunner.compete();
        System.out.println("Лучшее время марафонца: " + marathonRunner.getBestTime() + " минут");
    }
}
