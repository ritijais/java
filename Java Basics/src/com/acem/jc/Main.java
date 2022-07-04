package com.acem.jc;

import com.acem.jc.musicalinstrument.Violin;
import com.acem.jc.musicalinstrument.Flute;
import com.acem.jc.musicalinstrument.Guitar;

import com.acem.jc.ball.Football;
import com.acem.jc.ball.Basketball;
import com.acem.jc.ball.Volleyball;

public class Main {
    public static void main(String args[]) {
        String input = args[0];
        Playable playable = null;
        switch (input) {
            case "football":
                playable = new Football();
                break;
            case "basketball":
                playable = new Basketball();
                break;
            case "guitar":
                playable = new Guitar();
                break;
            case "violin":
                playable = new Violin();
                break;
            case "flute":
                playable = new Flute();
                break;
            case "volleyball":
                playable = new Volleyball();
                break;
        }
        play(playable);
    }

    public static void play(Playable playable) {
        playable.play();
        if (playable instanceof Football) {
            Football football = (Football) playable;
            football.kick();
        }
    }
}
