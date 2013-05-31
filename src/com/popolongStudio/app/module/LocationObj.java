package com.popolongStudio.app.module;

public class LocationObj extends PushObj{
	private Float Location_X=null;
	private Float Location_Y=null;
	private Integer Scale=null;
	private String Label="";
	public Float getLocation_X() {
		return Location_X;
	}
	public void setLocation_X(Float location_X) {
		Location_X = location_X;
	}
	public Float getLocation_Y() {
		return Location_Y;
	}
	public void setLocation_Y(Float location_Y) {
		Location_Y = location_Y;
	}
	public Integer getScale() {
		return Scale;
	}
	public void setScale(Integer scale) {
		Scale = scale;
	}
	public String getLabel() {
		return Label;
	}
	public void setLabel(String label) {
		Label = label;
	}
}
