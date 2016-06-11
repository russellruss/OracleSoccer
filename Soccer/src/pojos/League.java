/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

public class League {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Player playerA1 = new Player(),playerA2=new Player(),playerB2=new Player(),playerB1=new Player();
        playerA1.playerName = "Russell";
        playerA2.playerName = "Alberto";
        playerB1.playerName = "Jorge";
        playerB2.playerName = "Eduardo";
        
        Team Odin = new Team(), floki = new Team();
            Player[] team = {playerA1,playerA2};
        Odin.teamName = "ODIN";
            Odin.players = team;
        
        Player[] teamF = {playerB1,playerB2};
            
        floki.teamName = "FLOKI";
            floki.players=teamF;
            
        System.out.println("EL equipo "+Odin.teamName+" se conforma de:");  
        for (Player player : Odin.players) {
            System.out.println("el jugador: "+player.playerName);    
        }
        
        System.out.println("EL equipo "+floki.teamName+" se conforma de:");  
        for (Player player : floki.players) {
            System.out.println("el jugador: "+player.playerName);    
        }
        
        
        Game tourmalet = new Game();
            tourmalet.homeTeam = Odin;
            tourmalet.awayTeam = floki;
        Goal goal = new Goal();
            goal.thePlayer = tourmalet.homeTeam.players[1];
            goal.theTeam = tourmalet.homeTeam;
            goal.theTime = 55;
        Goal[] goals = {goal};
        tourmalet.goals = goals;
        
  
        System.out.println("Goal scored after " +

        tourmalet.goals[0].theTime + " mins by " +

        tourmalet.goals[0].thePlayer.playerName + " of " +

        tourmalet.goals[0].theTeam.teamName);
        
        
        
    }
    
}
