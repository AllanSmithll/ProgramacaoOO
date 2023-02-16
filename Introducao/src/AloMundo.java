// 16/02/2023
import java.util.Random;

public class AloMundo {
    public static void main(String[] args) throws Exception {

        // 01 - Print simples
        System.out.println("Olá mundo! Aqui quem vos escreve é o Allan Amâncio"); // Simple print

        // 02 - Propriedades do S0
        System.out.println(System.getProperty("os.name")); // Name of the OS
        System.out.println(System.getProperty("user.time")); // Name of the OS


        // 03 - Ramdom
		System.out.println( new Random().nextInt(100)); // Draw between numbers from 0 to 100
    }
}
