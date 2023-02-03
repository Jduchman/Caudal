
package modelo;

/**
 *
 * @author Duchman
 */
public class CaudalUniforme {

    public static void main(String[] args) {

       float num1 = (float) 10.12358;
       float num3 = (float) 10.12352;
       
       if((int)(num1*10000) == (int)(num3*10000)){
           System.out.println("son iguales");
       } else {
           System.out.println("No entro");
       }


    }
    
    //ta bien
}
