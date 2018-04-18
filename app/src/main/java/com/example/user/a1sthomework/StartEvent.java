package com.example.user.a1sthomework;


/**
 * When the 'back to menu' was pressed.
 */
public class StartEvent extends AbstractEvent {
    private String nameAndAge;
    public static final String TYPE = StartEvent.class.getName();
    public StartEvent(String nameAndAge){
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

    public String getNameAndAge() {
        return nameAndAge;
    }
}
