package com.linknet.data.control;

import com.linknet.data.ControlName;
import com.linknet.data.Protocol;
import com.linknet.data.key.KeyGroup;
import com.linknet.data.key.NovaPace831KeyGroup;

public class NovaPace831 extends AbstractRemoteControl {

	public NovaPace831(ControlName cn, Protocol protocol, KeyGroup keyGroup) {
		super(cn, protocol, keyGroup);
	}
	
	public NovaPace831() {
		super(ControlName.NOVA_TV , Protocol.XMP1 ,  new NovaPace831KeyGroup() );
	}
	
	/*
	public NovaPace831(ControlName cn, Protocol p, Client c) {
		super(cn, p , c);
	}
	public NovaPace831() {
		super(ControlName.NOVA_TV ,Protocol.XMP1 , new NovaPace831Client() );
		ArrayList<String> keys = new ArrayList<String>();
		keys.add("KEY_POWER");		// shape="rect" coords="161,202,271,309"
		keys.add("KEY_RADIO");		// shape="rect" coords="351,156,468,258"
		keys.add("KEY_TV");			// shape="rect" coords="547,109,666,232"
		
		keys.add("KEY_GAMES");		// shape="rect" coords="121,471.99998474121094,288,549.9999847412109"
		keys.add("KEY_DASHBOARD");  // shape="rect" coords="256,372.99998474121094,419,448.99998474121094" 
		keys.add("KEY_PVR");        // shape="rect" coords="454,374,611,447" 
		keys.add("KEY_EPG");		// shape="rect" coords="581,465.99998474121094,747,550.9999847412109" 	
		
		keys.add("KEY_VOLUMEUP");	// shape="rect" coords="122,652.9999847412109,232,772.9999847412109" 	
		keys.add("KEY_UP");			// shape="rect" coords="376,611,492,711" 
		keys.add("KEY_CHANNELUP");	// shape="rect" coords="648,649,757,760" 
		
		keys.add("KEY_LEFT");		// shape="rect" coords="193,832.0000152587891,288,906.0000152587891" 
		keys.add("KEY_OK");			// shape="rect" coords="361,791,520,939" 		
		keys.add("KEY_RIGHT");		// shape="rect" coords="586,825.0000152587891,699,905.0000152587891" 
		
		keys.add("KEY_VOLUMEDOWN");	// shape="rect" coords="146,1010,287,1115"
		keys.add("KEY_DOWN");		// shape="rect" coords="383,1015.0000152587891,509,1118.000015258789" 
		keys.add("KEY_CHANNELDOWN");// shape="rect" coords="596,1002,739,1111" 
		
		keys.add("KEY_PROGRAM");    // shape="rect" coords="260,1205,372,1309"
		keys.add("KEY_EXIT");		// shape="rect" coords="396,1314,510,1427" 	
		keys.add("KEY_INFO");		// shape="rect" coords="528,1194,643,1302"
		
		keys.add("KEY_MUTE");		// shape="rect" coords="139,1446,259,1553"
		keys.add("KEY_LIST");       // shape="rect" coords="310,1497,416,1598"
		keys.add("KEY_BOOKMARKS");	// shape="rect" coords="484,1497,599,1593" 
		keys.add("KEY_MENU");		// shape="rect" coords="644,1442.000015258789,764,1541.000015258789"
		
		keys.add("KEY_REWIND");		// shape="rect" coords="149,1652,314,1714"
		keys.add("KEY_PAUSE");		// shape="rect" coords="380,1678,527,1745"
		keys.add("KEY_FASTFORWARD");// shape="rect" coords="599,1640.000015258789,755,1709.000015258789"	
		
		keys.add("KEY_RECORD");		// shape="rect" coords="143,1769,317,1828"
		keys.add("KEY_PLAY");		// shape="rect" coords="383,1768,533,1839" 
		keys.add("KEY_STOP");		// shape="rect" coords="601,1758,752,1829" 
		
		keys.add("KEY_RED");		// shape="rect" coords="158,1912,260,1993" 	
		keys.add("KEY_GREEN");		// shape="rect" coords="319,1920.000015258789,430,2001.000015258789"
		keys.add("KEY_YELLOW");		// shape="rect" coords="483,1915,599,2000" 		
		keys.add("KEY_BLUE");		// shape="rect" coords="656,1903,760,1985" 	
			
		
		keys.add("KEY_NUMERIC_1");  // shape="rect" coords="207,2074.9999389648438,332,2139.9999389648438"
		keys.add("KEY_NUMERIC_2");  // shape="rect" coords="397,2072.0000762939453,529,2138.0000762939453" 
		keys.add("KEY_NUMERIC_3");  // shape="rect" coords="593,2067.0000762939453,725,2135.0000762939453"
		
		keys.add("KEY_NUMERIC_4");  // shape="rect" coords="210,2216.9999389648438,342,2284.9999389648438"
		keys.add("KEY_NUMERIC_5");  // shape="rect" coords="404,2216.0000762939453,533,2282.0000762939453" 
		keys.add("KEY_NUMERIC_6");  // shape="rect" coords="593,2209.0000762939453,720,2277.0000762939453"
		
		keys.add("KEY_NUMERIC_7");  // shape="rect" coords="207,2336.0000762939453,344,2418.0000762939453" 
		keys.add("KEY_NUMERIC_8");  // shape="rect" coords="400,2335.0000762939453,528,2417.0000762939453" 
		keys.add("KEY_NUMERIC_9");  // shape="rect" coords="594,2330.0000762939453,719,2413.0000762939453" 
		
		keys.add("KEY_TEXT");		// shape="rect" coords="213,2475.0000610351562,345,2551.0000610351562"	
		keys.add("KEY_NUMERIC_0");  // shape="rect" coords="400,2475.0000610351562,536,2552.0000610351562"
		keys.add("KEY_QUESTION");   // shape="rect" coords="597,2478.0000610351562,719,2549.0000610351562" 

		setKeys(keys);
	}
	*/

}
