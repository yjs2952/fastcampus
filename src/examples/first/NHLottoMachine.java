package examples.first;

import java.util.*;

public class NHLottoMachine implements LottoMachine {

    private List<LottoBall> balls;


    // 공 45개를 넣는다.
    @Override
    public void put(List<LottoBall> balls) {
        this.balls = balls;
    }

    // 섞는다.
    @Override
    public void mix() {
        Collections.shuffle(balls);
    }

    // 하나씩 뽑는다. (6개를 뽑는다.)  -> 비지니스 로직
    @Override
    public List<LottoBall> getBalls() {

        List<LottoBall> result = new ArrayList<>();

        for(int i = 0; i < 6; i++){     // 애초에 볼이 6개가 안 들어가면 문제가 생긴다.
            result.add(balls.get(i));
        }

        return result;
    }

    public void otherMethod(){

    }
}
