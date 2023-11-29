package org.example.Interfaces.Impl;

import org.example.Interfaces.Document;
import org.example.Interfaces.DocumentMetadata;

public class WordDocument implements Document {
    private DocumentMetadata metadata;

    public WordDocument(DocumentMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public void create() {
        System.out.println("Creating Word document: " + metadata.getTitle());
    }

    @Override
    public String getType() {
        return "Word";
    }

    @Override
    public DocumentMetadata getMetadata() {
        return metadata;
    }
}