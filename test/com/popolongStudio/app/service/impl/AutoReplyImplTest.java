package com.popolongStudio.app.service.impl;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.popolongStudio.app.module.PushObj;
import com.popolongStudio.app.module.ReplyEvent;
import com.popolongStudio.app.util.MessageConvertHandler;

public class AutoReplyImplTest {
	private AutoReplyImpl obj=null;
	private String test1 = "<xml><ToUserName><![CDATA[gh_405f00a78a44]]></ToUserName><FromUserName><![CDATA[oyhz6jiQjqnzC18ljVpQajbnlhq4]]></FromUserName><CreateTime>1369880871</CreateTime><MsgType><![CDATA[text]]></MsgType><Content><![CDATA[)/3&3)&*5&]]></Content><MsgId>5883593540360994972</MsgId></xml>";
	private String test2 = "<xml><ToUserName><![CDATA[gh_405f00a78a44]]></ToUserName><FromUserName><![CDATA[oyhz6jiQjqnzC18ljVpQajbnlhq4]]></FromUserName><CreateTime>1369798995</CreateTime><MsgType><![CDATA[image]]></MsgType><PicUrl><![CDATA[http://mmsns.qpic.cn/mmsns/nTdYRoOIKz8bmJqEvVPaPnTQ4TVPM7vHvNTm6BvlIYiaL9yu43nJeww/0]]></PicUrl><MsgId>5883241885618667652</MsgId><MediaId><![CDATA[RlM8XD7VVRpPNvHE3d03C7aAVedGdVz3dN_totpVMJiMlAQL3Iz2V7ff0n6vrXId]]></MediaId></xml>";
	private String test3 = "<xml><ToUserName><![CDATA[gh_405f00a78a44]]></ToUserName><FromUserName><![CDATA[oyhz6jiQjqnzC18ljVpQajbnlhq4]]></FromUserName><CreateTime>1369882849</CreateTime><MsgType><![CDATA[location]]></MsgType><Location_X>39.977161</Location_X><Location_Y>116.479439</Location_Y><Scale>20</Scale><Label><![CDATA[]]></Label><MsgId>5883602035806306464</MsgId></xml>";
	private String test4 = "<xml><ToUserName><![CDATA[gh_405f00a78a44]]></ToUserName><FromUserName><![CDATA[oyhz6jiQjqnzC18ljVpQajbnlhq4]]></FromUserName><CreateTime>1369798915</CreateTime><MsgType><![CDATA[voice]]></MsgType><MediaId><![CDATA[IwA9spjYVuz92n_GPitMNnwimhjQ5Ktg3IgoQWbXXqh_iXsEajN_GJA4aFdmmy-x]]></MediaId><Format><![CDATA[amr]]></Format><MsgId>5883241542021283971</MsgId><Recognition><![CDATA[]]></Recognition></xml>";
	MessageConvertHandler mch = null;
	@Before
	public void setUp() throws Exception {
		obj=new AutoReplyImpl();
		mch=new MessageConvertHandler();
		mch.DEBUG=true;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReplay1() {
		PushObj input=mch.ConvertPushMSG(test1);
		//PushObj re=obj.replay(input);
		//.assertNotNull(re);
		//System.out.println((String)re.getToUserName());
	}
	@Test
	public void testReplay2() {
		PushObj input=mch.ConvertPushMSG(test2);
		//PushObj re=obj.replay(input);
		//Assert.assertNotNull(re);
		//System.out.println((String)re.getToUserName());
	}
	@Test
	public void testReplay3() {
		PushObj input=mch.ConvertPushMSG(test3);
		//PushObj re=obj.replay(input);
		//Assert.assertNotNull(re);
		//System.out.println((String)re.getToUserName());
	}
	@Test
	public void testReplay4() {
		PushObj input=mch.ConvertPushMSG(test4);
		//PushObj re=obj.replay(input);
		//Assert.assertNotNull(re);
		//System.out.println((String)re.getToUserName());
	}
}
