package com.linknet.data.control;

import com.linknet.data.ControlName;
import com.linknet.data.Protocol;
import com.linknet.data.key.KeyGroup;
import com.linknet.data.key.LgTm2792sKeyGroup;

public class LgTm2792s extends AbstractRemoteControl {

	public LgTm2792s(ControlName cn, Protocol protocol, KeyGroup keyGroup) {
		super(cn, protocol , keyGroup);
		
	}
	public LgTm2792s() {
		super(ControlName.LG_TM2792S,Protocol.NEC,new LgTm2792sKeyGroup());
	}
}
