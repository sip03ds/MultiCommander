package com.linknet.data.control;

import com.linknet.data.ControlName;

public class RemoteControlFactory extends ControlFactory {
	@Override
	protected Control selectControl(ControlName name) {
		if ( name == ControlName.OTE_TV ) {
			return new KaonNs1110();  
		}
		else if ( name == ControlName.NOVA_TV ) {
			return new NovaPace831();
		}
		else if ( name == ControlName.Advance_Accoustics_xi60 ) {
			return new AdvanceAccousticsXi60();
		}
		else if ( name == ControlName.LG_TM2792S ) {
			return new LgTm2792s();
		}
		else if ( name == ControlName.Samsung_UE65ES8000 ) {
			return new SamsungUe65Es8500();
		}
		else {
			return new AdvanceAccousticsXi90();
		}
		
	}
}
