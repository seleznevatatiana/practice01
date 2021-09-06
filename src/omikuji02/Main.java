package omikuji02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

      //ファイル読み込みで使用する３つのクラス
        FileInputStream fi = null;
        InputStreamReader is = null;
        BufferedReader br = null;

        try {

          //読み込みファイルのインスタンス生成
          //ファイル名を指定する
          fi = new FileInputStream("src/omikuji02/fortune.csv");
          is = new InputStreamReader(fi);
          br = new BufferedReader(is);

         // readLineで一行ずつ読み込む
          String line; // 読み　込み行
          String[] data; // 分割後のデータを保持する配列

         //リスト作成
          List<Omikuji> omikujiList = new ArrayList<>();

          while ((line = br.readLine()) != null) {
          // lineをカンマで分割し、配列dataに設定
          data = line.split(",");

              Omikuji omikuji = null;
              switch (data[0]) {
              //大吉の場合
              case "大吉":
                  omikuji  = new Daikichi();
                  break;

              //中吉の場合
              case "中吉":
                  omikuji  = new Chukichi();
                  break;

              //小吉の場合
              case "小吉":
                  omikuji  = new Shokichi();
                  break;

             //吉の場合
              case "吉":
                  omikuji  = new Kichi();
                  break;

              //末吉の場合
              case "末吉":
                  omikuji = new Suekichi();
                  break;

             //凶の場合
              case "凶":
                  omikuji  = new Kyo();
                  break;
              default:
                  continue;
              }

              // 要素の追加
              omikuji.unsei = data[0];
              omikuji.setAkinai(data[1]);
              omikuji.setNegaigoto(data[2]);
              omikuji.setGakumon(data[3]);

              omikujiList.add(omikuji);
          }

          //ランダム表示
            int num =  (int) (Math.random() * (omikujiList.size()));
            Omikuji omikuji = omikujiList.get(num);

            System.out.println(omikuji.disp());

          return;


        } catch (Exception e) {
          e.printStackTrace();
        } finally {
          try {
            br.close();
          } catch (Exception e) {
            e.printStackTrace();
          }
    }
    }
}


