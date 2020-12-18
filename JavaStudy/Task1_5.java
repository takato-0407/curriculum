/** 
 * Task1-5 : 課題内容
 *
 * 本課題では、ルーブ文に記述に慣れていきましょう。
 * 問①〜問④まであります。
 * for文・while文の仕組みを意識しながらコーディングしていきましょう！
 */
public class Task1_5 {



    public static void main(String[] args) {

        // ① 「みかん」、「りんご」、「ぶどう」、「メロン」の値を設定した配列 fluits を作成してください。
        String[] fluits = {"みかん", "りんご", "ぶどう", "メロン"};

        for (int i = 0; i < fluits.length; i++ ) { 
            System.out.println(fluits[i]); 
        }
        // ③ 以下のwhile文の処理について、何をしているのかコメントを記入してください。
        /*
        *  [初期値を1にして、iを1ずつ足してループを作り出して、100になるまで無限ループを行う]
        */
        int i = 1;
        while(i <= 100) {
          System.out.print(i);
          i++;
        }

        System.out.println();
        
        for (int f = 1; f <= 9; f++) { 
         // １つの段を表示 
          for (int j = 1; j <= 9; j++) { 
            System.out.print("|" +  f * j + "|" ); 
          } 
        // １つの段を表示し終わったところで、改行する 
        System.out.println( ); 
        }
    }
}