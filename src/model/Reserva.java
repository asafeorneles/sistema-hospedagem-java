package model;

import java.time.LocalDateTime;

public class Reserva {
    protected LocalDateTime dataCheckin;
    protected LocalDateTime dataCheckout;
    protected Quarto quarto;
    private long diarias;

    public Reserva(LocalDateTime dataCheckin, LocalDateTime dataCheckout, Quarto quarto) {
        this.dataCheckin = dataCheckin;
        this.dataCheckout = dataCheckout;
        this.quarto = quarto;
    }


    public LocalDateTime getDataCheckin() {
        return dataCheckin;
    }

    public void setDataCheckin(LocalDateTime dataCheckin) {
        this.dataCheckin = dataCheckin;
    }

    public LocalDateTime getDataCheckout() {
        return dataCheckout;
    }

    public void setDataCheckout(LocalDateTime dataCheckout) {
        this.dataCheckout = dataCheckout;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public long getDiarias(){
        return this.diarias;
    }

    public void setDiarias(long diarias){
        this.diarias = diarias;
    }

}
