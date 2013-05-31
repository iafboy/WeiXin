package com.popolongStudio.app.module;

public class VoiceObj extends PushObj {
	private String MediaId="";
	private String Format="amr";
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	public String getFormat() {
		return Format;
	}
	public void setFormat(String format) {
		Format = format;
	}
	
}
