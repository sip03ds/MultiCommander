package com.linknet.data.control;

import com.linknet.data.ControlName;

public abstract class ControlFactory {
	public Control build(ControlName name) {
		Control c = selectControl(name);
		return c;
	}
	protected abstract Control selectControl(ControlName name);
}
