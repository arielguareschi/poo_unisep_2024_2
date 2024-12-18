package br.edu.unisep.cidade.model;

public class Cidade {
    private int id;
    private String nome;
    private String uf;

    public Cidade() {
    }

    public Cidade(int id, String nome, String uf) {
        this.id = id;
        this.nome = nome;
        this.uf = uf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }

    // 1;Saudades do Pago;RS
    public String toFileString(){
        return this.id + ";" +
                this.nome + ";" + this.uf;
    }

    public void toObject(String txt){
        String[] objeto = txt.split(";");
        this.setId(Integer.parseInt(objeto[0]));
        this.setNome(objeto[1]);
        this.setUf(objeto[2]);
    }
}
