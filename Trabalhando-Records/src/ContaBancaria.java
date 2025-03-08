

public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    private double limiteChequeEspecial;
    private boolean usandoChequeEspecial;

    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;
        if (depositoInicial <= 500) {
            this.chequeEspecial = 50;
        } else {
            this.chequeEspecial = depositoInicial * 0.5;
        }
        this.limiteChequeEspecial = this.saldo + this.chequeEspecial;
        this.usandoChequeEspecial = false;
    }

    public void consultarSaldo() {
        System.out.println("Saldo: R$" + saldo);
    }

    public void consultarChequeEspecial() {
        System.out.println("Cheque especial disponível: R$" + chequeEspecial);
    }

    public void depositar(double valor) {
        if (usandoChequeEspecial) {
            double valorDevolvido = Math.min(valor, -saldo);
            saldo += valorDevolvido;
            chequeEspecial += valorDevolvido;
            if (saldo >= 0) {
                usandoChequeEspecial = false;
                cobrarTaxaChequeEspecial();
            }
            valor -= valorDevolvido;
        }
        saldo += valor;
        limiteChequeEspecial = saldo + chequeEspecial;
        System.out.println("Depósito de R$" + valor + " realizado.");
    }

    public void sacar(double valor) {
        if (saldo + chequeEspecial >= valor) {
            if (saldo >= valor) {
                saldo -= valor;
            } else {
                double valorChequeEspecial = valor - saldo;
                saldo = 0;
                chequeEspecial -= valorChequeEspecial;
                usandoChequeEspecial = true;
            }
            System.out.println("Saque de R$" + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void pagarBoleto(double valor) {
        sacar(valor);
        System.out.println("Boleto de R$" + valor + " pago.");
    }

    public void verificarChequeEspecial() {
        if (usandoChequeEspecial) {
            System.out.println("Conta usando cheque especial.");
        } else {
            System.out.println("Conta não está usando cheque especial.");
        }
    }

    private void cobrarTaxaChequeEspecial() {
        double taxa = -saldo * 0.2;
        saldo += taxa;
        System.out.println("Taxa de cheque especial de R$" + taxa + " cobrada.");
    }
}