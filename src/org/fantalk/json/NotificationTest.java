package org.fantalk.json;

import static junit.framework.Assert.assertNotNull;
import org.fantalk.json.reader.JsonReader;
import org.json.JSONException;
import org.junit.Test;

import project.fantalk.api.fanfou.Notification;
import project.fantalk.api.fanfou.Parser;

public class NotificationTest {

	@Test
	public void getFriends() throws JSONException {
		String data = JsonReader.getJsonStringFromFile("notification.json");
		assertNotNull(data);
		Notification notification = Parser.parseNotification(data);
		assertNotNull(notification);
		assertNotNull(notification.getDirect_messages());
	}

}
