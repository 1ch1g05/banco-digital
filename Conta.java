
abstract class Conta {
    protected static int sequencial = 1;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    protected Conta(Cliente cliente) {
        this.numero = sequencial++;
        this.cliente = cliente;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirExtrato() {
        System.out.println("Número da Conta: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }
}