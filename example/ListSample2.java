package example;

import java.util.ArrayList;
import java.util.List;

import javax.xml.catalog.Catalog;

public class ListSample2 {
    public static void main(String[] args) {
// Catクラス型を要素とするリストを定義
        List<Cat> catList = new ArrayList<>();
        // Cat型のインスタンスを生成
        Cat tama = new Cat();
        Cat mike = new Cat();
        // リストに要素を追加　catListはList<Cat>型で定義しているのでaddメソッドの引数はCat型になる
        catList.add(tama);
        catList.add(mike);

        // リストから要素を取り出す
        Cat cat1 = catList.get(0);
        Cat cat2 = catList.get(1);

        System.out.println();
        System.out.println("------ Listから取り出した先頭のCat型のインスタンスのメソッドを呼び出す------");
        cat1.eat();
        cat1.playToy();
        System.out.println("-------- Listから取り出した2件目のCat型のインスタンスのメソッドを呼び出す -----");
        cat2.eat();
        cat2.playToy();
    }  
}
