package com.example.user.a1sthomework;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class BaseFragment extends Fragment implements EventObserver {

    @Override
    public void onEvent(FlipCardEvent event) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void onEvent(DifficultySelectedEvent event) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void onEvent(HidePairCardsEvent event) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void onEvent(FlipDownCardsEvent event) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void onEvent(StartEvent event) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void onEvent(ThemeSelectedEvent event) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void onEvent(GameWonEvent event) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void onEvent(BackGameEvent event) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void onEvent(NextGameEvent event) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void onEvent(ResetBackgroundEvent event) {
        throw new UnsupportedOperationException();
    }

}
