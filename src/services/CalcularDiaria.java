package services;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalcularDiaria {

    public static int CalcularDiaria(LocalDateTime dataTimeCheckin, LocalDateTime dataTimeCheckout) {

        long diariasTemp = ChronoUnit.DAYS.between(dataTimeCheckin.toLocalDate(), dataTimeCheckout.toLocalDate());

        int diarias  = (int) diariasTemp;

        if (dataTimeCheckout.getHour() > 12 || (dataTimeCheckout.getHour() == 12 && dataTimeCheckout.getMinute() > 0)){
            diarias++;
        }

        return diarias;
    }

}
