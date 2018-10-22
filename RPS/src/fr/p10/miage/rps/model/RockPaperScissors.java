package fr.p10.miage.rps.model;

import static fr.p10.miage.rps.model.RPSEnum.PAPER;
import static fr.p10.miage.rps.model.RPSEnum.ROCK;
import static fr.p10.miage.rps.model.RPSEnum.SCISSORS;

public class RockPaperScissors {
    Result play(RPSEnum p1, RPSEnum p2){
        if(p1==p2)
        return Result.TIE;
        if((p1==SCISSORS && p2==PAPER) || (p1==PAPER && p2==ROCK) || (p1==ROCK && p2==SCISSORS)){
            return Result.WIN;
        }
        else{
            return Result.LOST;
        }
    }

}
