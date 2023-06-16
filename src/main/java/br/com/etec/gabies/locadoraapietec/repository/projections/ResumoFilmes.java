package br.com.etec.gabies.locadoraapietec.repository.projections;

public class ResumoFilmes {

    private Long id;
    private String nomefilme;
    private String descricao;
    private String nomeator;


    public ResumoFilmes(Long id,String nomefilme, String descricao,String nomeator){
        this.id = id;
        this.nomefilme = nomefilme;
        this.descricao = descricao;
        this.nomeator = nomeator;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomefilme() {
        return nomefilme;
    }

    public void setNomefilme(String nomefilme) {
        this.nomefilme = nomefilme;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeator() {
        return nomeator;
    }

    public void setNomeator(String nomeator) {
        this.nomeator = nomeator;
    }
}
