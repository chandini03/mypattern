/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinn
 */
public class alpharev {
    public static void main(String[] args){
        
        for(int i=1;i<=5;i++)
        {
            for(int j=5-i;j>=0;j--)
            {
                System.out.print((char)(65+j) +" ");
            }
            System.out.println();
        }
    }
    
}
