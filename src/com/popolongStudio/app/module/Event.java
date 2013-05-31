package com.popolongStudio.app.module;

public class Event {
	public enum EventType{
		subscritbe{
			public String toString(){
				return "subscritbe";
			}
		},
		unsubscribe{
			public String toString(){
				return "unsubscribe";
			}
		},
		click{
			public String toString(){
				return "click";
			}
		}
	}
	public EventType type;
	public EventType getType() {
		return type;
	}
	public void setType(EventType type) {
		this.type = type;
	}
	private String EventKey="";
	public String getEventKey() {
		return EventKey;
	}
	public void setEventKey(String eventKey) {
		EventKey = eventKey;
	}
}
