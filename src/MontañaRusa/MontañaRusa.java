/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MontañaRusa;

/**
 *
 * @author david
 */
public class MontañaRusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Solution s = new Solution();
        
        int[] A = new int[12];        
        A[0]  = 2;
        A[1]  = 2;
        A[2]  = 3;
        A[3]  = 4;
        A[4]  = 3;
        A[5]  = 3;
        A[6]  = 2;
        A[7]  = 2;
        A[8]  = 1;
        A[9]  = 1;
        A[10] = 2;
        A[11] = 5;
        
        System.out.println(""+s.solution(A));
        
    }
    
}
