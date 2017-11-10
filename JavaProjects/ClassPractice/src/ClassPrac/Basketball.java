package ClassPrac;

public class Basketball extends Ball {
    // Properties
    private boolean isNBA;
    private int capacity;

    // Constructors
    public Basketball(String color, int bounceRate) {
        this.color = color;
        this.name = "Basketball";
        this.bounceRate = bounceRate;
    }

    // Setters and Getters
    public boolean getNBA() {
        return isNBA;
    }
    public void setNBA(boolean NBA) {
        isNBA = NBA;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Behaviors

    // Override
    public void bounce() {
        System.out.println("Basketball bouncing...");
    }
}
