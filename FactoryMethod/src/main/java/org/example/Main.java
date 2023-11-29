package org.example;

import org.example.Interfaces.Document;
import org.example.Interfaces.DocumentFactory;
import org.example.Interfaces.DocumentMetadata;
import org.example.Interfaces.Impl.PDFDocumentFactory;
import org.example.Interfaces.Impl.PDFDocumentMetadata;
import org.example.Interfaces.Impl.WordDocumentFactory;
import org.example.Interfaces.Impl.WordDocumentMetadata;
import org.example.Manager.DocumentManager;

public class Main {
    public static void main(String[] args) {
        DocumentFactory pdfFactory = new PDFDocumentFactory();
        DocumentMetadata pdfMetadata = new PDFDocumentMetadata();
        Document pdfDocument = pdfFactory.createDocument(pdfMetadata);
        pdfDocument.create();

        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentMetadata wordMetadata = new WordDocumentMetadata();
        Document wordDocument = wordFactory.createDocument(wordMetadata);
        wordDocument.create();

        DocumentManager documentManager = new DocumentManager();
        documentManager.addDocument(pdfDocument);
        documentManager.addDocument(wordDocument);
        documentManager.printDocumentInfo();
    }}