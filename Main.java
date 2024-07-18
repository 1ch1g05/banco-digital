public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Digital");

        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Marina", "246.357.981-00");

        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        Conta contaCorrente1 = new ContaCorrente(cliente1);
        Conta contaPoupanca1 = new ContaPoupanca(cliente1);

        Conta contaCorrente2 = new ContaCorrente(cliente2);
        Conta contaPoupanca2 = new ContaPoupanca(cliente2);

        banco.adicionarConta(contaCorrente1);
        banco.adicionarConta(contaPoupanca1);
        banco.adicionarConta(contaCorrente2);
        banco.adicionarConta(contaPoupanca2);

        contaCorrente1.depositar(1000);
        contaCorrente1.sacar(200);
        contaCorrente1.transferir(300, contaPoupanca1);

        contaCorrente1.imprimirExtrato();
        contaPoupanca1.imprimirExtrato();

        contaCorrente2.depositar(2000);
        contaCorrente2.sacar(500);
        contaCorrente2.transferir(1000, contaPoupanca2);

        contaCorrente2.imprimirExtrato();
        contaPoupanca2.imprimirExtrato();

        System.out.println("Clientes do banco:");
        for (Cliente cliente : banco.getClientes()) {
            System.out.println("Cliente: " + cliente.getNome());
        }

        System.out.println("Contas do banco:");
        for (Conta conta : banco.getContas()) {
            System.out.println("Conta número: " + conta.getNumero() + " - Cliente: " + conta.getCliente().getNome());
        }
    }
}