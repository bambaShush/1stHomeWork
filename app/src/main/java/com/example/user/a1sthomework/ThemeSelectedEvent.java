package com.example.user.a1sthomework;


public class ThemeSelectedEvent extends AbstractEvent {

    public static final String TYPE = ThemeSelectedEvent.class.getName();
    public final Theme theme;
    private String nameAndAge;

    public ThemeSelectedEvent(Theme theme,String nameAndAge) {
        this.theme = theme;
        this.nameAndAge=nameAndAge;
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
