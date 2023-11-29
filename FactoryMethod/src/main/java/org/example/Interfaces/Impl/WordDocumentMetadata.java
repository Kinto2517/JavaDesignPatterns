package org.example.Interfaces.Impl;

import org.example.Interfaces.DocumentMetadata;

public class WordDocumentMetadata implements DocumentMetadata {

    @Override
    public String getTitle() {
        return "Word Title";
    }

    @Override
    public String getAuthor() {
        return "Word Author";
    }

    @Override
    public String getBody() {
        return "Word Body";
    }
    
}
