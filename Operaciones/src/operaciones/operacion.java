
package operaciones;

import java.util.Scanner;

/**
 *
 * @author Meza Duran
 */
public class operacion {
    public int [] arreglo = new int[10];
    public int opcion;
    //constructor
    public operacion (){
        this.mostrarMenu();
    }
    //muestra el menu en pantalla
    public void mostrarMenu(){
        System.out.println("\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n"
        +"\n");
        System.out.println("1.Leer Arrays\n"
                + "2.Escribir arrays\n"
                + "3.Sumatoria\n"
                + "4.Productoria\n"
                + "5.Tamaño del array\n"
                + "6.Salir\n"
                + "-------------Seleccionar opcion-----------------");
        Scanner sc = new Scanner ( System.in );
        opcion = sc.nextInt();
        this.cargarOpcion(opcion);
    }
    //lee arreglo
    public void leerArreglo(){
        System.out.println("Su eleccion es 'leer arreglo'");
        this.mostrarMenu();
    }
    //escribir arreglo
    public void ecribirArreglo(){
        System.out.println("Su eleccion es 'escribir arreglo'");
        this.mostrarMenu();
    }
    //genera sumatoria
    public void sumatoria(){
        System.out.println("Su eleccion es 'sumatoria'");
        this.mostrarMenu();
    }
    //genera productoria 
    public void productoria (){
        System.out.println("Su eleccion es 'productoria'");
        this.mostrarMenu();
    }
    public void cargarOpcion (int op){
        switch(op){
            case 1:
                this.leerArreglo();
                break;
            case 2:
                this.ecribirArreglo();
                break;
            case 3:
                this.sumatoria();
                break;
            case 4:
                this.productoria();
                break;
            case 5: 
                System.out.println(this.arreglo.length);
                break;
                
            default:
                System.out.println("opcion no valida");
                
        }
    }
}
