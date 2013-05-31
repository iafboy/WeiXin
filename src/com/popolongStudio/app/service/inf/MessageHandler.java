package com.popolongStudio.app.service.inf;

import java.util.List;

import org.dom4j.Document;


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

public interface MessageHandler {
	public String PushMTextMsg(String toUserName, String userName,String content,long MsgId);
	public String PushPicMsg(String toUserName, String userName,String PicUrl,long MsgId);
	public String PushLocationMsg(String toUserName, String userName,float Location_x,float Location_y,long Scale,String Label,long MsgId);
	public String PushUrlMsg(String toUserName, String userName,String title,String Description,String url,long message);
	public String PushEventMsg(String toUserName, String userName,Event event);
	public String PushMTextMsg(TextObj obj);
	public String PushPicMsg(ImageObj obj);
	public String PushLocationMsg(LocationObj obj);
	public String PushUrlMsg(UrlObj obj);
	public String PushEventMsg(EventObj obj);
	public String ReplyTextMsg(String toUserName, String userName,String content,int FuncFlag);
	public String ReplyMusicMsg(String toUserName, String userName,String title,String desctription,String musicUrl, String hqMusicUrl, int funcFlag);
	public String ReplyArticleMsg(String toUserName, String userName,List<Article> articleLs,int FuncFlag);
	public String ReplyTextMsg(ReplyTextObj obj);
	public String ReplyMusicMsg(ReplyMusic obj);
	public String ReplyArticleMsg(ReplyNewsObj obj);
	public Document RecevieMsg(String content);
	public String PushMsg(PushObj obj);
	public String ReplyMsg(ReplyObj obj);
}
