package com.example.user.a1sthomework;

/**
 * When the 'back to menu' was pressed.
 */
public class DifficultySelectedEvent extends AbstractEvent {

    public static final String TYPE = DifficultySelectedEvent.class.getName();

    public final int difficulty;

    public DifficultySelectedEvent(int difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    protected void fire(EventObserver eventObserver) {
        eventObserver.onEvent(this);
    }

    @Override
    public String getType() {
        return TYPE;
    }

}
