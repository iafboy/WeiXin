package com.popolongStudio.app.module;

import com.popolongStudio.app.common.ReturnCodeContent;

public abstract class ReplyObj {
	private String ToUserName=null;
	private String FromUserName=null;
	private Long CreateTime=null;
	public Long getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(Long createTime) {
		CreateTime = createTime;
	}
	private ReturnCodeContent.ObjType MsgType=null;
	private Integer FuncFlag=null;
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
	public ReturnCodeContent.ObjType getMsgType() {
		return MsgType;
	}
	public void setMsgType(ReturnCodeContent.ObjType msgType) {
		MsgType = msgType;
	}
	public Integer getFuncFlag() {
		return FuncFlag;
	}
	public void setFuncFlag(Integer funcFlag) {
		FuncFlag = funcFlag;
	}
}
