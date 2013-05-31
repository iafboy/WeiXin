package com.popolongStudio.app.service.inf;

import com.popolongStudio.app.module.PushObj;
import com.popolongStudio.app.module.ReplyEvent;
import com.popolongStudio.app.module.ReplyObj;

public interface AutoReplyInf {
	public ReplyObj replay(PushObj outMsg);
}
