package com.linknet.data.key;

import java.util.ArrayList;

import com.linknet.data.client.Client;

public interface KeyGroup {
	public void setKeys(ArrayList<Key> keys);
	public ArrayList<Key> getKeys();
	public void setClient(Client c);
	public Client getClient();
}