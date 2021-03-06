package exercicio03;

public abstract class Conta {

    private int numero;
    private String nome;
    private double saldo;

    public Conta(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double rendimento() {
        return saldo;
    }

    @Override
    public String toString() {
        return
                "Dados da conta: " +
                        "\nNumero: " + numero +
                        "\nNome: " + nome +
                        "\nSaldo: R$" + String.format("%.2f", saldo);
    }
}
