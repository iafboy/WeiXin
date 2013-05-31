package com.popolongStudio.app.module;

public class ReplyEvent {
	private int type=-1;
	private Object value=null;
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
}
