// 28/02/2023
// Separar e juntar strings

public class StringsBSepararJuntar {
    public static void main(String[] args) {
        String texto = "11-01-2021";
        //separar as partes
        String[] partes = texto.split("-"); //["11","01","2021"]
        //juntar as partes
        texto = String.join("/", partes); // "11/01/2021"

        //separar caracteres
        texto = "maria";
        String[] letras = texto.split("");// [“m”,“a”,“r”,“i”,“a”]
        System.out.println(letras);
    }
}
