package ClassPrac;

public class Main {
    public static void main(String[] args){
        /*  Public - anyone can access
            Private - only accessed within the class
        */
        Ball myBall = new Ball("Blue","Volleyball",12);
        // OR
        myBall.setColor("Blue");
        myBall.setName("Volleyball");
        // OR
        myBall.color = "Blue"; // B.c it's a public variable
        myBall.name = "Volleyball"; // B.c it's a public variable

        System.out.println("Volleyball: " + myBall.getColor() + " " + myBall.getName());
        myBall.bounce();

        // Basketball subclass
        Basketball myBasketball;
        myBasketball = new Basketball("Orange", 12);
        myBasketball.setNBA(true);
        System.out.println("\n" +"Basketball: " + myBasketball.getColor() + " " + myBasketball.getName() + " " +
                "NBA = " + myBasketball.getNBA());
        myBasketball.bounce();
    } // main
} // Main