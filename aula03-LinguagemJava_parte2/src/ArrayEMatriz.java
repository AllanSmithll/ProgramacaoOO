// 28/02/2023
// Array bidimensional (matriz)
public class ArrayEMatriz {
    public static void main(String[] args) {
    //criação e inicialização
    int[][] matriz = new int[3][3];
    matriz[0][0] = 1;
    matriz[0][1] = 2;
    matriz[0][2] = 3;
    matriz[1][0] = 4;
    matriz[1][1] = 5;
    matriz[1][2] = 6;
    matriz[2][0] = 7;
    matriz[2][1] = 8;
    matriz[2][2] = 9;
    //criação e inicialização (outra forma)
    int[][] matrizB = {{1,2,3},{4,5,6}, {7,8,9}};
    System.out.println(matrizB[1][2]); // linha X coluna
}
}
