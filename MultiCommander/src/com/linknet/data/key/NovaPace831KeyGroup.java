package com.linknet.data.key;

import java.util.ArrayList;

import com.linknet.data.client.Client;
import com.linknet.data.client.NovaPace831Client;

public class NovaPace831KeyGroup extends AbstractKeyGroup {

	public NovaPace831KeyGroup(ArrayList<Key> keys, Client client) {
		super(keys, client);
	}
	
	public NovaPace831KeyGroup() {
		super(null,new NovaPace831Client());
		ArrayList<Key> keys = new ArrayList<Key>();
		keys.add(new Power());
		keys.add(new Radio());
		keys.add(new Tv());
		keys.add(new Games());
		keys.add(new Dashboard());
		keys.add(new Pvr());
		keys.add(new Epg());
		keys.add(new VolumeUp());
		keys.add(new Up());
		keys.add(new ChannelUp());
		keys.add(new Left());
		keys.add(new Ok());
		keys.add(new Right());
		keys.add(new VolumeDown());
		keys.add(new Down());
		keys.add(new ChannelDown());
		keys.add(new Program());
		keys.add(new Exit());
		keys.add(new Info());
		keys.add(new Mute());
		keys.add(new List());
		keys.add(new Bookmarks());
		keys.add(new Menu());
		keys.add(new Rewind());
		keys.add(new Pause());
		keys.add(new FastForward());
		keys.add(new Record());
		keys.add(new Play());
		keys.add(new Stop());
		keys.add(new Red());
		keys.add(new Green());
		keys.add(new Yellow());
		keys.add(new Blue());
		keys.add(new Numeric1());
		keys.add(new Numeric2());
		keys.add(new Numeric3());
		keys.add(new Numeric4());
		keys.add(new Numeric5());
		keys.add(new Numeric6());
		keys.add(new Numeric7());
		keys.add(new Numeric8());
		keys.add(new Text());
		keys.add(new Numeric9());
		keys.add(new Question());
		setKeys(keys);
	}

}
