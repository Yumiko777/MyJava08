// 拡張for文でリストを繰り返し処理
package example;

import java.util.ArrayList;
import java.util.List;

public class ListLoopSample {
    public static void main(String[] args) {
        // mainメソッドの中でArryaListクラスのインスタンスを生成
        List<Integer> numberList = new ArrayList<>();

        numberList.add(100);
        numberList.add(65);
        numberList.add(80);

        System.out.println();
        System.out.println("----- 拡張forを使って、リストから要素を取り出す-----");
        // 取り出した要素を入れる変数　コロン　リストを入れた変数
        // リストから要素を取り出す
        for (int number : numberList) {
            System.out.println(number);
        }
    }    
}
