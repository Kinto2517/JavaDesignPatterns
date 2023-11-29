package org.example.Interfaces.Impl;

import org.example.Interfaces.Document;
import org.example.Interfaces.DocumentFactory;
import org.example.Interfaces.DocumentMetadata;

public class WordDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument(DocumentMetadata metadata) {
        return new WordDocument(metadata);
    }
}
