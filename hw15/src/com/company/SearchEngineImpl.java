package com.company;
import java.util.*;

public class SearchEngineImpl implements SearchEngine {

    @Override
    public List<TextProvider> getSortedByRelevanceList(TextAnalyze textAnalyze, TextProvider query, List<TextProvider> sources) {
        HashMap<Integer, Double> coefList = new HashMap<>();
        List<TextProvider> relevanceList = new ArrayList<>();

        for (int i = 0; i < sources.size(); i++) {
            coefList.put(i, textAnalyze.analyze(query, sources.get(i)));
        }

        for (int i = 0; i < sources.size(); i++) {
            relevanceList.add(sources.get(getNext(coefList)));
        }

        return relevanceList;
    }

    private int getNext(HashMap<Integer, Double> coefList) {
        double max = 0;
        int index = 0;
        for (Map.Entry<Integer, Double> coef: coefList.entrySet()) {
            if (coef.getValue() >= max) {
                max = coef.getValue();
                index = coef.getKey();
            }
        }
        coefList.remove(index);
        return index;
    }
}