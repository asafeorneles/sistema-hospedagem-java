package model;

import java.time.LocalDateTime;

public class Reserva {
    protected LocalDateTime dataCheckin;
    protected LocalDateTime dataCheckout;
    protected Quarto quarto;
    private Cliente cliente;
    private long diarias;

    public Reserva(LocalDateTime dataCheckin, LocalDateTime dataCheckout, Quarto quarto, Cliente cliente) {
        this.dataCheckin = dataCheckin;
        this.dataCheckout = dataCheckout;
        this.quarto = quarto;
        this.cliente = cliente;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
