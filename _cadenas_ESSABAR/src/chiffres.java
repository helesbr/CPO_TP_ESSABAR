/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author helia
 */
public class chiffres {
    
private int case1;  
private int case2;
private int case3;
private int case4;    

    public int getCase1() {
        return case1;
    }

    public int getCase2() {
        return case2;
    }

    public int getCase3() {
        return case3;
    }

    public int getCase4() {
        return case4;
    }

    public void chiffreAleat(){
        case1 = (int)(Math.random()*10);
        case2 = (int)(Math.random()*10);
        case3 = (int)(Math.random()*10);
        case4 = (int)(Math.random()*10);
    }
}
