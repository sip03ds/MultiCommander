package com.linknet.data.control;

import com.linknet.data.ControlName;
import com.linknet.data.Protocol;
import com.linknet.data.key.Key;
import com.linknet.data.key.KeyGroup;

public class AbstractRemoteControl implements Control {
	public AbstractRemoteControl(ControlName cn, Protocol protocol, KeyGroup keyGroup) {
		super();
		this.cn = cn;
		this.protocol = protocol;
		this.keyGroup = keyGroup;
	}
	
	@Override
	public void setProtocol(Protocol p) {
		this.protocol = p;
	}
	@Override
	public Protocol getProtocol() {
		return this.protocol;
	}
	@Override
	public void setControlName(ControlName cn) {
		this.cn = cn;
	}
	@Override
	public ControlName getControlName() {
		return this.cn;
	}
	public String toString() {
		return getClass().getSimpleName() +" ("+cn+" , "+protocol +")";
	}
	
	public KeyGroup getKeyGroup() {
		return keyGroup;
	}

	public void setKeyGroup(KeyGroup keyGroup) {
		this.keyGroup = keyGroup;
	}
	public void sendCommand(Key k) {
		for ( Key key : this.getKeyGroup().getKeys() ) {
			if ( key == k ) {
				this.getKeyGroup().getClient().callService(this.getControlName(), key.toString() );
			}
		}
	}
	
	private ControlName cn;
	private Protocol protocol;
	private KeyGroup keyGroup;
}
