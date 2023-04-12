/**
bb * IFPB - TSI/POO
 * Prof. Fausto Ayres
 * 
 * Jogo de advinhacao - regras do jogo
 * 
 * apenas 6 tentativas para acertar o numero sorteado
 * 
 */

 import java.util.Random;

 public class JogoAdvinhacao {
     private int contador;
     private int numeroSorteado;
     private int numeroJogado;
     private final int MAXIMO;
 
     public JogoAdvinhacao(int maximo)  throws Exception	{
         if(maximo <= 0 || maximo >99) 
             throw new Exception("limite maximo invalido");
         MAXIMO=maximo;
         contador=0;	
         Random random = new Random();
         numeroSorteado = random.nextInt(MAXIMO+1);
     }
     
     public boolean adivinhou(int palpite)  throws Exception {
         if(palpite<0 || palpite>MAXIMO) 
             throw new Exception("o numero esta fora da faixa permitida= 0 e " +MAXIMO);
 
         contador++;
         numeroJogado = palpite;
         if(palpite==numeroSorteado)
             return true;
         else 
             return false;
     }
     
     public String getDica()  {
         String dica="";
         if(contador==0 || terminou())
             return "n�o ha dica";
 
         if(numeroJogado < numeroSorteado)
             dica+="tente um numero MAIOR";
         else
             dica+="tente um numero MENOR";
 
         if(Math.abs(numeroJogado-numeroSorteado) <= 5)
             dica+=", esta QUENTE";
         else
             dica+=", esta FRIO";
         return dica;
     }
     public boolean terminou() {
         if(numeroJogado==numeroSorteado)
             return true;
         else
             if(contador==6)
                 return true;
             else
                 return false;
     }
     
     
     public String resultado() throws Exception	{
         if(! terminou())
             throw new Exception("n�o tem resultado - jogo nao terminou");
 
         if(numeroJogado==numeroSorteado) 
             return "ganhou com " + contador + " tentativa(s)";
         else
             return "perdeu, terminaram as 6 tentativas !!";
 
     }
     public int getTentativas() {
         return contador;
     }
     public int getLimiteMaximo() {
         return MAXIMO;
     }
 
 }
 
 