package com.example.user.a1sthomework;

public abstract class AbstractEvent implements Event {

    protected abstract void fire(EventObserver eventObserver);

}
