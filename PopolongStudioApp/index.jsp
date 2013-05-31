<%@ page language="java"
	import="java.util.*,java.io.*,com.popolongStudio.app.util.*,com.popolongStudio.app.common.*,com.popolongStudio.app.service.inf.*,com.popolongStudio.app.service.impl.*,com.popolongStudio.app.module.*"
	pageEncoding="UTF-8"%>
<%
	// 接收XML数据
BufferedReader br = new BufferedReader(new  InputStreamReader((ServletInputStream)request.getInputStream()));
String line = null;
StringBuilder sb = new StringBuilder();
while((line = br.readLine())!=null){
    sb.append(line);
}
// 取出发送用户
String xmlS = sb.toString();
System.out.println(xmlS);
MessageConvertHandler mch=new MessageConvertHandler();
mch.DEBUG=true;
PushObj obj=mch.ConvertPushMSG(xmlS);
System.out.println(obj.getClass().getName()+" : null? "+(obj==null));
/*
int fromuser_s = xmlS.indexOf("<FromUserName><![CDATA[");
int fromuser_e = xmlS.indexOf("]]></FromUserName>");
String fromuser = xmlS.substring(fromuser_s + 23, fromuser_e);
// 取出目标用户
int touser_s = xmlS.indexOf("<ToUserName><![CDATA[");
int touser_e = xmlS.indexOf("]]></ToUserName>");
String touser = xmlS.substring(touser_s + 21, touser_e);
// 取出发送内容
int content_s = xmlS.indexOf("<Content><![CDATA[");
int content_e = xmlS.indexOf("]]></Content>");
String content = xmlS.substring(content_s + 18, content_e);
*/
//---------------------------------------------------------
AutoReplyInf autoReply=new AutoReplyImpl();
/*
ReplyEvent replyEvent=autoReply.replay(obj);
System.out.println("ReplyEvent : null? "+obj==null);
System.out.println("ReplyEvent :  "+replyEvent.getType());
System.out.println("ReplyEvent :  "+replyEvent.getValue());
if(replyEvent.getType()==1){
String output="<xml>"+
		"    <ToUserName><![CDATA["+obj.getFromUserName()+"]]></ToUserName>"+
		"    <FromUserName><![CDATA["+obj.getToUserName()+"]]></FromUserName>"+
		"    <CreateTime>"+new Date().getTime()+"</CreateTime>"+
		"    <MsgType><![CDATA[text]]></MsgType>"+
		"    <Content><![CDATA["+(String)replyEvent.getValue()+"]]></Content>"+
		"    <FuncFlag>0</FuncFlag>"+
		"</xml>";
System.out.println(output);
*/
ReplyObj ro=autoReply.replay(obj);
MessageHandler mh=new MessageHandlerImpl();
System.out.println("created message handler");
String output=mh.ReplyMsg(ro);
System.out.println(output);
//---------------------------------------------------------
/*
out.print("<xml>");
out.print("    <ToUserName><![CDATA["+obj.getToUserName()+"]]></ToUserName>");
out.print("    <FromUserName><![CDATA["+obj.getToUserName()+"]]></FromUserName>");
out.print("    <CreateTime>"+new Date().getTime()+"</CreateTime>");
out.print("    <MsgType><![CDATA[text]]></MsgType>");
out.print("    <Content><![CDATA["+(String)replyEvent.getValue()+"]]></Content>");
out.print("    <FuncFlag>0</FuncFlag>");
out.print("</xml>");
*/
out.print(output);


%>
