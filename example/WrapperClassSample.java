package example;

// ラッバークラス　基本データ型を包む(wrap)役割を持つため　大文字始まり
public class WrapperClassSample {
    public static void main(String[] args) {
        String str1 = "123";
        // IntegerクラスのparseIntメソッドは数字の文字列をint型に変換して返す。
        // staticメソッドなのでインスタンス生成せず、クラスに対して呼び出す。
        int i1 = Integer.parseInt(str1);
        System.out.println("str1 = " + str1);
        System.out.println("Integer.parseInt(str1) → " + i1);

        System.out.println("----------");
        String str2 = "-123";
        System.out.println("str2 = " + str2);
        System.out.println("Integer.parseInt(str2) → " + Integer.parseInt(str2));

        System.out.println("-------");
        String str3 = "+123";
        System.out.println("str3 = " + str3);
        System.out.println("Integer.parseInt(str3) → " + Integer.parseInt(str3));

        System.out.println("--------");
        String str6 = "10.5";
        // parseDoubleはparseIntのdobule型版のメソッド。数字で構成された文字列をdouble型の浮動小数点数に変換
        double d1 = Double.parseDouble(str6);
        System.out.println("str6 = " + str6);
        System.out.println("Double.parseDouble(str6) → " + d1);
    } 
}
