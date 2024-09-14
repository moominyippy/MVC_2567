public class Cow {
    private String id;
    private String color;
    private String farmId;
    private String additionalInfo; 

    public Cow(String id, String color, String farmId, String additionalInfo) {
        this.id = id;
        this.color = color;
        this.farmId = farmId;
        this.additionalInfo = additionalInfo;
    }

    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public String getFarmId() {
        return farmId;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }
}
