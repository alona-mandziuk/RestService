package vocabularyRest;

class Translation {
    static Vocabulary getTranstale(String inputRequest) {
        for (Vocabulary v : Vocabulary.values()) {
            if (inputRequest.equalsIgnoreCase(v.getTranslate())) {
                return v;
            }
        }
        throw new RuntimeException("You have input non-existent word in this vocabulary ");
    }
}

