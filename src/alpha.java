/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinn
 */
public class alpha {
    public static void main(String[] args){
        char alpha=65;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(alpha+j) +" ");
            }
            System.out.println();
        }
    }
    
}
