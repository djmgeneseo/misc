package ClassPrac;

public class Ball {
    // Properties or instance variables
    public String color;
    public String name;
    public int bounceRate;

    /* Constructor - can create many constructors.
          - Highlight variables -> right-click -> generate
    */
    public Ball(){

    } // Constructor

    public Ball(String color, String name, int bounceRate) {
        this.color = color;
        this.name = name;
        this.bounceRate = bounceRate;
    } // Constructor 2

    public void bounce() {
        System.out.println("Bouncing...");
    }

    /* Getters and Setters:
          - Highlight variables -> right-click -> generate
    */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBounceRate() {
        return bounceRate;
    }

    public void setBounceRate(int bounceRate) {
        this.bounceRate = bounceRate;
    }

    public void showbounceRate() {
        System.out.println(this.bounceRate);
    }
}
