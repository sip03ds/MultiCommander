package com.linknet.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.linknet.data.control.Control;
import com.linknet.data.ControlName;
import com.linknet.data.control.RemoteControlFactory;


@ManagedBean
@ViewScoped
public class ControlManagedBean implements Serializable {

	static Logger webRecySys = null;
    static {
    	webRecySys = Logger.getLogger("com.linknet.webRecySys");    	
    }
	
	public ControlManagedBean() {
		
	}
	@PostConstruct
	public void populateCompanyData() { 
		prepareData();
	}
	
	private void prepareData() {
		RemoteControlFactory f = new RemoteControlFactory();
		remotes.add(f.build(ControlName.NOVA_TV));
		remotes.add(f.build(ControlName.OTE_TV));
		remotes.add(f.build(ControlName.Advance_Accoustics_xi60));
		remotes.add(f.build(ControlName.Advance_Accoustics_xi90));
		remotes.add(f.build(ControlName.Denon_X4000));
	}


	public ArrayList<Control> getRemotes() {
		return remotes;
	}
	public void setRemotes(ArrayList<Control> remotes) {
		this.remotes = remotes;
	}
	private static final long serialVersionUID = 1L;
    private ArrayList<Control> remotes = new ArrayList<Control>();
}