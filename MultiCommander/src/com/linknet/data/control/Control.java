package com.linknet.data.control;

import com.linknet.data.ControlName;
import com.linknet.data.Protocol;

public interface Control {
	public void setProtocol(Protocol p);
	public Protocol getProtocol();
	public void setControlName(ControlName cn);
	public ControlName getControlName();
}