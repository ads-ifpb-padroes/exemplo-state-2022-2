package org.example;

public class DocumentoStatePublicado implements DocumentoState {

    @Override
    public DocumentoState aprovar() {
        System.out.println("Documento já foi aprovado");
        return this;
    }

    @Override
    public DocumentoState reprovar() {
        System.out.println("Documento publicado foi reprovado. Mudando para Moderação");
        return new DocumentoStateModeracao();
    }
}
