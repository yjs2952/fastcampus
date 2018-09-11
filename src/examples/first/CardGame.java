package examples.first;

import java.util.ArrayList;
import java.util.List;

public class CardGame {
    public static void main(String[] args) {

        // 카드 생성
        List<Card> cards = CardFactory.createCards();

        /*for (Card card : list){
            System.out.println(card.toString());
        }*/

        // 딜러 입장
        Dealer dealer = new Dealer("슈퍼딜러");

        // 카드 세팅
        dealer.setCards(cards);

        // 플레이어 입장
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player("천재"));
        playerList.add(new Player("바보"));
        playerList.add(new Player("무뇌"));

        // 플레이어 정보 받기
        dealer.setPlayerList(playerList);

        // 게임 초기화
        dealer.newGame();

        // 카드 섞기
        dealer.mix(cards);

        // 카드 분배
        for(int i=0; i<5; i++){
            for(Player player : playerList){
                player.addCard(dealer.getCard());
            }
        }

        dealer.result();
    }
}
