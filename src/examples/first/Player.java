package examples.first;

import java.util.*;

public class Player {

    private String name;
    private List<Card> cardList;

    public Player(String name){
        this.name = name;
        this.cardList = new ArrayList<>();
    }

    public void clear(){
        cardList.clear();
    }

    public void addCard(Card card){
        cardList.add(card);
    }

    public List<Card> getCardList() {
        return cardList;
    }
}
