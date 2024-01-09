package main;

import entity.player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class TaskButtonHandler implements ActionListener {
    public Panel panel;
    public player player;

    public TaskButtonHandler(Panel panel, player player) {
        this.panel = panel;
        this.player = player;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if(Objects.equals(player.objectName, command)){
            player.points += 1;
        }
        else{
            panel.playtime += 10;
            panel.taskManager.errors += 1;
            panel.taskManager.error_time += 10;
        }
        panel.obj[player.objIndex] = null;
        GameState.state = GameState.PLAY;
    }
}

