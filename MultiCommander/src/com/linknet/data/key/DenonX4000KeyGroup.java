package com.linknet.data.key;

import java.util.ArrayList;
import com.linknet.data.client.Client;
import com.linknet.data.client.DenonX4000Client;

public class DenonX4000KeyGroup extends AbstractKeyGroup {
	public DenonX4000KeyGroup(ArrayList<Key> keys, Client client) {
		super(keys, client);
	}
	
	public DenonX4000KeyGroup() {
		super(null,new DenonX4000Client());
		ArrayList<Key> keys = new ArrayList<Key>();
		setKeys(keys);
	}
}
