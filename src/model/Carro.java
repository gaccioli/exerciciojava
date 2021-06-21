package model;

public class Carro {

    private String marca;
    private int qtdPessoa;
    private int passageiro;


    //contrutor Simples
    public Carro(){
        super();
    }

    //contrutor completo
    public Carro(String marca, int qtdPessoa){
        super();
        this.marca = marca;
        this.qtdPessoa = qtdPessoa;
        passageiro=0;
    }


    public void adicionaPassageiro(){
        passageiro++;
    }

    public void removePassageiro(){
        passageiro--;
    }

    public int getQtdPessoa() {
        return qtdPessoa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setQtdPessoa(int qtdPessoa) {
        this.qtdPessoa = qtdPessoa;
    }
}
