package Companies.eBay;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordCompare {
        Set<String> breakIndexesFails;
        public boolean wordBreak(String s, List<String> wordDict) {
            breakIndexesFails = new HashSet<>();
            return wb2(s, wordDict);
        }

        private boolean wb2(String sentence, List<String> wordDict) {
            if (sentence.length() == 0) {
                return true;
            }

            for (String word : wordDict) {
                int breakIndex = word.length();
                if (sentence.length() >= breakIndex) {
                    if (checkWordIsAtTheStart(sentence, word, breakIndex)) {
                        String subSentence = sentence.substring(breakIndex);
                        if (breakIndexesFails.contains(subSentence)) {
                            continue;
                        }
                        if (wb2(subSentence, wordDict)) {
                            return true;
                        } else {
                            breakIndexesFails.add(subSentence);
                        }
                    }
                }
            }

            return false;
        }

        private boolean checkWordIsAtTheStart(String sentence, String word, int wordLen) {
            for (int i = 0; i < wordLen; i++) {
                if (sentence.charAt(i) != word.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
}
