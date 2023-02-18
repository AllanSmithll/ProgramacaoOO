// 16/02/2023
import java.util.Random;

public class AloMundo {
    public static void main(String[] args) throws Exception {

        // 01 - Print simples
        System.out.println("Olá mundo! Aqui quem vos escreve é o Allan Amâncio"); // Simple print

        // 02 - Propriedades do S0
        System.out.print("Vai ter uma quebra de linha abaixo, mesmo sem 'println'.");
        System.out.println(System.getProperty("line.separator")); // Line separator of the SO. \r\n no Windows
        System.out.println(System.getProperty("os.name")); // Name of the OS
        System.out.println(System.getProperty("os.arch")); // SO's architecture
        System.out.println(System.getProperty("os.version")); // SO's version
        System.out.println(System.getProperty("path.separator")); // O separador de caminho específico da plataforma. Para Windows -> ;
        System.out.println(System.getProperty("user.dir")); // O diretório de trabalho atual
        System.out.println(System.getProperty("user.home")); // O diretório-base do usuário
        System.out.println(System.getProperty("user.language")); // O código de idioma da região padrão
        System.out.println(System.getProperty("user.name")); // Nome do usuário
        System.out.println(System.getProperty("user.timezone")); // O fuso horário do sistema

        // 03 - Bibliotecas
		System.out.println( new Random().nextInt(100)); // Draw between numbers from 0 to 100
        
    }
}
