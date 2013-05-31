package com.popolongStudio.app.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.popolongStudio.app.module.PushObj;
import com.popolongStudio.app.module.TextObj;

public class MessageConvertHandlerTest {
	private String test1 = "<xml><ToUserName><![CDATA[gh_405f00a78a44]]></ToUserName><FromUserName><![CDATA[oyhz6jiQjqnzC18ljVpQajbnlhq4]]></FromUserName><CreateTime>1369880871</CreateTime><MsgType><![CDATA[text]]></MsgType><Content><![CDATA[)/3&3)&*5&]]></Content><MsgId>5883593540360994972</MsgId></xml>";
	private String test2 = "<xml><ToUserName><![CDATA[gh_405f00a78a44]]></ToUserName><FromUserName><![CDATA[oyhz6jiQjqnzC18ljVpQajbnlhq4]]></FromUserName><CreateTime>1369798995</CreateTime><MsgType><![CDATA[image]]></MsgType><PicUrl><![CDATA[http://mmsns.qpic.cn/mmsns/nTdYRoOIKz8bmJqEvVPaPnTQ4TVPM7vHvNTm6BvlIYiaL9yu43nJeww/0]]></PicUrl><MsgId>5883241885618667652</MsgId><MediaId><![CDATA[RlM8XD7VVRpPNvHE3d03C7aAVedGdVz3dN_totpVMJiMlAQL3Iz2V7ff0n6vrXId]]></MediaId></xml>";
	private String test3 = "<xml><ToUserName><![CDATA[gh_405f00a78a44]]></ToUserName><FromUserName><![CDATA[oyhz6jiQjqnzC18ljVpQajbnlhq4]]></FromUserName><CreateTime>1369882849</CreateTime><MsgType><![CDATA[location]]></MsgType><Location_X>39.977161</Location_X><Location_Y>116.479439</Location_Y><Scale>20</Scale><Label><![CDATA[]]></Label><MsgId>5883602035806306464</MsgId></xml>";
	private String test4 = "<xml><ToUserName><![CDATA[gh_405f00a78a44]]></ToUserName><FromUserName><![CDATA[oyhz6jiQjqnzC18ljVpQajbnlhq4]]></FromUserName><CreateTime>1369798915</CreateTime><MsgType><![CDATA[voice]]></MsgType><MediaId><![CDATA[IwA9spjYVuz92n_GPitMNnwimhjQ5Ktg3IgoQWbXXqh_iXsEajN_GJA4aFdmmy-x]]></MediaId><Format><![CDATA[amr]]></Format><MsgId>5883241542021283971</MsgId><Recognition><![CDATA[]]></Recognition></xml>";
	private MessageConvertHandler obj = null;

	@Before
	public void setUp() throws Exception {
		obj = new MessageConvertHandler();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConvertPushMSG1() {
		PushObj t1 = obj.ConvertPushMSG(test1);
		assertNotNull(t1);
		System.out.println(t1.getClass().getName() + " :null? " + (null == t1));
	}
	@Test
	public void testConvertPushMSG2() {
		PushObj t2 = obj.ConvertPushMSG(test2);
		assertNotNull(t2);
		System.out.println(t2.getClass().getName() + " :null? " + (null == t2));
	}
	@Test
	public void testConvertPushMSG3() {
		PushObj t3 = obj.ConvertPushMSG(test3);
		assertNotNull(t3);
		System.out.println(t3.getClass().getName() + " :null? " + (null == t3));
	}
}
