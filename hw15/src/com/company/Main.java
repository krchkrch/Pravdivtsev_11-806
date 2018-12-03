package com.company;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SearchEngineImpl searchEngine = new SearchEngineImpl();
        List<TextProvider> textProviderList = new ArrayList<>();

        textProviderList.add(new SimpleTextProviderImpl("Я люблю тортики больше, чем яблоки"));
        textProviderList.add(new SimpleTextProviderImpl("Я уважаю тортики меньше, чем торты"));
        textProviderList.add(new SimpleTextProviderImpl("Яблоки меньше, чем торт"));

        TextProvider query = new SimpleTextProviderImpl("Я уважаю яблоки больше");

        List<TextProvider> sortList = searchEngine.getSortedByRelevanceList(new CosineSimilarityImpl(), query, textProviderList);
        for (TextProvider textProvider: sortList) {
            System.out.println(textProvider.getText());
        }
    }
}