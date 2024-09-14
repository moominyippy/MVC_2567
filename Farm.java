import java.util.ArrayList;
import java.util.List;

public class Farm {
    private String farmId;
    private String cowColor;
    private List<Cow> cows;

    public Farm(String farmId, String cowColor) {
        this.farmId = farmId;
        this.cowColor = cowColor;
        this.cows = new ArrayList<>();
    }

    public String getFarmId() {
        return farmId;
    }

    public String getCowColor() {
        return cowColor;
    }

    public void addCow(Cow cow) throws Exception {
        if (!cow.getColor().equals(cowColor)) {
            throw new Exception("ฟาร์ม " + farmId + " ไม่รับวัวสี " + cow.getColor());
        }
        cows.add(cow);
    }

    public int getCowCount() {
        return cows.size();
    }
}

