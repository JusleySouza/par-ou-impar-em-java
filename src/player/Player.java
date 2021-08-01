package player;

public class Player {
    public String name;
    private int victories;
    private String choice;
    private int playerMove;

    public Player(String name){
        this.name = name;
        this.victories = 0;
    }

    public int getVictories(){
        return victories;
    }

    public void setChoice(String choice){
        this.choice = choice;
    }

    public String getChoice(){
        return choice;
    }

    public void setPlayerMove(int playerMove){
        this.playerMove = playerMove;
    }

    public int getPlayerMove(){
        return playerMove;
    }

    public void victory(){
        victories ++;
    }

}