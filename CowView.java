import java.util.Scanner;

public class CowView {
    private Scanner scanner;

    public CowView() {
        scanner = new Scanner(System.in);
    }

    public String selectCowColor() {
        System.out.println("เลือกสีของวัว (ขาว, น้ำตาล, ชมพู): ");
        return scanner.nextLine().toLowerCase();
    }

    public String[] registerCow() {
        String[] cowData = new String[4];
        System.out.println("กรอกรหัสวัว (8 หลัก): ");
        cowData[0] = scanner.nextLine();

       
        System.out.println("กรอกรหัสฟาร์ม (1-9): ");
        cowData[1] = scanner.nextLine();

        return cowData;
    }

    public String[] getAdditionalInfo(String color) {
        String[] info = new String[2];
        switch (color) {
            case "ขาว":
                System.out.println("กรอกอายุของวัว (ปีและเดือน): ");
                info[0] = scanner.nextLine();
                break;
            case "น้ำตาล":
                System.out.println("กรอกรหัสแม่พันธุ์: ");
                info[0] = scanner.nextLine();
                break;
            case "ชมพู":
                System.out.println("กรอกชื่อเจ้าของ (พิมพ์เล็ก, ไม่เกิน 8 ตัว): ");
                info[0] = scanner.nextLine();
                if (!info[0].matches("[a-z]{1,8}")) {
                    throw new IllegalArgumentException("ชื่อเจ้าของต้องเป็นอักษรพิมพ์เล็กและความยาวไม่เกิน 8 ตัวอักษร");
                }
                System.out.println("กรอกนามสกุลเจ้าของ (พิมพ์เล็ก, ไม่เกิน 8 ตัว): ");
                info[1] = scanner.nextLine();
                if (!info[1].matches("[a-z]{1,8}")) {
                    throw new IllegalArgumentException("นามสกุลเจ้าของต้องเป็นอักษรพิมพ์เล็กและความยาวไม่เกิน 8 ตัวอักษร");
                }
                break;
        }
        return info;
    }

    public void displayFarmStatus(Farm farm) {
        System.out.println("ฟาร์ม " + farm.getFarmId() + " มีวัวสี " + farm.getCowColor() + " จำนวน " + farm.getCowCount() + " ตัว");
    }

    public void showError(String message) {
        System.out.println("Error: " + message);
    }
}




