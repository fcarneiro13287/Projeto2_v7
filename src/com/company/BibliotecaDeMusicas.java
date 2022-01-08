package com.company;

public abstract class BibliotecaDeMusicas {
    private String nomeAlbum;
    private String titulo;
    private String compositor;
    private String interprete;
    private String ano;

    //contrutor sem parametros
    public BibliotecaDeMusicas() {
        this("Nenhum", "Nenhum", "Nenhum", "Nenhum", "");
    }

    //construtor com parametros
    public BibliotecaDeMusicas(String nomeAlbum, String titulo, String compositor, String interprete, String ano) {
        this.nomeAlbum=nomeAlbum;
        this.titulo=titulo;
        this.compositor=compositor;
        this.interprete=interprete;
        this.ano=ano;

    }
    //getters e setters
    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }


}




