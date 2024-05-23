package pl.globallogic.exercism;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new  HashSet<>(cards);
    }
    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }
    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        Set<String> set1 = new HashSet<>(theirCollection);
        set1.removeAll(myCollection);
        return !myCollection.isEmpty() && !set1.isEmpty();
    }
    static Set<String> commonCards(List<Set<String>> collections) {
        List<Set<String>> onlySet = new ArrayList<>();
        Set<String> result = new HashSet<>(collections.getFirst());
        for (Set<String> elm: collections.subList(1, collections.size())) {
            result.retainAll(elm);
        }
        return result;
    }
    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> set1 = commonCards(collections);
        Set<String> set2 = new HashSet<>();
        for (Set<String> elm : collections) {
            set2.addAll(elm);
        }
        return set2;
    }
}
