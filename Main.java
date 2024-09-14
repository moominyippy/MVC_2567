public class Main {
    public static void main(String[] args) {
        Farm[] farms = new Farm[9];
        farms[0] = new Farm("1", "ขาว");
        farms[1] = new Farm("2", "น้ำตาล");
        farms[2] = new Farm("3", "ชมพู");
        farms[3] = new Farm("4", "ขาว");
        farms[4] = new Farm("5", "น้ำตาล");
        farms[5] = new Farm("6", "ชมพู");
        farms[6] = new Farm("7", "ขาว");
        farms[7] = new Farm("8", "น้ำตาล");
        farms[8] = new Farm("9", "ชมพู");

        CowView view = new CowView();
        CowController controller = new CowController(view, farms);

        controller.start();
    }
}

