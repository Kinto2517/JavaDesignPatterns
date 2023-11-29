package org.example.Manager;

import org.example.Interfaces.Document;

import java.util.ArrayList;
import java.util.List;

public class DocumentManager {
    private List<Document> documents = new ArrayList<>();

    public void addDocument(Document document) {
        documents.add(document);
    }

    public void printDocumentInfo() {
        for (Document document : documents) {
            System.out.println("Document Type: " + document.getType());
            System.out.println("Title: " + document.getMetadata().getTitle());
            System.out.println("Author: " + document.getMetadata().getAuthor());
            System.out.println("----------------------");
        }
    }
}
