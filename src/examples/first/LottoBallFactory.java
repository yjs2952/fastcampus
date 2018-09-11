package examples.first;

import java.util.*;

// 로또볼 공장은 세상에 많을 필요기 있을까?

public class LottoBallFactory {

    // private 생성자만 있으면 외부에서 new로 객체를 생성할 수 없다.
    private LottoBallFactory() {
    }

    // static한 메소드는 인스턴스를 생성하지 않아도 사용가능하다.
    // List<LottoBall> 을 만드는 기능
    public static List<LottoBall> createBalls(){
        List<LottoBall> list = new ArrayList<>();
        for(int i = 1; i <= 45; i++){

            LottoBall ball = new LottoBall(i);
            list.add(ball);
        }
        return list;
    }
}