import java.time.LocalDateTime;

public class Transacao {
    private LocalDateTime dataHora;
    private String tipo;
    private double valor;

    public Transacao(String tipo, double valor) {
        this.dataHora = LocalDateTime.now();
        this.tipo = tipo;
        this.valor = valor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "dataHora=" + dataHora +
                ", tipo='" + tipo + '\'' +
                ", valor=" + valor +
                '}';
    }
}
