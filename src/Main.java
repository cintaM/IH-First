import java.util.*;
public class Main {
    public static void main(String[] args) {
        //EJERCICIO 1
        int[] numero = {5, 4, 3, 7, 28};
        int[] numeroDos = new int[numero.length];
        //(OTRA OPCION)
        //numeroDos[numeroDos.length -1] = numero[0] * numero[numero.length -1];
        for(int i = 0; i < numero.length; i++){
            if(i == numero.length - 1){
                numeroDos[i] = numero[i]*numero[0];
            } else {
            numeroDos[i] = numero[i]*numero[i+1];}
            System.out.println(numeroDos[i]);
        }



        //EJERCICIO 2
        //int[] ordenarNum = {1, 2, 7, 4, 25};
        //int[] ordenado = new int[ordenarNum.length];
        //for(int i = ordenarNum.length -1; i >= 0; i--){
        //ordenado[i] = ordenarNum[i];
        // System.out.println(ordenarNum[i]);
        //}

    }
}