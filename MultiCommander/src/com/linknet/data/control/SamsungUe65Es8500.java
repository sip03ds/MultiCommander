package com.linknet.data.control;

import com.linknet.data.ControlName;
import com.linknet.data.Protocol;
import com.linknet.data.key.KeyGroup;
import com.linknet.data.key.SamsungUe65Es8500KeyGroup;

public class SamsungUe65Es8500 extends AbstractRemoteControl {
	public SamsungUe65Es8500(ControlName cn, Protocol protocol, KeyGroup keyGroup) {
		super(cn, protocol , keyGroup);
	}
	public SamsungUe65Es8500() {
		super(ControlName.Samsung_UE65ES8000,Protocol.NEC , new SamsungUe65Es8500KeyGroup());
	}
}
