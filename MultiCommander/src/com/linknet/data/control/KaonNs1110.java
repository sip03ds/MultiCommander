package com.linknet.data.control;

import com.linknet.data.ControlName;
import com.linknet.data.Protocol;
import com.linknet.data.key.KaonNs1110KeyGroup;
import com.linknet.data.key.KeyGroup;

public class KaonNs1110 extends AbstractRemoteControl {

	public KaonNs1110(ControlName cn, Protocol protocol, KeyGroup keyGroup) {
		super(cn, protocol , keyGroup);
		
	}
	public KaonNs1110() {
		super(ControlName.OTE_TV , Protocol.NEC ,  new KaonNs1110KeyGroup() );
	}
}