package example;

// ArrayListクラスをインポート
// Listインターフェースをインポート
import java.util.ArrayList;
import java.util.List;

public class ListSample {
    public static void main(String[] args) {
        // List型　格納する要素の型　変数名　　ArrayList<>インスタンスの生成
        // 基本データ型の代わりにラッパークラス型を使用する
        List<Integer> numberList = new ArrayList<>();
        // リストに要素を追加
        numberList.add(100);
        numberList.add(65);
        numberList.add(80);

        // リストから要素を取り出す
        System.out.println(numberList.get(0));
        System.out.println(numberList.get(1));
        System.out.println(numberList.get(2));

        List<String> petList = new ArrayList<>();

        petList.add("にゃんこ");
        petList.add("わんこ");
        petList.add("ハムスター");

        System.out.println(petList.get(0));
        System.out.println(petList.get(1));
        System.out.println(petList.get(2));
    }  
}
