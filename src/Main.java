
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {

        LocalDate oggi = LocalDate.now();


        LocalDate fineMese = oggi.withDayOfMonth(oggi.lengthOfMonth());
        long giorniAFineMese = ChronoUnit.DAYS.between(oggi, fineMese);
        System.out.println("Giorni mancanti alla fine del mese: " + giorniAFineMese);

        LocalDate fineAnno = oggi.withDayOfYear(oggi.lengthOfYear());
        long giorniaFineAnno = ChronoUnit.DAYS.between(oggi, fineAnno);
        System.out.println("Giorni mancanti alla fine dell'anno: " + giorniaFineAnno);

    }
}

