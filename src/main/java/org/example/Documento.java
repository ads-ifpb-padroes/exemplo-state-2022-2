package org.example;

public class Documento {

    public Documento(DocumentoState estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    private DocumentoState estadoAtual;

    public void aprovar() {
        this.estadoAtual = this.estadoAtual.aprovar();
    }

    public void reprovar() {
        this.estadoAtual = this.estadoAtual.reprovar();
    }

}
