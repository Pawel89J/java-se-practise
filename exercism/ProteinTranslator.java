package pl.globallogic.exercism;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProteinTranslator {

    List<String> translate(String rnaSequence) {

        List<String> rnaList = new ArrayList<>();
        HashMap<String, String> proteinMap = new HashMap<String, String>();

        proteinMap.put("AUG", "Methionine");
        proteinMap.put("UUU", "Phenylalanine");
        proteinMap.put("UUC", "Phenylalanine");
        proteinMap.put("UUA", "Leucine");
        proteinMap.put("UUG", "Leucine");
        proteinMap.put("UCU", "Serine");
        proteinMap.put("UCC", "Serine");
        proteinMap.put("UCA", "Serine");
        proteinMap.put("UCG", "Serine");
        proteinMap.put("UAU", "Tyrosine");
        proteinMap.put("UAC", "Tyrosine");
        proteinMap.put("UGU", "Cysteine");
        proteinMap.put("UGC", "Cysteine");
        proteinMap.put("UGG", "Tryptophan");
        proteinMap.put("UAA", "STOP");
        proteinMap.put("UAG", "STOP");
        proteinMap.put("UGA", "STOP");

        for (int i = 0; i < rnaSequence.length(); i += 3) {
            String currentSequence = rnaSequence.substring(i, i + 3);
            if (rnaSequence.length() % 3 != 0
                    && !(rnaSequence.contains("UAA") || rnaSequence.contains("UAG") || rnaSequence.contains("UGA"))) {
                throw new IllegalArgumentException("Invalid codon");
            }
            if (proteinMap.containsKey(currentSequence)) {
                if (proteinMap.get(currentSequence).equals("STOP")) {
                    return rnaList;
                }
                rnaList.add(proteinMap.get(currentSequence));
            } else {
                throw new IllegalArgumentException("Invalid codon");
            }
        }
        return rnaList;
    }
}
