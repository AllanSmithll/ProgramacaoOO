//28/02/2023
// Strings Mutáveis -> StringBuffer e StringBuilder

public class StringsDMutaveis {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("");
        buffer.append("joao"); // ”joao”
        buffer.append("silva"); // ”joaosilva”
        buffer.insert(4, " da "); // ”joao da silva”
        buffer.replace(8,12,"sousa"); // ”joao da sousa”
        String s = buffer.toString(); // ”joao da sousa”
        System.out.println(s);
    }
}
