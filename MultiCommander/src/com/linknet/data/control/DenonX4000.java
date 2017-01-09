package com.linknet.data.control;

import com.linknet.data.ControlName;
import com.linknet.data.Protocol;
import com.linknet.data.key.DenonX4000KeyGroup;
import com.linknet.data.key.KeyGroup;

public class DenonX4000 extends AbstractRemoteControl {
	public DenonX4000(ControlName cn, Protocol protocol, KeyGroup keyGroup) {
		super(cn, protocol , keyGroup);
	}
	public DenonX4000() {
		super(ControlName.Denon_X4000,Protocol.NEC, new DenonX4000KeyGroup() );
	}
}
