/* Averigua cuantos máximos y mínimos relativos tiene un array de enteros.
 * Donde se considera 5 como un máximo en 4, 5, 4, 3
 * e igualmente se definen los mínimos.
 * En el caso de haber un máximo o un mínimo formado por varios elementos 
 * este se contará como único 4, 5, 5, 4, 3 (5 es un solo máximo).
 * Los extremos podrán ser considerados máximos o mínimos.
 */
package MontañaRusa;

/**
 *
 * @author david
 */
class Solution {
    
    enum Direccion{ SUBIENDO, BAJANDO, ESTABLE};
    
    public int solution(int[] A) {
        
        int extremos = 0;
        Direccion direccion = Direccion.ESTABLE;
        
        for (int i = 0; i < A.length-1; i++) {
            
            if(A[i] < A[i+1] && direccion == Direccion.BAJANDO){
                //hay un minimo
                direccion = Direccion.SUBIENDO;
                extremos++;
            }
            else if(A[i] > A[i+1] && direccion == Direccion.SUBIENDO){
                //hay un maximo
                direccion = Direccion.BAJANDO;
                extremos++;
            }
            else if(direccion == Direccion.ESTABLE){
                if(A[i] < A[i+1]){
                    direccion = Direccion.SUBIENDO;
                    extremos++;
                }
                else if(A[i] > A[i+1]){
                    direccion = Direccion.BAJANDO;
                    extremos++;
                }
            }           
            
        }
        
        return extremos+1;
    }
}

