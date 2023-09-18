package com.mjc.stage2.parser;

import java.util.ArrayList;
import java.util.List;

public class ChainParserBuilder {
    private List<AbstractTextParser> parsers = new ArrayList<>();

    public ChainParserBuilder() {
    }

    public ChainParserBuilder setParser(AbstractTextParser abstractTextParser) {
        parsers.add(abstractTextParser);
        return this;
    }

    public AbstractTextParser build() {
        AbstractTextParser textParser0 = parsers.get(0);
        for (int i = 1; i < parsers.size(); i++) {
            if (textParser0 != null) {
                textParser0.setNextParser(parsers.get(i));
            }
        }
        return textParser0;
    }
}
