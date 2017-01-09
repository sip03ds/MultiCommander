package com.linknet.data.key;

import java.util.ArrayList;

import com.linknet.data.client.Client;

public abstract class AbstractKeyGroup implements KeyGroup {
	public AbstractKeyGroup(ArrayList<Key> keys, Client client) {
		super();
		this.keys = keys;
		this.client = client;
	}
	public ArrayList<Key> getKeys() {
		return keys;
	}
	public void setKeys(ArrayList<Key> keys) {
		this.keys = keys;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	private ArrayList<Key> keys;
	private Client client;
}
