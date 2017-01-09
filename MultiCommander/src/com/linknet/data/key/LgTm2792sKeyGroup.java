package com.linknet.data.key;

import java.util.ArrayList;
import com.linknet.data.client.Client;
import com.linknet.data.client.LgTm2792sClient;

public class LgTm2792sKeyGroup extends AbstractKeyGroup {
	public LgTm2792sKeyGroup(ArrayList<Key> keys, Client client) {
		super(keys, client);
	}
	
	public LgTm2792sKeyGroup() {
		super(null,new LgTm2792sClient());
		ArrayList<Key> keys = new ArrayList<Key>();
		setKeys(keys);
	}
}
