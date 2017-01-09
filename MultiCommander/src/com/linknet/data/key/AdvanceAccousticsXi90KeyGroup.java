package com.linknet.data.key;

import java.util.ArrayList;

import com.linknet.data.client.AdvanceAccousticsXi90Client;
import com.linknet.data.client.Client;

public class AdvanceAccousticsXi90KeyGroup extends AbstractKeyGroup {
	public AdvanceAccousticsXi90KeyGroup(ArrayList<Key> keys, Client client) {
		super(keys, client);
	}
	
	public AdvanceAccousticsXi90KeyGroup() {
		super(null,new AdvanceAccousticsXi90Client());
		ArrayList<Key> keys = new ArrayList<Key>();
		setKeys(keys);
	}
}
