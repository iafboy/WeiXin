package com.popolongStudio.app.service.impl;

import java.util.List;


import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.tree.DefaultCDATA;

import com.popolongStudio.app.common.ReturnCodeContent;
import com.popolongStudio.app.module.Article;
import com.popolongStudio.app.module.Event;
import com.popolongStudio.app.module.EventObj;
import com.popolongStudio.app.module.ImageObj;
import com.popolongStudio.app.module.LocationObj;
import com.popolongStudio.app.module.PushObj;
import com.popolongStudio.app.module.ReplyMusic;
import com.popolongStudio.app.module.ReplyNewsObj;
import com.popolongStudio.app.module.ReplyObj;
import com.popolongStudio.app.module.ReplyTextObj;
import com.popolongStudio.app.module.TextObj;
import com.popolongStudio.app.module.UrlObj;
import com.popolongStudio.app.service.inf.MessageHandler;

public class MessageHandlerImpl implements MessageHandler {
	public boolean DEBUG = false;

	public String PushMTextMsg(String toUserName, String userName,
			String content, long MsgId) {
		String result = null;
		Document doc = DocumentHelper.createDocument();
		Element root = doc.addElement("xml");
		Element TUN = root.addElement("ToUserName");
		TUN.add(new DefaultCDATA(toUserName));
		Element FUN = root.addElement("FromUserName");
		FUN.add(new DefaultCDATA(userName ));													
		Element CT = root.addElement("CreateTime");
		CT.setText(String.valueOf(System.currentTimeMillis()));
		Element MT =root.addElement("MsgType");
		MT.add(new DefaultCDATA("text" ));
		Element CNT =root.addElement("Content");
		CNT.add(new DefaultCDATA(content ));
		Element MsgID =root.addElement("MsgId");
		MsgID.setText(String.valueOf(MsgId));
		try {
			result = transString(doc.asXML());
		} catch (Exception e) {
			if (DEBUG){System.out.println(e);e.printStackTrace();}
		}
		return result;
	}


	public String PushPicMsg(String toUserName, String userName, String PicUrl,
			long MsgId) {
		String result = null;
		Document doc = DocumentHelper.createDocument();;
		Element root = doc.addElement("xml");
		Element TUN = root.addElement("ToUserName");
		TUN.add(new DefaultCDATA(toUserName ));
		Element FUN = root.addElement("FromUserName");
		FUN.add(new DefaultCDATA(userName ));
		Element CT = root.addElement("CreateTime");
		CT.setText(String.valueOf(System.currentTimeMillis()));
		Element MT =root.addElement("MsgType");
		MT.add(new DefaultCDATA("image" ));
		Element CNT = root.addElement("PicUrl");
		CNT.add(new DefaultCDATA(PicUrl ));
		Element MsgID =root.addElement("MsgId");
		MsgID.setText(String.valueOf(MsgId));
		try {
			result = transString(doc.asXML());
		} catch (Exception e) {
			if (DEBUG){System.out.println(e);e.printStackTrace();}
		}
		return result;
	}
	public String PushLocationMsg(String toUserName, String userName,
			float Location_x, float Location_y, long Scale, String Label,
			long MsgId) {
		String result = null;
		Document doc = DocumentHelper.createDocument();;
		Element root = doc.addElement("xml");
		Element TUN = root.addElement("ToUserName");
		TUN.add(new DefaultCDATA(toUserName ));
		Element FUN = root.addElement("FromUserName");
		FUN.add(new DefaultCDATA(userName ));
		Element CT = root.addElement("CreateTime");
		CT.setText(String.valueOf(System.currentTimeMillis()));
		Element MT = root.addElement("MsgType");
		MT.add(new DefaultCDATA("location" ));
		Element CNT = root.addElement("Location_X");
		CNT.add(new DefaultCDATA(Float.toString(Location_x)));
		Element CNT1 = root.addElement("Location_Y");
		CNT1.add(new DefaultCDATA(Float.toString(Location_y)));
		Element ScaleEM = root.addElement("Scale");
		ScaleEM.setText(String.valueOf(Scale));
		Element LabelEM = root.addElement("Label");
		LabelEM.add(new DefaultCDATA(Label ));
		Element MsgID = doc.addElement("MsgId");
		MsgID.setText(String.valueOf(MsgId));
		try {
			result = transString(doc.asXML());
		} catch (Exception e) {
			if (DEBUG){System.out.println(e);e.printStackTrace();}
		}
		return result;
	}

	
	public String PushUrlMsg(String toUserName, String userName, String title,
			String Description, String url, long msgId) {
		String result = null;
		Document doc = DocumentHelper.createDocument();;
		Element root = doc.addElement("xml");
		Element TUN = root.addElement("ToUserName");
		TUN.add(new DefaultCDATA(toUserName ));
		Element FUN = root.addElement("FromUserName");
		FUN.add(new DefaultCDATA(userName ));
		Element CT = root.addElement("CreateTime");
		CT.setText(String.valueOf(System.currentTimeMillis()));
		Element MT = root.addElement("MsgType");
		MT.add(new DefaultCDATA("link" ));
		Element CNT = root.addElement("Url");
		CNT.add(new DefaultCDATA(url ));
		Element MsgID = root.addElement("MsgId");
		MsgID.setText(String.valueOf(msgId));
		try {
			result = transString(doc.asXML());
		} catch (Exception e) {
			if (DEBUG){System.out.println(e);e.printStackTrace();}
		}
		return result;	
	}

	
	public String PushEventMsg(String toUserName, String userName, Event event) {
		String result = null;
		Document doc = DocumentHelper.createDocument();
		Element root = doc.addElement("xml");
		Element TUN = root.addElement("ToUserName");
		TUN.add(new DefaultCDATA(toUserName ));
		Element FUN = root.addElement("FromUserName");
		FUN.add(new DefaultCDATA(userName ));
		Element CT = root.addElement("CreateTime");
		CT.setText(String.valueOf(System.currentTimeMillis()));
		Element MT = root.addElement("MsgType");
		MT.add(new DefaultCDATA("event" ));
		Element CNT = root.addElement("Event");
		CNT.add(new DefaultCDATA(event.getType().toString()));
		Element MsgID = root.addElement("EventKey");
		MsgID.setText(event.getEventKey());
		try {
			result = transString(doc.asXML());
		} catch (Exception e) {
			if (DEBUG){System.out.println(e);e.printStackTrace();}
		}
		return result;
	}

	
	public String ReplyTextMsg(String toUserName, String userName,
			String content, int FuncFlag) {
		String result = null;
		Document doc = DocumentHelper.createDocument();;
		Element root = doc.addElement("xml");
		Element TUN = root.addElement("ToUserName");
		TUN.add(new DefaultCDATA(toUserName ));
		Element FUN = root.addElement("FromUserName");
		FUN.add(new DefaultCDATA(userName ));
		Element CT = root.addElement("CreateTime");
		CT.setText(String.valueOf(System.currentTimeMillis()));
		Element MT = root.addElement("MsgType");
		MT.add(new DefaultCDATA("text" ));
		Element CNT = root.addElement("Content");
		CNT.add(new DefaultCDATA(content ));
		Element funcFlag = root.addElement("FuncFlag");
		funcFlag.setText(String.valueOf(FuncFlag));
		try {
			result = transString(doc.asXML());
		} catch (Exception e) {
			if (DEBUG){System.out.println(e);e.printStackTrace();}
		}
		return result;
	}

	
	public String ReplyMusicMsg(String toUserName, String userName,
			String title,String desctription,String musicUrl, String hqMusicUrl, int funcFlag) {
		String result = null;
		Document doc = DocumentHelper.createDocument();;
		Element root = doc.addElement("xml");
		Element TUN = root.addElement("ToUserName");
		TUN.add(new DefaultCDATA(toUserName ));
		Element FUN = root.addElement("FromUserName");
		FUN.add(new DefaultCDATA(userName ));
		Element CT = root.addElement("CreateTime");
		CT.setText(String.valueOf(System.currentTimeMillis()));
		Element MT = root.addElement("MsgType");
		MT.add(new DefaultCDATA("music" ));
		Element Music=root.addElement("Music");
		Element Title= Music.addElement("Title");
		Title.add(new DefaultCDATA(title ));
		Element Desc = Music.addElement("Description");
		Desc.add(new DefaultCDATA(desctription));
		Element MusicUrl = Music.addElement("MusicUrl");
		MusicUrl.add(new DefaultCDATA(musicUrl ));
		Element HQMusicUrl = Music.addElement("HQMusicUrl");
		HQMusicUrl.add(new DefaultCDATA(hqMusicUrl ));
		Element FuncFlag = root.addElement("FuncFlag");
		FuncFlag.setText(Integer.toString(funcFlag));
		
		try {
			result = transString(doc.asXML());
		} catch (Exception e) {
			if (DEBUG){System.out.println(e);e.printStackTrace();}
		}
		return result;
	}

	
	public String ReplyArticleMsg(String toUserName, String userName,
			List<Article> articleLs, int funcFlag) {
		String result = null;
		Document doc = DocumentHelper.createDocument();;
		Element root = doc.addElement("xml");
		Element TUN = root.addElement("ToUserName");
		TUN.add(new DefaultCDATA(toUserName ));
		Element FUN = root.addElement("FromUserName");
		FUN.add(new DefaultCDATA(userName ));
		Element CT = root.addElement("CreateTime");
		CT.setText(String.valueOf(System.currentTimeMillis()));
		Element MT = root.addElement("MsgType");
		MT.add(new DefaultCDATA("news" ));
		if(articleLs!=null&&articleLs.size()>0){
			Element ArticleCount = root.addElement("ArticleCount");
			ArticleCount.setText(String.valueOf(articleLs.size()));
			Element Articles =root.addElement("Articles");
			for(int i=0,size=articleLs.size();i<size;i++){
				Article article=articleLs.get(i);
				Element item=Articles.addElement("item");
				Element Title=item.addElement("Title");
				Title.add(new DefaultCDATA(article.getTitle()));
				Element Desc=item.addElement("Description");
				Desc.add(new DefaultCDATA(article.getDescription()));
				Element PicUrl=item.addElement("PicUrl");
				PicUrl.add(new DefaultCDATA(article.getPicUrl()));
				Element Url=item.addElement("Url");
				Url.add(new DefaultCDATA(article.getUrl()));
			}
		}
		Element FuncFlag = root.addElement("FuncFlag");
		FuncFlag.add(new DefaultCDATA(Integer.toString(funcFlag)));
		
		try {
			result = transString(doc.asXML());
		} catch (Exception e) {
			if (DEBUG){System.out.println(e);e.printStackTrace();}
		}
		return result;
	}

	
	private String transString(String asXML) {
		String result=asXML;
		int intdex=asXML.indexOf("<xml>");
		result=asXML.substring(intdex);
		return result;
	}


	public Document RecevieMsg(String content) {
		Document doc = null;
		try {
			 doc = DocumentHelper.parseText(content);
		} catch (Exception e) {
			if (DEBUG) {
				System.out.println(e);
				e.printStackTrace();
			}
		}
		return doc;
	}


	public String PushMTextMsg(TextObj obj) {
		return PushMTextMsg(obj.getToUserName(),obj.getFromUserName(), obj.getContent().toString(), obj.getMsgId().longValue());
	}


	public String PushPicMsg(ImageObj obj) {
		return PushPicMsg(obj.getToUserName(), obj.getFromUserName(),obj.getPicUrl(), obj.getMsgId());
	}


	public String PushLocationMsg(LocationObj obj) {
		// TODO Auto-generated method stub
		return PushLocationMsg(obj.getToUserName(), obj.getFromUserName(),obj.getLocation_X().floatValue(), obj.getLocation_Y().floatValue(), obj.getScale().longValue(), obj.getLabel(),obj.getMsgId());
	}


	public String PushUrlMsg(UrlObj obj) {
		// TODO Auto-generated method stub
		return PushUrlMsg(obj.getToUserName(), obj.getFromUserName(), obj.getTitle(), obj.getDescription(), obj.getUrl(), obj.getMsgId().longValue());
	}


	public String PushEventMsg(EventObj obj) {
		// TODO Auto-generated method stub
		return this.PushEventMsg(obj.getToUserName(), obj.getFromUserName(),obj.getEvent_());
	}


	public String ReplyTextMsg(ReplyTextObj obj) {
		return ReplyTextMsg(obj.getToUserName(),obj.getFromUserName(),obj.getContent(), obj.getFuncFlag().intValue());
	}


	public String ReplyMusicMsg(ReplyMusic obj) {
		return ReplyMusicMsg(obj.getToUserName(), obj.getFromUserName(), obj.getTitile(), obj.getDescription(), obj.getHQMusicUrl().toString(), obj.getMusicUrl().toString(), obj.getFuncFlag().intValue());
	}


	public String ReplyArticleMsg(ReplyNewsObj obj) {
		return ReplyArticleMsg(obj.getToUserName(),obj.getFromUserName(), obj.getArticleLS(), obj.getFuncFlag().intValue());
	}


	public String PushMsg(PushObj obj) {
		String result=null;
		switch(obj.getMsgType()){
		case TEXT:
			result=PushMTextMsg((TextObj)obj);
			break;
		case IMAGE:
			result=PushPicMsg((ImageObj)obj);
			break;
		case LOCATION:
			result=PushLocationMsg((LocationObj)obj);
			break;
		case LINK:
			result=PushUrlMsg((UrlObj)obj);
			break;
		case EVENT:
			result=PushEventMsg((EventObj)obj);
			break;
		default:
			TextObj oj=new TextObj();
			oj.setFromUserName(obj.getFromUserName());
			oj.setToUserName(obj.getToUserName());
			oj.setCreateTime(new Long(System.currentTimeMillis()));
			oj.setMsgType(ReturnCodeContent.ObjType.TEXT);
			oj.setContent(new StringBuffer(ReturnCodeContent.hintMsg));
			oj.setMsgId(obj.getMsgId());
			result=PushMTextMsg(oj);
			break;
		}
		return result;
	}


	public String ReplyMsg(ReplyObj obj) {
		String result=null;
		switch(obj.getMsgType()){
		case TEXT:
			result=ReplyTextMsg((ReplyTextObj)obj);
			break;
		case NEWS:
			result=this.ReplyArticleMsg((ReplyNewsObj)obj);
			break;
		case MUSIC:
			result=this.ReplyMusicMsg((ReplyMusic)obj);
			break;
		default:
			ReplyTextObj rto=new ReplyTextObj();
			rto.setFromUserName(obj.getFromUserName());
			rto.setToUserName(obj.getToUserName());
			rto.setFuncFlag(new Integer(0));
			rto.setMsgType(ReturnCodeContent.ObjType.TEXT);
			rto.setCreateTime(new Long(System.currentTimeMillis()));
			rto.setContent(ReturnCodeContent.hintMsg);
			result=this.ReplyTextMsg(rto);
			rto=null;
			break;
		}
		return result;
	}

}
