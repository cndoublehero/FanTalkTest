package org.fantalk.json;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

import java.util.List;

import org.fantalk.json.reader.JsonReader;
import org.junit.Test;

import project.fantalk.api.fanfou.Message;
import project.fantalk.api.fanfou.Parser;

public class DirectMessagesTest {

	@Test
	public void getFriends() {
		String data = JsonReader.getJsonStringFromFile("directmessages.json");
		assertNotNull(data);
		List<Message> messages = Parser.parseMessages(data);
		assertNotNull(messages);
		assertTrue(!messages.isEmpty());
	}

}
