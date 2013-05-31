package com.popolongStudio.app.service.impl;

import java.util.ArrayList;

import com.popolongStudio.app.common.ReturnCodeContent;
import com.popolongStudio.app.module.Article;
import com.popolongStudio.app.module.PushObj;
import com.popolongStudio.app.module.ReplyMusic;
import com.popolongStudio.app.module.ReplyNewsObj;
import com.popolongStudio.app.module.ReplyObj;
import com.popolongStudio.app.module.ReplyTextObj;
import com.popolongStudio.app.module.TextObj;
import com.popolongStudio.app.service.inf.AutoReplyInf;

public class AutoReplyImpl implements AutoReplyInf{
	private static int uselessCnt = 0;
	public boolean DEBUG=false;
	public ReplyObj replay(PushObj input) {
		ReplyObj returnObj=null;
		String msg = ReturnCodeContent.defaultMsg;
		switch (checkRequest(input)) {
		case 0:
			msg = ReturnCodeContent.defaultMsg;
			ReplyTextObj rObj=new ReplyTextObj();
			rObj.setCreateTime(new Long(System.currentTimeMillis()));
			rObj.setFromUserName(input.getToUserName());
			rObj.setToUserName(input.getFromUserName());
			rObj.setMsgType(ReturnCodeContent.ObjType.TEXT);
			rObj.setContent(msg);
			rObj.setFuncFlag(new Integer(0));
			returnObj=rObj;
			break;
		case 1:
			msg = ReturnCodeContent.TravelMsg;
			ReplyTextObj rObj1=new ReplyTextObj();
			rObj1.setCreateTime(new Long(System.currentTimeMillis()));
			rObj1.setFromUserName(input.getToUserName());
			rObj1.setToUserName(input.getFromUserName());
			rObj1.setMsgType(ReturnCodeContent.ObjType.TEXT);
			rObj1.setContent(msg);
			rObj1.setFuncFlag(new Integer(0));
			returnObj=rObj1;
			uselessCnt = 0;
			break;
		case 2:
			msg = ReturnCodeContent.TrainMsg;
			ReplyNewsObj rObj2=new ReplyNewsObj();
			rObj2.setCreateTime(new Long(System.currentTimeMillis()));
			rObj2.setFromUserName(input.getToUserName());
			rObj2.setToUserName(input.getFromUserName());
			rObj2.setMsgType(ReturnCodeContent.ObjType.NEWS);
			rObj2.setFuncFlag(new Integer(0));
			Article atc=new Article();
			atc.setDescription("this is my blog");
			atc.setPicUrl(ReturnCodeContent.ResourceAddress+"/testPic.jpg");
			atc.setTitle("news");
			atc.setUrl("http://qing.blog.sina.com.cn/1212125365");
			ArrayList<Article> ls=new ArrayList<Article>();
			ls.add(atc);
			rObj2.setArticleLS(ls);
			returnObj=rObj2;
			uselessCnt = 0;
			break;
		case 3:
			msg = ReturnCodeContent.OuttingMsg;
			ReplyMusic rObj3=new ReplyMusic();
			rObj3.setCreateTime(new Long(System.currentTimeMillis()));
			rObj3.setFromUserName(input.getToUserName());
			rObj3.setToUserName(input.getFromUserName());
			rObj3.setMsgType(ReturnCodeContent.ObjType.MUSIC);
			rObj3.setFuncFlag(new Integer(0));
			rObj3.setTitile("music");
			rObj3.setHQMusicUrl(ReturnCodeContent.ResourceAddress+"/music.wma");
			rObj3.setMusicUrl(ReturnCodeContent.ResourceAddress+"/music.wma");
			rObj3.setDescription("test music");
			returnObj=rObj3;
			uselessCnt = 0;
			break;
		case 4:
			msg = "This is a nice picture!";
			ReplyTextObj rObj4=new ReplyTextObj();
			rObj4.setCreateTime(new Long(System.currentTimeMillis()));
			rObj4.setFromUserName(input.getToUserName());
			rObj4.setToUserName(input.getFromUserName());
			rObj4.setMsgType(ReturnCodeContent.ObjType.TEXT);
			rObj4.setContent(msg);
			rObj4.setFuncFlag(new Integer(0));
			returnObj=rObj4;
			uselessCnt=0;
			break;
		case 5:
			msg = "I hear your voice!";
			ReplyTextObj rObj5=new ReplyTextObj();
			rObj5.setCreateTime(new Long(System.currentTimeMillis()));
			rObj5.setFromUserName(input.getToUserName());
			rObj5.setToUserName(input.getFromUserName());
			rObj5.setMsgType(ReturnCodeContent.ObjType.TEXT);
			rObj5.setContent(msg);
			rObj5.setFuncFlag(new Integer(0));
			returnObj=rObj5;
			uselessCnt=0;
			break;
		case 6:
			msg = "I known where you are!";
			ReplyTextObj rObj6=new ReplyTextObj();
			rObj6.setCreateTime(new Long(System.currentTimeMillis()));
			rObj6.setFromUserName(input.getToUserName());
			rObj6.setToUserName(input.getFromUserName());
			rObj6.setMsgType(ReturnCodeContent.ObjType.TEXT);
			rObj6.setContent(msg);
			rObj6.setFuncFlag(new Integer(0));
			returnObj=rObj6;
			uselessCnt=0;
			break;
		default:
			if (uselessCnt < 2) {
				msg = ReturnCodeContent.defaultMsg;
				uselessCnt++;
			} else {
				msg = ReturnCodeContent.Msg;
				uselessCnt = 0;
			}
			ReplyTextObj rObj10=new ReplyTextObj();
			rObj10.setCreateTime(new Long(System.currentTimeMillis()));
			rObj10.setFromUserName(input.getToUserName());
			rObj10.setToUserName(input.getFromUserName());
			rObj10.setMsgType(ReturnCodeContent.ObjType.TEXT);
			rObj10.setContent(msg);
			rObj10.setFuncFlag(new Integer(0));
			returnObj=rObj10;
			break;
		}
		return returnObj;
	}

	private int checkRequest(PushObj obj) {
		int returnCode=-1;
		switch(obj.getMsgType()){
		case TEXT:
			String input=((TextObj)obj).getContent().toString();
			if (input != null && input.contains("1"))
				returnCode= 1;
			else if (input != null && input.contains("2"))
				returnCode= 2;
			else if (input != null && input.contains("3"))
				returnCode= 3;
			else
				returnCode= 0;
			break;
		case IMAGE:
			returnCode= 4;
			break;
		case VOICE:
			returnCode= 5;
			break;
		case LOCATION:
			returnCode= 6;
			break;
		default:
			break;
		}
		return returnCode;
	}

}
