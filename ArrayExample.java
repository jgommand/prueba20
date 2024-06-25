import java.util.Arrays;
//holaaaaaaa
//pruebaaa
import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = new int[10];
        
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) + 1; // Genera un número entre 1 y 100
        }
        
        System.out.println("Array inicial:");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        
        // Invertir el array para que esté en forma descendente
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        
        System.out.println("Array ordenado en forma descendente:");
        System.out.println(Arrays.toString(array));
    }
}

