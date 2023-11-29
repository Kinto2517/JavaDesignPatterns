package org.example.Interfaces.Impl;

import org.example.Interfaces.DocumentMetadata;

public class PDFDocumentMetadata implements DocumentMetadata {

    @Override
    public String getTitle() {
        return "PDF Title";
    }

    @Override
    public String getAuthor() {
        return "PDF Author";
    }

    @Override
    public String getBody() {
        return "PDF Body";
    }

}
