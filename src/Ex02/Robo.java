package Ex02;

/**
 *
 * @author Jv Loreti
 */

import javax.swing.JOptionPane;

public class Robo{
    private String nome;
    private char orientacao;
    private int x;
    private int y;
    
    public Robo(String n, char d, int x, int y){
        this.nome = n;
        this.orientacao = d;
        this.x = x;
        this.y = y;
    }
    
    public Robo(String n){
        this(n, 'N', 0, 0);
    }
    
    public Robo(){
        this("", 'N', 0, 0);
    }
    
    public void move(int passos){
        if(this.orientacao == 'N'){
            this.y+= passos;
        }
        if(this.orientacao == 'S'){
            this.y-= passos;
        }
        if(this.orientacao == 'L'){
            this.x+= passos;
        }
        if(this.orientacao == 'O'){
            this.x-= passos;
        }
    }
    
    public void move(){
        if(this.orientacao == 'N'){
            this.y++;
        }
        if(this.orientacao == 'S'){
            this.y--;
        }
        if(this.orientacao == 'L'){
            this.x++;
        }
        if(this.orientacao == 'O'){
            this.x--;
        }
    }
    
    public void moveParaTras(int passos){
        move(-passos);
    }
    
    public void moveParaTras(){
        if(this.orientacao == 'N'){
            this.y--;
        }
        if(this.orientacao == 'S'){
            this.y++;
        }
        if(this.orientacao == 'L'){
            this.x--;
        }
        if(this.orientacao == 'O'){
            this.x++;
        }
    }
    
    public void relatarDados(){
        if(!"".equals(nome)){
            JOptionPane.showMessageDialog(null, "[" + this.nome + "] (" + this.x + ", " + this.y + ") Orientação: " + this.orientacao);
        }else{
            JOptionPane.showMessageDialog(null, "(" + this.x + ", " + this.y + ") Orientação: " + this.orientacao);
        }
    }
}
