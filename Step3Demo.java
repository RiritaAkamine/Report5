public class Step3Demo {
    public static void main(String[] args) {
        try {
            String str = "壱百満";
            int value = Integer.parseInt(str);
            System.out.println("数値: " + value);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException が発生しました");
            System.out.println("エラーメッセージ: " + e.getMessage());
        }
    }
}
