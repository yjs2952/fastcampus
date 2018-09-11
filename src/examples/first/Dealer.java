package examples.first;

import java.util.*;

public class Dealer {

    private String name;
    private List<Card> cardList;
    private List<Player> playerList;
    private int index;

    public Dealer(String name){
        this.name = name;
        this.index = 0;
    }

    public void setCards(List<Card> list){
        this.cardList = list;
    }

    public void setPlayerList(List<Player> list){
        this.playerList = list;
    }

    public void newGame(){
        index = 0;

        for(Player player : playerList){
            player.clear();
        }
    }

    public Card getCard(){
        return cardList.get(index++);
    }

    public void mix(List<Card> list){
        Collections.shuffle(list);
    }

    public void result(){

        for(Player player : playerList){
            System.out.println(player.getCardList());
        }
    }
}
