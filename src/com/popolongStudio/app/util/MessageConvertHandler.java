package com.popolongStudio.app.util;

import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.popolongStudio.app.common.ReturnCodeContent;
import com.popolongStudio.app.module.ImageObj;
import com.popolongStudio.app.module.LocationObj;
import com.popolongStudio.app.module.PushObj;
import com.popolongStudio.app.module.TextObj;
import com.popolongStudio.app.module.VoiceObj;

public class MessageConvertHandler {
	public boolean DEBUG = false;

	public PushObj ConvertPushMSG(String input) {
		Document doc = null;
		try {
			doc = DocumentHelper.parseText(input);
		} catch (Exception e) {
			if (DEBUG)
				e.printStackTrace();
		}
		if (doc != null) {
			PushObj instance = CreatePushMsgInstance(doc);
			if (instance != null)
				return instance;
		}
		return null;
	}

	private PushObj CreatePushMsgInstance(Document doc) {
		Element root = doc.getRootElement();
		if ("xml".equalsIgnoreCase(root.getName())) {
			Iterator Emts = root.elementIterator();
			String MsgTypeValue = null;
			while (Emts.hasNext()) {
				if ((Emts != null)) {
					Element tagEmt = (Element) Emts.next();
					if ("MsgType".equalsIgnoreCase(tagEmt.getName())) {
						MsgTypeValue = tagEmt.getText();
						break;
					}

				}
			}
			if (MsgTypeValue != null && !"".equals(MsgTypeValue.trim())) {
				if ("text".equalsIgnoreCase(MsgTypeValue.trim().toLowerCase())) {
					return setValueInToObject(TextObj.class, doc);
				} else if ("voice".equalsIgnoreCase(MsgTypeValue.trim()
						.toLowerCase())) {
					return setValueInToObject(VoiceObj.class, doc);
				} else if ("image".equalsIgnoreCase(MsgTypeValue.trim()
						.toLowerCase())) {
					return setValueInToObject(ImageObj.class, doc);
				} else if ("location".equalsIgnoreCase(MsgTypeValue.trim()
						.toLowerCase())) {
					return setValueInToObject(LocationObj.class, doc);
				} else {
					return null;
				}
			}
		}
		return null;
	}

	private PushObj setValueInToObject(Class objClass, Document doc) {
		Element root = doc.getRootElement();
		PushObj result = null;
		if (TextObj.class.getName().equals(objClass.getName())) {
			TextObj testObj = new TextObj();
			testObj.setMsgType(ReturnCodeContent.ObjType.TEXT);
			testObj.setToUserName(getDocValue(root, "ToUserName"));
			testObj.setFromUserName(getDocValue(root, "FromUserName"));
			testObj.setCreateTime(new Long(getDocValue(root, "CreateTime")));
			testObj.setMsgId(new Long(getDocValue(root, "MsgId")));
			testObj.setContent(new StringBuffer(getDocValue(root, "Content")));
			result = testObj;
		} else if (VoiceObj.class.getName().equals(objClass.getName())) {
			VoiceObj testObj = new VoiceObj();
			testObj.setMsgType(ReturnCodeContent.ObjType.VOICE);
			testObj.setToUserName(getDocValue(root, "ToUserName"));
			testObj.setFromUserName(getDocValue(root, "FromUserName"));
			testObj.setCreateTime(new Long(getDocValue(root, "CreateTime")));
			testObj.setMsgId(new Long(getDocValue(root, "MsgId")));
			testObj.setFormat(getDocValue(root, "Format"));
			testObj.setMediaId(getDocValue(root, "MediaId"));
			result = testObj;
		} else if (ImageObj.class.getName().equals(objClass.getName())) {
			ImageObj testObj = new ImageObj();
			testObj.setMsgType(ReturnCodeContent.ObjType.IMAGE);
			testObj.setToUserName(getDocValue(root, "ToUserName"));
			testObj.setFromUserName(getDocValue(root, "FromUserName"));
			testObj.setCreateTime(new Long(getDocValue(root, "CreateTime")));
			testObj.setMsgId(new Long(getDocValue(root, "MsgId")));
			testObj.setPicUrl(getDocValue(root, "PicUrl"));
			testObj.setMediaId(getDocValue(root, "MediaId"));
			result = testObj;
		} else if (LocationObj.class.getName().equals(objClass.getName())) {
			LocationObj testObj = new LocationObj();
			testObj.setMsgType(ReturnCodeContent.ObjType.LOCATION);
			testObj.setToUserName(getDocValue(root, "ToUserName"));
			testObj.setFromUserName(getDocValue(root, "FromUserName"));
			testObj.setCreateTime(new Long(getDocValue(root, "CreateTime")));
			testObj.setMsgId(new Long(getDocValue(root, "MsgId")));
			testObj.setLabel(getDocValue(root, "Label"));
			testObj.setLocation_X(new Float(getDocValue(root, "Location_X")));
			testObj.setLocation_Y(new Float(getDocValue(root, "Location_Y")));
			testObj.setScale(new Integer(getDocValue(root, "Scale")));
			result = testObj;
		}
		/*
		 * Object obj=objClass.newInstance(); Field[] fields =
		 * objClass.getDeclaredFields(); for (Field field : fields) { String
		 * fieldText = root.elementText(field.getName());
		 * field.setAccessible(true); field.set(obj, fieldText); }
		 */
		return result;
	}

	private String getDocValue(Element root, String tag) {
		String result = null;
		if ("xml".equalsIgnoreCase(root.getName())) {
			Iterator Emts = root.elementIterator();
			while (Emts.hasNext()) {
				if ((Emts != null)) {
					Element tagEmt = (Element) Emts.next();
					String tagName = tagEmt.getName();
					if (tagName != null && !"".equals(tagName)
							&& tag.equalsIgnoreCase(tagName)) {
						result = tagEmt.getText();
						//System.out.println(tag + " : " + result);
						break;
					}
				}
			}

		}
		return result;
	}
}