package example;

// HashMapクラス、Mapインターフェースのimport定義をする
import java.util.HashMap;
import java.util.Map;

public class MapSample {
    public static void main(String[] args) {
        // Map型　キーの型　値の型　変数名　HashMap<>インスタンスの生成
        Map<String, Integer> fruitsMap = new HashMap<>();

        // マップに要素を追加（Listインターフェースではaddメソッドで要素を追加、Mapインターフェースではputメソッドで追加）
        fruitsMap.put("りんご", 100);
        fruitsMap.put("みかん", 150);
        fruitsMap.put("ばなな", 250);

        // getメソッドでマップから値を取り出す
        System.out.println("りんご :" + fruitsMap.get("りんご"));
        System.out.println("みかん :" + fruitsMap.get("みかん"));
        System.out.println("ばなな :" + fruitsMap.get("ばなな"));
    }
}
