import java.util.*;
 
public class Solution {
    public static void main(String[] args){
      
        Scanner in = new Scanner(System.in);
      
         for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ;j < 5 ; j++){
             if(in.nextInt() == 1){
               System.out.println( Math.abs(2-j) + Math.abs(2-i));
               break;
             }
           }  
         }
        
    }    
}
