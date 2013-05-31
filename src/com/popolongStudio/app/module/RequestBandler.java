package com.popolongStudio.app.module;

import net.sf.json.JSONObject;

public class RequestBandler {
	private String ReqeustID=null;
	private String Address=null;
	private String content=null;
	private JSONObject returnMSG=null;
	public String getReqeustID() {
		return ReqeustID;
	}
	public void setReqeustID(String reqeustID) {
		ReqeustID = reqeustID;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public JSONObject getReturnMSG() {
		return returnMSG;
	}
	public void setReturnMSG(JSONObject returnMSG) {
		this.returnMSG = returnMSG;
	}
}
