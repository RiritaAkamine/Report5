public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            String message = null;
            System.out.println("文字列の長さ: " + message.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException が発生しました");
            System.out.println("エラーメッセージ: " + e.getMessage());
        }
    }
}
