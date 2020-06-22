
package problems;

public class problem1 {
    
    double height, weight, depth;
    
    problem1 (double height, double weight, double depth){
        
        this.height = height;
        this.weight = weight;
        this.depth = depth;
    }

    problem1(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void print (){
        
        double vol = height * weight * depth;
        System.out.println("volume is : " + vol);
        System.out.println();
        
    }
}
