
package class1;

public class BreakAndContinue {
    
    public static void main (String [] args){
        
        for (int i=1; i<=100; i+=2){
            if (i==10){
                continue;
            }
            
            if (i>13){
                break;
            }
            System.out.println(i);
        
        }
    
    
    }
    
}
