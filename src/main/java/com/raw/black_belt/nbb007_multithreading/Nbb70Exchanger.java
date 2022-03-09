package com.raw.black_belt.nbb007_multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class Nbb70Exchanger {
    public static void main(String[] args) {
        Exchanger<Action> actionExchanger =
                new Exchanger<>();
        List<Action> friendActions = new ArrayList<>();
        friendActions.add(Action.STONE);
        friendActions.add(Action.PAPER);
        friendActions.add(Action.SCISSORS);

        List<Action> friend2Actions = new ArrayList<>();
        friend2Actions.add(Action.SCISSORS);
        friend2Actions.add(Action.STONE);
        friend2Actions.add(Action.STONE);

        new BestFriend("Bob", friendActions, actionExchanger);
        new BestFriend("Pol", friend2Actions, actionExchanger);

    }
}
enum Action{
    STONE, SCISSORS, PAPER;
}
class BestFriend extends Thread{
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }
    private void whoWins(Action myAction, Action friendAction){
        if((myAction == Action.STONE && friendAction == Action.SCISSORS )
            || (myAction == Action.PAPER && friendAction == Action.STONE)
                || (myAction == Action.SCISSORS && friendAction == Action.PAPER)
        ){
            System.out.println(name + " WINS!");
        }
    }

    @Override
    public void run() {
        Action reply;
        for (Action action: myActions){
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}