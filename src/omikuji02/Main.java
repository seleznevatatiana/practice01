package omikuji02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

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

          String line;
          ArrayList csvData = new ArrayList();
          while ( ( line = br.readLine()) != null ) {
            String[] cols = line.split(",");
            csvData.add(cols);
          }

          // 読み込みデータの表示
          for ( String[] row : csvData ) {
            System.out.println("願い事　: " + row[0]);
            System.out.println("商い　: " + row[1]);
            System.out.println("学問　: " + row[2]);
            System.out.println();
          }

//          String line;
//          int index = 0;
//          while ((line = br.readLine()) != null) {
//              if (index > 0) {
//                  String[] data = line.split(",");
//                  if (data.length > 3) {
//                      // 読み込んだCSVファイルの内容を出力
//                      System.out.println("願い事:"  + data[1]);
//                      System.out.println("商い:"  + data[2]);
//                      System.out.println("学問:"  + data[3]);
//                  }
//              }
//              index++;
//          }

//          //読み込み行
//          String line;
//
//          //読み込み行数の管理
//          int i = 0;
//
//          //列名を管理する為の配列
//          String[] arr = null;
//
//          //1行ずつ読み込みを行う
//          while ((line = br.readLine()) != null) {
//
//            //先頭行は列名
//            if (i == 0) {
//
//              //カンマで分割した内容を配列に格納する
//              // arr = { "no","name","age","gender","bloodtype" };
//              arr = line.split(",");
//
//            } else {
//
//              //カンマで分割した内容を配列に格納する
//              String[] data = line.split(",");
//
//              //配列の中身を順位表示する。列数(=列名を格納した配列の要素数)分繰り返す
//              int colno = 0;
//              for (String column : arr) {
//                System.out.println(column + ":" + data[colno]);
//                colno++;
//
//              }
//
//            }
//
//            //行数のインクリメント
//            i++;
//
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
