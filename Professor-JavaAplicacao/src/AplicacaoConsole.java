/**
 * IFPB - TSI/POO
 * Prof. Fausto Ayres
 * 
 * Jogo de advinhacao - aplica��o console
 * 
 */

 import java.util.Scanner;

 public class AplicacaoConsole {
 
     public static void main(String[] args) {
         try {
             System.out.println("JOGO DE ADVINHACAO - CONSOLE");
             Scanner teclado = new Scanner(System.in);
             JogoAdvinhacao jogo = new JogoAdvinhacao(99);	//99 � o maximo
             int palpite;
             do{
                 try {
                     System.out.println("Digite um numero entre 0 e 99");
                     String linha = teclado.nextLine();
                     palpite = Integer.parseInt(linha);
 
                     if(jogo.adivinhou(palpite))
                         System.out.println("acertou");
                     else
                         System.out.println("errou - "+ jogo.getDica());
                 }
                 catch(NumberFormatException erro) {
                     System.out.println("formato n�o numerico - digite apenas numeros");
                 }
                 catch(Exception erro) {
                     System.out.println(erro.getMessage());
                 }
             }while(!jogo.terminou());
 
             System.out.println("\nGAME OVER - Resultado Final");
             System.out.println(jogo.resultado());
             teclado.close();
         }
         catch(Exception erro) {
             System.out.println(erro.getMessage());
         }
 
     }
 
 }
 