/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinn
 */
public class mypattern {
    public static void main(String[] args){
        int num=5;
        for(int i=0;i<=num;i++)
        {
            for(int j=5;j<=i*5-0;j+=5)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    
}
