package com.linknet.data.key;

import java.util.ArrayList;

import com.linknet.data.client.AdvanceAccousticsXi60Client;
import com.linknet.data.client.Client;

public class AdvanceAccousticsXi60KeyGroup extends AbstractKeyGroup {
	public AdvanceAccousticsXi60KeyGroup(ArrayList<Key> keys, Client client) {
		super(keys, client);
	}
	
	public AdvanceAccousticsXi60KeyGroup() {
		super(null,new AdvanceAccousticsXi60Client());
		ArrayList<Key> keys = new ArrayList<Key>();
		setKeys(keys);
	}
}
