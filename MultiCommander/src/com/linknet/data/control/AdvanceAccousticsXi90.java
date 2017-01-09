package com.linknet.data.control;

import com.linknet.data.ControlName;
import com.linknet.data.Protocol;
import com.linknet.data.key.AdvanceAccousticsXi90KeyGroup;
import com.linknet.data.key.KeyGroup;

public class AdvanceAccousticsXi90 extends AbstractRemoteControl {
	public AdvanceAccousticsXi90(ControlName cn, Protocol protocol, KeyGroup keyGroup) {
		super(cn, protocol , keyGroup);
	}
	public AdvanceAccousticsXi90() {
		super(ControlName.Advance_Accoustics_xi60,Protocol.NEC , new AdvanceAccousticsXi90KeyGroup() );
	}
}
