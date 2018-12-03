package com.company;
import java.util.List;

public interface SearchEngine {
    List<TextProvider> getSortedByRelevanceList(TextAnalyze textAnalyze, TextProvider query, List<TextProvider> sources);
}