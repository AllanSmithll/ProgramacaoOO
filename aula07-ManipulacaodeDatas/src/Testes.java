/*
 * 28/03/2023 - Manipulação de datas
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Testes {
    public static void main(String[] args) throws Exception {
        System.out.println("Testes de Manipulação de datas");
        System.out.print("Quantos milissegundos há desde 1/1/1970: ");
    System.out.println(System.currentTimeMillis());

    // criar objeto a partir do computador
    LocalDate hoje = LocalDate.now(); // curto
    LocalDateTime agora = LocalDateTime.now(); // Completo
    System.out.println(hoje);
    System.out.println(agora);

    // Criar um objeto a partir de dados fornecidos
    LocalDate d1 = LocalDate.of(2023, Month.MARCH, 28);
    LocalDateTime d2 = LocalDateTime.of(2023, Month.MARCH, 28, 22, 11, 50);
    System.out.println(d1);
    System.out.println(d2);

    // Criar objeto usando String formatada
    // Utiliza-se um formatador
    DateTimeFormatter f1, f2;
    f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    System.out.println(f1);
    System.out.println(f2);

    // data curta
    LocalDate df1 = LocalDate.parse("03/02/2023");
    System.out.println(df1);

    // data completa
    LocalDateTime df2 = LocalDateTime.parse("03/04/2022 14:30:00");
    System.out.println(df2);

    // CONVERTATENDO OBJETO PARA STRING FORMTADA
    // Utiliza-se um formatador
DateTimeFormatter sf1, sf2;
sf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
sf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

//data curta
System.out.println(hoje.format(sf1));

//data completa
System.out.println(agora.format(sf2));

    // ACESSANDO PARTES DA DATA
    LocalDate momento_atual = LocalDate.now(); //computador
System.out.println(momento_atual.getYear());
System.out.println(momento_atual.getMonthValue());
System.out.println(momento_atual.getMonth());
System.out.println(momento_atual.getDayOfMonth());
System.out.println(momento_atual.getDayOfWeek());
System.out.println(momento_atual.getDayOfWeek().
getDisplayName(TextStyle.FULL,Locale.getDefault()));

LocalDateTime aquiAgora= LocalDateTime.now(); //computador
System.out.println(aquiAgora.getYear());
System.out.println(aquiAgora.getHour());
System.out.println(aquiAgora.getMinute());

    // Partes da data
    LocalDate amanha = hoje.plusDays(1);
    LocalDate ontem = hoje.minusDays(1);
    LocalDate outra = hoje.plusWeeks(1).minusDays(2);
    LocalDateTime jaja = agora.plusMinutes(5);
    System.out.println(amanha);
    System.out.println(ontem);
    System.out.println(outra);
    System.out.println(jaja);

    // Período entre duas datas
    LocalDate nascimento = LocalDate.of(1990,Month.APRIL,30);
LocalDate h = LocalDate.now();

Period p = Period.between(nascimento, h);
int a = p.getYears(); //anos
int m = p.getMonths(); //meses
int d = p.getDays(); //dias
System.out.println(p);
    }
}
