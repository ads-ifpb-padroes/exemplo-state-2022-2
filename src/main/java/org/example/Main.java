package org.example;

public class Main {
    public static void main(String[] args) {
        Documento d = new Documento(new DocumentoStateRascunho());
        d.aprovar();
        d.aprovar();
        d.aprovar();
        d.aprovar();
        d.aprovar();
        d.aprovar();
        d.reprovar();
        d.reprovar();
        d.reprovar();
    }
}