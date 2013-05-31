package com.popolongStudio.app.module;

public class ReplyMusic extends ReplyObj {
	private String Titile="";
	private String Description="";
	private String MusicUrl="";
	private String HQMusicUrl="";
	public String getTitile() {
		return Titile;
	}
	public void setTitile(String titile) {
		Titile = titile;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getMusicUrl() {
		return MusicUrl;
	}
	public void setMusicUrl(String musicUrl) {
		MusicUrl = musicUrl;
	}
	public String getHQMusicUrl() {
		return HQMusicUrl;
	}
	public void setHQMusicUrl(String hQMusicUrl) {
		HQMusicUrl = hQMusicUrl;
	}
}
