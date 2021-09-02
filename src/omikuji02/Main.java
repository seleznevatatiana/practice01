package omikuji02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

//        Daikichi daikichi = new Daikichi();
//        daikichi.setUnsei();

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
          String line; // 読み込み行
          String[] data; // 分割後のデータを保持する配列
          while ((line = br.readLine()) != null) {
          // lineをカンマで分割し、配列dataに設定
          data = line.split(",");
          if (data.length > 3) {
              // 読み込んだCSVファイルの内容を出力
            System.out.println("運勢:"  + data[0]);
            System.out.println("願い事:"  + data[1]);
            System.out.println("商い:"  + data[2]);
            System.out.println("学問:"  + data[3]);
          }
          System.out.println();
          }


//          String line;
//          int index = 0;
//          while ((line = br.readLine()) != null) {
//              if (index > 0) {
//                  String[] data = line.split(",");
//                  if (data.length > 3) {
//                      // 読み込んだCSVファイルの内容を出力
//                      System.out.println("運勢:"  + data[0]);
//                      System.out.println("願い事:"  + data[1]);
//                      System.out.println("商い:"  + data[2]);
//                      System.out.println("学問:"  + data[3]);
//                  }
//              }
//          }
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

