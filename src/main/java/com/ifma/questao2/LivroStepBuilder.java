package com.ifma.questao2;

import java.util.Arrays;
import java.util.List;

public class LivroStepBuilder {

    public static FirstNameStep newBuilder() {
        return new Steps();
    }

    private LivroStepBuilder(){

    }

    public static interface FirstNameStep {
        AnoStep nomeDoLivroNacional(String nome);
    }

    public static interface AnoStep {
        AuthorStep publicadoEm(Integer anoPublicacao);
    }

    public static interface AuthorStep {
        EdicaoStep dosAutores(String... name);

    }

    public static interface EdicaoStep {
        EditoraStep edicao(Integer edicao);
    }

    public static interface EditoraStep {
       NomeOriginalStep daEditora(String name);
    }

    public static interface NomeOriginalStep {
       TradutorStep nomeOriginal(String name);
    }

    public static interface TradutorStep {
        PaginaStep dosTradutores(String... tradutores);
    }

    public static interface PaginaStep {
       IsbnStep paginas(Integer paginas);
    }

    public static interface IsbnStep {
        BuildStep isbn(Long isbn);
    }
    public static interface BuildStep {
        Livro build();
    }

    private static class Steps implements FirstNameStep, AnoStep,AuthorStep,EdicaoStep, EditoraStep,
    NomeOriginalStep, TradutorStep, PaginaStep, IsbnStep,BuildStep{
        private String nomeNacional;

        private Integer anoPublicacao;

        private List<String> autores;

        private Integer edicao;



        private String editora;

        private String nomeOriginal;

        private List<String> tradutores;

        private Integer paginas;

        private Long isbn;

        @Override
        public AnoStep nomeDoLivroNacional(String nomeNacional) {
            this.nomeNacional = nomeNacional;
            return this;
        }

        @Override
        public AuthorStep publicadoEm(Integer anoPublicacao) {
            this.anoPublicacao = anoPublicacao;
            return this;
        }

        @Override
        public EdicaoStep dosAutores(String... autores) {
            this.autores = Arrays.stream(autores).toList();
            return this;
        }

        @Override
        public EditoraStep edicao(Integer edicao) {
            this.edicao = edicao;
            return this;
        }

        @Override
        public NomeOriginalStep daEditora(String editora) {
           this.editora = editora;
           return this;
        }

        @Override
        public TradutorStep nomeOriginal(String nomeOriginal) {
            this.nomeOriginal = nomeOriginal;
            return this;
        }

        @Override
        public PaginaStep dosTradutores(String... tradutores) {
            this.tradutores = Arrays.stream(tradutores).toList();
            return this;
        }

        @Override
        public IsbnStep paginas(Integer paginas) {
           this.paginas = paginas;
           return this;
        }

        @Override
        public BuildStep isbn(Long isbn) {
            this.isbn = isbn;
            return this;
        }

        @Override
        public Livro build() {
            Livro livro = new Livro();
            livro.setAno(this.anoPublicacao);
            livro.setAutores(this.autores);
            livro.setEdicao(this.edicao);
            livro.setIsbn(this.isbn);
            livro.setNomeNacional(this.nomeNacional);
            livro.setEditora(this.editora);
            livro.setNomeOriginal(this.nomeOriginal);
            livro.setTradutores(this.tradutores);
            livro.setPaginas(this.paginas);
            return livro;
        }
    }
}
