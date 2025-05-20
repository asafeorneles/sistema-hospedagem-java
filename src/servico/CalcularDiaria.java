package servico;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalcularDiaria {

    public static int CalcularDiaria(LocalDateTime dataTimeCheckin, LocalDateTime dataTimeCheckout) {
        int diarias = 0;

        long diariasTemp = ChronoUnit.DAYS.between(dataTimeCheckin, dataTimeCheckout);

        if (dataTimeCheckout.getHour() > 12 || (dataTimeCheckout.getHour() == 12 && dataTimeCheckout.getMinute() > 0)){
            diariasTemp ++;
        }

        diarias  = (int) diariasTemp;

        return diarias == 0 ? 1 : diarias;
    }

}
