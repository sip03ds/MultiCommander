package com.linknet.data.key;

public class Record extends AbstractKey {

	public Record(KeyAction action) {
		super(action);
	}
	public Record() {
		super(KeyAction.KEY_RECORD);
	}

}
