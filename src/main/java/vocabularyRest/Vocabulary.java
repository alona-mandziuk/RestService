package vocabularyRest;

import java.util.stream.Stream;

public enum Vocabulary {
    EARTH("ЗЕМЛЯ"),
    SUN("СОНЦЕ"),
    MOON("МІСЯЦЬ"),
    STAR("ЗІРКА"),
    PLANET("ПЛАНЕТА"),
    UNIVERSE("ВСЕСВІТ"),
    ASTRONAUT("АСТРОНАВТ"),
    SATELLITE("СУПУТНИК"),
    GALAXY("ГАЛАКТИКА"),
    ALIEN("ПРИБУЛЕЦЬ"),
    SPACE("КОСМОС"),
    SKY("НЕБО");
    private final String translate;

    String getTranslate() {
        return translate;
    }

    Vocabulary(String translate) {
        this.translate = translate;
    }
}
