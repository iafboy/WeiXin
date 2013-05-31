package com.popolongStudio.app.common;

public final class ReturnCodeContent {
	public static final int GetCertLimit = 200;
	public static final int CreateMenuLimit = 100;
	public static final int QueryMenuLimit = 1000;
	public static final int DeleteMenuLimit = 100;
	public static final int AticleCntLimit=10;

	public static enum ObjType {
		TEXT {
			public String toString() {
				return "text";
			}
		},
		VOICE{
			public String toString() {
				return "voice";
			}
		}, 
		LOCATION{
			public String toString() {
				return "location";
			}
		}, 
		IMAGE{
			public String toString() {
				return "image";
			}
		},
		MUSIC{
			public String toString() {
				return "music";
			}
		},
		NEWS{
			public String toString() {
				return "news";
			}
		},
		LINK{
			public String toString() {
				return "link";
			}
		},
		EVENT
	}

	public static final String RequestAddress = "https://api.weixin.qq.com/cgi-bin/";
	public static final String ResourceAddress="http://1.popolongstudioapp.sinaapp.com/resource";
	// 系统繁忙
	public static final int SystemBusy = -1;
	// 请求成功
	public static final int Success = 0;
	// 40001 验证失败
	public static final int VarifFail = 40001;
	// 40002 不合法的凭证类型
	public static final int ErrorCert = 40002;
	// 40003 不合法的OpenID
	public static final int ErrorOpenID = 40003;
	// 40004 不合法的媒体文件类型
	public static final int ErrorMediaFile = 40004;
	// 40005 不合法的文件类型
	public static final int ErrorFileType = 40005;
	// 40006 不合法的文件大小
	public static final int ErrorFileSize = 40006;
	// 40007 不合法的媒体文件id
	public static final int ErrorMediaFileId = 40007;
	// 40008 不合法的消息类型
	// 40009 不合法的图片文件大小
	// 40010 不合法的语音文件大小
	// 40011 不合法的视频文件大小
	// 40012 不合法的缩略图文件大小
	// 40013 不合法的APPID
	// 40014 不合法的access_token
	// 40014 不合法的access_token
	// 40015 不合法的菜单类型
	// 40016 不合法的按钮个数
	// 40017 不合法的按钮个数
	// 40018 不合法的按钮名字长度
	// 40019 不合法的按钮KEY长度
	// 40020 不合法的按钮URL长度
	// 40021 不合法的菜单版本号
	// 40022 不合法的子菜单级数
	// 40023 不合法的子菜单按钮个数
	// 40024 不合法的子菜单按钮类型
	// 40025 不合法的子菜单按钮名字长度
	// 40026 不合法的子菜单按钮KEY长度
	// 40027 不合法的子菜单按钮URL长度
	// 40028 不合法的自定义菜单使用用户
	// 41001 缺少access_token参数
	// 41002 缺少appid参数
	// 41003 缺少refresh_token参数
	// 41004 缺少secret参数
	// 41005 缺少多媒体文件数据
	// 41006 缺少media_id参数
	// 41007 缺少子菜单数据
	// 42001 access_token超时
	// 43001 需要GET请求
	// 43002 需要POST请求
	// 43003 需要HTTPS请求
	// 44001 多媒体文件为空
	// 44002 POST的数据包为空
	// 44003 图文消息内容为空
	// 45001 多媒体文件大小超过限制
	// 45002 消息内容超过限制
	// 45003 标题字段超过限制
	// 45004 描述字段超过限制
	// 45005 链接字段超过限制
	// 45006 图片链接字段超过限制
	// 45007 语音播放时间超过限制
	// 45008 图文消息超过限制
	// 45009 接口调用超过限制
	// 45010 创建菜单个数超过限制
	public static final int reachMenuCreationLimit = 45010;
	// 46001 不存在媒体数据
	public static final int unExistedMediaData = 46001;
	// 46002 不存在的菜单版本
	public static final int unExistedMenuVersion = 46002;
	// 46003 不存在的菜单数据
	public static final int unExistedMenuData = 46003;
	// 47001 解析JSON/XML内容错误
	public static final int parseJSONXMLError = 47001;

	public static final String defaultMsg = "同学，你想看哪方面信息？\n回复文本信息，请回复1\n回复图片，请回复2\n回复音乐链接，请回复3";
	public static final String Msg = "别闹了，咱们说正事儿。";
	public static final String TravelMsg = "回复文本信息";
	public static final String TrainMsg = "培训，请访问";
	public static final String OuttingMsg = "夏令营，请访问";

	public static final String Access_Token = "popolongStudioApp";
	public static final String hintMsg="解析有问题";
	
}
