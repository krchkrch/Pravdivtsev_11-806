package com.company;

public class SimpleTextProviderImpl implements TextProvider {
    private String string;

    public SimpleTextProviderImpl(String string) {
        this.string = string;
    }

    @Override
    public String getText() {
        return string;
    }
}