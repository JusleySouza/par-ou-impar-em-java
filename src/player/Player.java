package player;

public class Player {
    public String name;
    private int victories;
    private int choice;
    private int playerMove;

    public Player(String name){
        this.name = name;
        this.victories = 0;
    }

    public int getVictories(){
        return victories;
    }

    public void setChoice(int choice){
        this.choice = choice;
    }

    public String getChoice(){
        if(this.choice == 1){
            return "IMPAR";
        }
        else{
            return "PAR";
        }
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

    private boolean validationPlayerMove(int playerMove){
        if(playerMove > 5 || playerMove < 0){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean validationChoice(int choice){
        if( choice == 1 || choice == 2){
            return true;
        }
        else{
            return false;
        }
    }

}