public class CowController {
    private CowView view;
    private Farm[] farms;

    public CowController(CowView view, Farm[] farms) {
        this.view = view;
        this.farms = farms;
    }

    public void start() {
        String color = view.selectCowColor();
        if (!color.equals("ขาว") && !color.equals("น้ำตาล") && !color.equals("ชมพู")) {
            view.showError("สีวัวไม่ถูกต้อง");
            return;
        }

        String[] cowData = view.registerCow();
        String cowId = cowData[0];
        String farmId = cowData[1];

        try {
            // ตรวจสอบรหัสฟาร์ม
            int farmIndex = Integer.parseInt(farmId) - 1;
            if (farmIndex < 0 || farmIndex >= farms.length) {
                view.showError("รหัสฟาร์มไม่ถูกต้อง");
                return; 
            }

            Farm selectedFarm = farms[farmIndex];
            String[] additionalInfo = view.getAdditionalInfo(color);
            Cow cow;
            if (color.equals("ชมพู")) {
                cow = new Cow(cowId, color, selectedFarm.getFarmId(), additionalInfo[0] + " " + additionalInfo[1]);
            } else {
                cow = new Cow(cowId, color, selectedFarm.getFarmId(), additionalInfo[0]);
            }
            
            selectedFarm.addCow(cow);
            view.displayFarmStatus(selectedFarm);
        } catch (Exception e) {
            view.showError(e.getMessage());
        }
    }
}



