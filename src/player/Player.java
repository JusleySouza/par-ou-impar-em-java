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
        boolean isValid = validationPlayerMove(playerMove);
        if(isValid){
            this.playerMove = playerMove;
        }
       else{
           System.out.println("Coloque um número válido!!");
       }
    }

    public int getPlayerMove(){
        return playerMove;
    }

    public void victory(){
        victories ++;
    }

    private boolean validationPlayerMove(int playerMove){
        if(playerMove > 5 || playerMove < 0){
            return false;
        }
        else {
            return true;
        }
    }

}