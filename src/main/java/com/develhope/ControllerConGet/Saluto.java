package com.develhope.ControllerConGet;

public class Saluto {
    private String nome;
    private String provincia;
    private final String saluto;

    public Saluto(String nome, String provincia) {
        this.nome = nome;
        this.provincia = provincia;
        this.saluto = " ciao "  +  nome  + ", com'è il tempo in " + provincia + " ? ";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegione() {
        return provincia;
    }

    public void setRegione(String regione) {
        this.provincia = regione;
    }

    public String getSaluto() {
        return saluto;
    }

}
