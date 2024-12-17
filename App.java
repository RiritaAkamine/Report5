public class App {
    public static void main(String[] args) {
        try {
            // NullPointerExceptionを発生させるコード
            String str = null;
            System.out.println(str.length()); // nullなのでエラーが発生
        } catch (NullPointerException e) {
            // 例外処理：エラーをキャッチしてメッセージを出力
            System.out.println("NullPointerException が発生しました");
            System.out.println("例外メッセージ: " + e.getMessage());
        }
    }
}
