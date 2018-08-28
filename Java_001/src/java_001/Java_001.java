/*Probando Extructuras de Vectores
Programa donde se desee guardar el sueldo de 5 personas, y consultarlos mas adelnate.
 */
package java_001;
import java.util.Scanner;


public class Java_001 {
private Scanner sc = new Scanner(System.in);
private int[] sueldo;



 public void Consulta()
 {
     sueldo = new int[5];
     for (int s = 0; s < 5; s++)
     {
         System.out.println("Ingrese Sueldo a guardar: ");
         sueldo[s] = sc.nextInt();
     }
 }
 
 
 public void imprimir()
 {
     for (int s = 0; s < 5; s++)
     {
         System.out.println("  ");
         System.out.println(" salario guardado: "+sueldo[s]);
     }
 
 }

    public static void main(String[] args) 
    {
        Java_001 jv1 = new Java_001();
        jv1.Consulta();
        jv1.imprimir();
    }
    
}
