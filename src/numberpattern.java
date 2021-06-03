/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinn
 */
public class numberpattern {
    public static void main(String[] args){
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j%2!=0)
                  System.out.print(1 );
                else
                    System.out.print(2 );
            }
            System.out.println();
        }
    }
    
}
