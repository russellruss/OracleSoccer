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
        playerA1.playerName = "Russell rodpal";
        playerA2.playerName = "Alberto palma";
        playerB1.playerName = "Jorge Perez";
        playerB2.playerName = "Eduardo Rodriguez";
        
        Team Odin = new Team(), floki = new Team();
            Player[] team = {playerA1,playerA2};
        Odin.teamName = "ODIN";
            Odin.players = team;
        
        Player[] teamF = {playerB1,playerB2};
            
        floki.teamName = "FLOKI";
            floki.players=teamF;
            
//        System.out.println("EL equipo "+Odin.teamName+" se conforma de:");  
//        for (Player player : Odin.players) {
//            System.out.println("el jugador: "+player.playerName);    
//        }
        
//        System.out.println("EL equipo "+floki.teamName+" se conforma de:");  
//        for (Player player : floki.players) {
//            System.out.println("el jugador: "+player.playerName);    
//        }
        
        
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
        
        for (Player player: floki.players) {
            if(player.playerName.contains("Edu")){
                System.out.println("ya lo encontre: "+ player.playerName);
                System.out.println("con lastname: "+ player.playerName.split(" ")[1]);
            }
            
        }
        StringBuilder StepLName = new StringBuilder();
        for (Player player  : floki.players) {
            String[] splits = player.playerName.split(" ");
            
            StepLName.append(splits[1]);
            StepLName.append(", ");
            StepLName.append(splits[0]);
            System.out.println(StepLName);
            StepLName.delete(0, StepLName.length());
        }
        
    }
    
}
