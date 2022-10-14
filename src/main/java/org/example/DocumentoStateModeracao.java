package org.example;

public class DocumentoStateModeracao implements DocumentoState {

    @Override
    public DocumentoState aprovar() {
        System.out.println("Documento Aprovado. Mudando para Publicado");
        return new DocumentoStatePublicado();
    }

    @Override
    public DocumentoState reprovar() {
        System.out.println("Documento reprovado. Mudando para rascunho");
        return new DocumentoStateRascunho();
    }
}
