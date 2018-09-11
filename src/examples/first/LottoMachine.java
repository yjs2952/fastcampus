package examples.first;

import java.util.*;

public interface LottoMachine {

    // 공 45개를 넣는다.
    public void put(List<LottoBall> balls);

    // 섞는다.
    public void mix();

    // 하나씩 뽑는다. (6개를 뽑는다.)  -> 비지니스 로직
    public List<LottoBall> getBalls();
}
