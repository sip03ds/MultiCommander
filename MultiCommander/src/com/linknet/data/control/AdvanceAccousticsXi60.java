package com.linknet.data.control;

import com.linknet.data.ControlName;
import com.linknet.data.Protocol;
import com.linknet.data.key.AdvanceAccousticsXi60KeyGroup;
import com.linknet.data.key.KeyGroup;

public class AdvanceAccousticsXi60 extends AbstractRemoteControl {
	public AdvanceAccousticsXi60(ControlName cn, Protocol protocol, KeyGroup keyGroup) {
		super(cn, protocol , keyGroup);
	}
	public AdvanceAccousticsXi60() {
		super(ControlName.Advance_Accoustics_xi60,Protocol.NEC , new AdvanceAccousticsXi60KeyGroup() );
	}
}
