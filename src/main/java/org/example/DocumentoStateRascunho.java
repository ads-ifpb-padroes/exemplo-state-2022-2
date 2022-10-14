package org.example;

public class DocumentoStateRascunho implements DocumentoState {

    @Override
    public DocumentoState aprovar() {
        System.out.println("Executou transição de Rascunho para Moderação");
        return new DocumentoStateModeracao();
    }

    @Override
    public DocumentoState reprovar() {
        return this;
    }

}
