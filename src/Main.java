import java.lang.reflect.Array;
import java.util.Random;

public class Main {

    public static void main(String[] args)  {



        int[] array = new int[100];

        int[] array2 = new int[array.length];

        for(int i=0; i<array.length; i ++) {
            array[i] = (int) (Math.random() * 100);
            array2[i] = (int) (Math.random() * 100);
        }

        int valorBuscado=5;


        Hilo h1 = new Hilo(array, valorBuscado);
        Hilo h2 = new Hilo(array2, valorBuscado);


        h1.start();
        h2.start();

        while (h1.isAlive() || h2.isAlive()){

        }

        System.out.println("En el primer array el "+ valorBuscado + " está en "+ h1.getPosicion());
        System.out.println("En el segundo array el "+ valorBuscado + " está en "+ h2.getPosicion());

    }


}
