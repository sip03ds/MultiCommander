package com.linknet.data.key;

public abstract class AbstractKey implements Key {
	public AbstractKey(KeyAction action) {
		this.action = action;
	}
	public void setAction(KeyAction action) {
		this.action = action;
	}
	public KeyAction getAction() {
		return this.action;
	}
	private KeyAction action;
}
