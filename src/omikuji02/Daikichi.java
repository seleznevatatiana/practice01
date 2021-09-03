package omikuji02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Daikichi extends  Omikuji{

    @Override
    public String disp() {
        return disp();
    }

    @Override
    public void setUnsei() {
        // ArrayListの生成
        List <String> negaigoto = new ArrayList<>();

        // 要素の追加
        negaigoto.add("叶う");
        negaigoto.add("叶わない");
        negaigoto.add("叶うかも");
        negaigoto.add("わからない");

        int index = new Random().nextInt(negaigoto.size());
        String result = negaigoto.get(index);

        System.out.println(result);

    }

}
