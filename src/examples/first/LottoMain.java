package examples.first;

import java.util.*;

public class LottoMain {
    public static void main(String[] args) {

        // 로또볼 45개를 준비한다.
        List<LottoBall> list = LottoBallFactory.createBalls();

        LottoMachine machine = new NHLottoMachine();
        // 로또 머신에 넣는다.
        machine.put(list);

        // 로또 머신의 로또볼을 섞는다.
        machine.mix();

        // 섞인 볼들중에 6개를 꺼낸다.
        List<LottoBall> result = machine.getBalls();

        // 결과 출력
        for(LottoBall ball : result){
            System.out.print(ball.getNumber() + " ");
        }
    }
}
