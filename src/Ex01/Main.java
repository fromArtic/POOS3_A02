package Ex01;

/**
 *
 * @author Jv Loreti
 */

public class Main{
    public static void main(String args[]){
        Robo robo;
        
        //robo = new Robo();
        //robo = new Robo("John");
        robo = new Robo("John", 'S', 5, -25);
        
        //robo.move();
        robo.move(5);
        
        robo.relatarDados();
    }
}
