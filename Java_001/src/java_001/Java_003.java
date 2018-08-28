/*
Probando Vectores
Crear un programa que permita ingresar la altura de 5 personas y al fina diga
cual de estas personas son altas y cuales bajas
 */
package java_001;
import java.util.Scanner;


public class Java_003
{
    Scanner sc = new Scanner(System.in);
    private float[] altura;
    private float promedio = 0;
    private int menor = 0;
    private int mayor = 0;
    
    public void cargar()
    {
      altura = new float[5];
      for (int a = 0; a < 5; a++) 
        {
        System.out.println("Ingrese su altura: ");
        altura[a] = sc.nextFloat();
        }
    }
    public void MayMen()
    {   
        for (int a = 0; a <5; a++) 
        {
            if(altura[a]<1.70)
            {
                menor ++;
            }else
            {
                mayor ++;
            }
        }
    }   
    public void pro()
    {   float suma = 0;
        for (int a = 0; a < 5; a++) 
        {
        suma = suma + altura[a]; 
        promedio = suma/5;
        }
    }        
    public void imprimir()
    {
        System.out.println("personas altas: "+mayor);
        System.out.println("personas menores "+menor);
        System.out.println("el promedio es: "+promedio); 
        for (int a = 0; a < a; a++)
        {
            System.out.println("alturas ingresadas: "+altura[a]);   
        }
    }
    public  static  void main(String[]args)
    {
      Java_003 jv3 = new Java_003();  
      jv3.cargar();
      jv3.pro();
      jv3.MayMen();
      jv3.imprimir();
    }
}