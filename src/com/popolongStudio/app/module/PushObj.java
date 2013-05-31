package com.popolongStudio.app.module;

import com.popolongStudio.app.common.ReturnCodeContent;
import com.popolongStudio.app.common.ReturnCodeContent.ObjType;

public abstract class PushObj {
	private String ToUserName=null;
	private String FromUserName=null;
	private Long CreateTime=null;
	private ReturnCodeContent.ObjType MsgType=null;
	private Long MsgId=null;
	public String getToUserName() {
		return ToUserName;
	}
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}
	public String getFromUserName() {
		return FromUserName;
	}
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}
	public ObjType getMsgType() {
		return MsgType;
	}
	public void setMsgType(ObjType msgType) {
		MsgType = msgType;
	}
	public Long getMsgId() {
		return MsgId;
	}
	public void setMsgId(Long msgId) {
		MsgId = msgId;
	}
	public Long getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(Long createTime) {
		CreateTime = createTime;
	}
}
