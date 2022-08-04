package Ex02;

/**
 *
 * @author Jv Loreti
 */

public class Main{
    public static void main(String args[]){
        Robo robo;
        
        //robo = new Robo();
        //robo = new Robo("John");
        robo = new Robo("John", 'L', 10, 0);
        
        //robo.move();
        robo.move(5);
        //robo.moveParaTras();
        robo.moveParaTras(3);
        
        robo.relatarDados();
    }
}
