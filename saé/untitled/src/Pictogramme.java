import java.util.List;

public class Pictogramme {
    public int id;
    private String created;
    private int downloads;
    private List<String> tags;
    private List<String> synsets;
    private boolean sex;
    private String lastUpdated;
    private boolean schematic;
    private List<Keyword> keywords;
    private List<String> categories;
    private boolean violence;
    private boolean hair;
    private boolean skin;
    private boolean aac;
    private boolean aacColor;

    // Constructeur
    public Pictogramme(int id, String created, int downloads, List<String> tags, List<String> synsets,
                       boolean sex, String lastUpdated, boolean schematic, List<Keyword> keywords,
                       List<String> categories, boolean violence, boolean hair, boolean skin,
                       boolean aac, boolean aacColor) {
        this.id = id;
        this.created = created;
        this.downloads = downloads;
        this.tags = tags;
        this.synsets = synsets;
        this.sex = sex;
        this.lastUpdated = lastUpdated;
        this.schematic = schematic;
        this.keywords = keywords;
        this.categories = categories;
        this.violence = violence;
        this.hair = hair;
        this.skin = skin;
        this.aac = aac;
        this.aacColor = aacColor;
    }

    public Pictogramme(int id) {
        this.id = id;

    }

    // Getters & setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<Keyword> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<Keyword> keywords) {
        this.keywords = keywords;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }


    // Classe interne Keyword
    public static class Keyword {
        private int type;
        private String keyword;
        private boolean hasLocution;
        private String plural;

        // Constructeur
        public Keyword(int type, String keyword, boolean hasLocution, String plural) {
            this.type = type;
            this.keyword = keyword;
            this.hasLocution = hasLocution;
            this.plural = plural;
        }

    }
}