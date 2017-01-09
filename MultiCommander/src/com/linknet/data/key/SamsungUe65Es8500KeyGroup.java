package com.linknet.data.key;

import java.util.ArrayList;

import com.linknet.data.client.Client;
import com.linknet.data.client.SamsungUe65Es8500Client;

public class SamsungUe65Es8500KeyGroup extends AbstractKeyGroup {
	public SamsungUe65Es8500KeyGroup(ArrayList<Key> keys, Client client) {
		super(keys, client);
	}
	
	public SamsungUe65Es8500KeyGroup() {
		super(null,new SamsungUe65Es8500Client());
		ArrayList<Key> keys = new ArrayList<Key>();
		setKeys(keys);
	}
}
