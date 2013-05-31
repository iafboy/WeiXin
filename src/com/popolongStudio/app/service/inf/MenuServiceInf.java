package com.popolongStudio.app.service.inf;

import com.popolongStudio.app.module.RequestBandler;

import net.sf.json.JSONObject;

public interface MenuServiceInf {
	public RequestBandler CreateMenu(JSONObject menuDef);
	public RequestBandler deleteMenu();
	public RequestBandler fetchMenu();
}
