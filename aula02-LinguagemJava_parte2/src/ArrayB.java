// 28/02/2023
// Manipulando array
public class ArrayB {
    public static void main(String[] args) {
        int[] numeros = {8, 5, 30};

        for(int i=0; i<numeros.length; i++)
        numeros[i] = 2 * numeros[i];

        for(int n : numeros)

        System.out.println(n);
    }
}
