package org.example.Interfaces.Impl;

import org.example.Interfaces.Document;
import org.example.Interfaces.DocumentMetadata;

public class PDFDocument implements Document {
    private DocumentMetadata metadata;

    public PDFDocument(DocumentMetadata metadata) {
        this.metadata = metadata;
    }
    @Override
    public void create() {
        System.out.println("Creating PDF document: " + metadata.getTitle());
    }

    @Override
    public String getType() {
        return "PDF";
    }

    @Override
    public DocumentMetadata getMetadata() {
        return metadata;
    }
}
