package main;

public abstract class Observer {
	protected Channel channel;
	protected abstract void update();
}
