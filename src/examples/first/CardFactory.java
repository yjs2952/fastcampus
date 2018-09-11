package examples.first;

import java.util.ArrayList;
import java.util.List;

public class CardFactory {

    // 생성자
    private CardFactory() {
    }

    // 메서드
    public static List<Card> createCards() {

        List<Card> list = new ArrayList<>();
        String[] types = new String[]{"하트", "클로버", "스페이드", "다이아"};

        for (String type : types) {
            for (int i = 1; i <= 13; i++) {
                list.add(new Card(i, type));
            }   // end for
        }   // end for

        return list;
    }
}
