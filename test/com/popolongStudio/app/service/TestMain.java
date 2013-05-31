package com.popolongStudio.app.service;

import java.io.ByteArrayOutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.tree.DefaultCDATA;

import net.sf.json.JSONObject;


public class TestMain {
	private static final String StringBG = "<![CDATA[";
	private static final String StringED = "]]>";
	/**
	 * @param args
	 * @throws URISyntaxException 
	 */
	public static void main(String[] args) throws URISyntaxException {
		// TODO Auto-generated method stub
		/*
		HashMap jsonObj1=new HashMap();
		jsonObj1.put("type", "click");
		jsonObj1.put("name", "歌曲");
		jsonObj1.put("key", "V1001_TODAY_MUSIC");
		
		HashMap jsonObj2=new HashMap();
		jsonObj2.put("type", "click");
		jsonObj2.put("name", "歌手简介");
		jsonObj2.put("key", "V1001_TODAY_SINGER");

		HashMap jsonObj321=new HashMap();
		jsonObj321.put("type", "click");
		jsonObj321.put("name", "hello word");
		jsonObj321.put("key", "V1001_HELLO_WORLD");
		HashMap jsonObj322=new HashMap();
		jsonObj322.put("type", "click");
		jsonObj322.put("name", "赞一下我们");
		jsonObj322.put("key", "V1001_GOOD");
		List<Object> jsonObj32 = new ArrayList<Object>();
		jsonObj32.add(jsonObj321);
		jsonObj32.add(jsonObj322);
		HashMap jsonObj3=new HashMap();
		jsonObj3.put("name", "菜单");
		jsonObj3.put("sub_button", jsonObj32);
		List<Object> all = new ArrayList<Object>();
		all.add(jsonObj1);
		all.add(jsonObj2);
		all.add(jsonObj3);
		HashMap jsonObjAll=new HashMap();
		jsonObjAll.put("button", all);
		JSONObject json=new JSONObject();
		json.putAll(jsonObjAll);
		System.out.println(json.toString());
		String res=json.toString();
		JSONObject json2=JSONObject.fromObject(res);  
		System.out.println("=="+(json.equals(json2)));
		
		String test="你最2";
		System.out.println(test.contains("2"));
		*/
		//Element root = new Element("xml");
		//Document doc = new Document(root);
		Document doc = DocumentHelper.createDocument();
		Element root = doc.addElement("xml");
		Element TUN = root.addElement("ToUserName");
		TUN.add(new DefaultCDATA("tousername"));
		Element FUN = root.addElement("FromUserName");
		FUN.add(new DefaultCDATA("userName"));
		Element CT = root.addElement("CreateTime");
		CT.setText(String.valueOf(System.currentTimeMillis()));
		Element MT = root.addElement("MsgType");
		MT.add(new DefaultCDATA("text"));
		Element CNT = root.addElement("Content");
		CNT.add(new DefaultCDATA("content"));
		Element MsgID = root.addElement("MsgId");
		MsgID.setText(String.valueOf(12342443));
		
		try {
			System.out.println(doc.asXML());
		} catch (Exception e) {
				e.printStackTrace();
		}
		System.out.println(TestMain.class.getName()+"|"+TestMain.class.getSimpleName());
		System.out.println();
		System.out.println(doc.asXML().substring(doc.asXML().indexOf("<xml>")));
		System.out.println(new URI(null).toString());
	}

}
