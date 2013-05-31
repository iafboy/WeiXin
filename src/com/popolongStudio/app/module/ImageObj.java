package com.popolongStudio.app.module;

import java.net.URI;

public class ImageObj extends PushObj {
	private String PicUrl="";
	public String getPicUrl() {
		return PicUrl;
	}
	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	private String MediaId=null;
}
