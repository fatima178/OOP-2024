package ie.tudublin;

public class Cat{
    private int numLives;

    public Cat() {
        this.numLives = 9;
    }

    public int getNumLives() {
        return numLives;
    }

    public void kill() {
        if (numLives > 0) {
            numLives--;
            System.out.println("Ouch!"); 
            
        } 
        if (numLives == 0){
            System.out.println("Dead");
        }
    }

    public static void main(String[] args) {
        Cat ginger = new Cat();

        while (ginger.getNumLives() > 0) {
            ginger.kill();
        }
    }
}

