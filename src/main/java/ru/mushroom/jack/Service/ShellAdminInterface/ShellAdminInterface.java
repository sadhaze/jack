package ru.mushroom.jack.Service.ShellAdminInterface;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class ShellAdminInterface {
    private String mesh[][] = new String[80][24];

    public ShellAdminInterface(){
        for(int i = 0; i < 80; i++){
            for (int k = 0; k < 24; k++){
               mesh[i][k] = "+";
            }
        }
        this.startSAI();
    }

    public void startSAI(){

        /*putUnit(40, 13, "@");
        //Console console = System.console();
        Scanner input = new Scanner(System.in);
        String key = "";
        while(key != "1"){
            for(int i = 0; i < 24; i++){
                for (int k = 0; k < 80; k++){
                    System.out.print(mesh[k][i]);
                }
                System.out.print("\n");
            }
            key = input.next();
            System.out.println(key);
            System.out.println(key.compareTo("1"));
        }*/
    }

    public void putUnit(Integer x, Integer y, String unit){
        this.mesh[x][y] = unit;
    }
}
