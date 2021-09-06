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
          if (data.length > 3) {
              Omikuji omikuji = null;
              switch (data[0]) {
              //大吉の場合
              case "大吉":
                  Omikuji omikuji1  = new Daikichi();
                  break;

              //中吉の場合
              case "中吉":
                  Omikuji omikuji2  = new Chukichi();
                  break;

              //小吉の場合
              case "小吉":
                  Omikuji omikuji3  = new Shokichi();
                  break;

             //吉の場合
              case "吉":
                  Omikuji omikuji4  = new Kichi();
                  break;

              //末吉の場合
              case "末吉":
                  Omikuji omikuji5 = new Suekichi();
                  break;

             //凶の場合
              case "凶":
                  Omikuji omikuji6  = new Kyo();
                  break;
              }

              // 要素の追加
              omikuji.setUnsei();
              omikujiList.add(omikuji);


            int num =  (int) (Math.random() * (omikujiList.size()));
            System.out.println(data[num]);

//              Properties properties = new Properties();
//              String file1 = "src/omikuji02/fortune.properties";
//
//              try {
//                  FileInputStream fis = new FileInputStream(file1);
//                  try {
//                      properties.load(fis);
//                      String a = properties.getProperty("disp_str");
//                      String str = String.format(a, data[0]);
//
//                      System.out.println(str);
//
//                  } catch (IOException e) {
//                      e.printStackTrace();
//                  }
//              } catch (FileNotFoundException e) {
//                  e.printStackTrace();
//              }

            omikuji.disp();

            // 読み込んだCSVファイルの内容を出力
            String negaigoto = data[1];
            String akinai = data[2];
            String gakumon = data[3];
            System.out.println("願い事:"  + negaigoto);
            System.out.println("商い:"  + akinai);
            System.out.println("学問:"  + gakumon);
          }
          System.out.println();

          return;
          }

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


