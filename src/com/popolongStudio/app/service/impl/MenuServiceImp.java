package com.popolongStudio.app.service.impl;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSON;
import net.sf.json.JSONObject;

import com.popolongStudio.app.common.ReturnCodeContent;
import com.popolongStudio.app.module.RequestBandler;
import com.popolongStudio.app.service.inf.MenuServiceInf;


public class MenuServiceImp implements MenuServiceInf {
	public boolean DEBUG=true;
	private final static String requestCreateMenu="https://api.weixin.qq.com/cgi-bin/menu/create?access_token="+ReturnCodeContent.Access_Token;
	private final static String requestQueryMenu="https://api.weixin.qq.com/cgi-bin/menu/get?access_token="+ReturnCodeContent.Access_Token;;
	private final static String requestDeleteMenu="https://api.weixin.qq.com/cgi-bin/menu/delete?access_token="+ReturnCodeContent.Access_Token;;
	public RequestBandler CreateMenu(JSONObject menuDef) {
		RequestBandler result=null;
		try{
			String content=menuDef.toString();
			result=new RequestBandler();
			result.setAddress(requestCreateMenu);
			result.setContent(content);
		}catch(Exception ex){
			if(DEBUG)ex.printStackTrace();
		}
		return result;
	}

	public RequestBandler deleteMenu() {
		RequestBandler result=new RequestBandler();
		result.setAddress(requestDeleteMenu);
		return result;
	}

	public RequestBandler fetchMenu() {
		RequestBandler result=new RequestBandler();
		result.setAddress(requestQueryMenu);
		return null;
	}

}
