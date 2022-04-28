package br.com.dio;

import br.com.dio.model.Cachorro;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        System.out.println(cachorro);

        Filme filme = new Filme("A Rede Social", 2010);
        System.out.println(filme);

    }

}

class Filme {
    private String nome;
    private Integer anoLanc;

    public Filme(String nome, Integer anoLanc) {
        this.nome = nome;
        this.anoLanc = anoLanc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoLanc() {
        return anoLanc;
    }

    public void setAnoLanc(Integer anoLanc) {
        this.anoLanc = anoLanc;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", anoLanc=" + anoLanc +
                '}';
    }
}
