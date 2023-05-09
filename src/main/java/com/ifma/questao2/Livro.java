package com.ifma.questao2;

import java.util.List;

public class Livro {

    private String nomeNacional;

    private Integer ano;

    private List<String> autores;

    private Integer edicao;



    private String editora;

    private String nomeOriginal;

    private List<String> tradutores;

    private Integer paginas;

    private Long isbn;

    public String getNomeNacional() {
        return nomeNacional;
    }

    public void setNomeNacional(String nomeNacional) {
        this.nomeNacional = nomeNacional;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public List<String> getAutores() {
        return autores;
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    }

    public Integer getEdicao() {
        return edicao;
    }

    public void setEdicao(Integer edicao) {
        this.edicao = edicao;
    }


    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getNomeOriginal() {
        return nomeOriginal;
    }

    public void setNomeOriginal(String nomeOriginal) {
        this.nomeOriginal = nomeOriginal;
    }

    public List<String> getTradutores() {
        return tradutores;
    }

    public void setTradutores(List<String> tradutores) {
        this.tradutores = tradutores;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nomeNacional='" + nomeNacional + '\'' +
                ", ano=" + ano +
                ", autores=" + autores +
                ", edicao=" + edicao  + '\'' +
                ", editora='" + editora + '\'' +
                ", nomeOriginal='" + nomeOriginal + '\'' +
                ", tradutores=" + tradutores +
                ", paginas=" + paginas +
                ", isbn=" + isbn +
                '}';
    }
}
