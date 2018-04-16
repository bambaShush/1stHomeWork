package com.example.user.a1sthomework;

import android.media.MediaPlayer;

public class Music {

    public static boolean OFF = false;

    public static void playCorrent() {
        if (!OFF) {
            MediaPlayer mp = MediaPlayer.create(Shared.context, R.raw.correct_answer);
            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mp.reset();
                    mp.release();
                    mp = null;
                }

            });
            mp.start();
        }
    }

    public static void playBackgroundMusic() {
        // TODO
    }

    public static void showStar() {
        if (!OFF) {
            MediaPlayer mp = MediaPlayer.create(Shared.context, R.raw.star);
            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mp.reset();
                    mp.release();
                    mp = null;
                }

            });
            mp.start();
        }
    }
}

