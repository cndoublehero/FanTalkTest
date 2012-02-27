package org.fantalk.json;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

import java.util.List;

import org.fantalk.json.reader.JsonReader;
import org.junit.Test;

import project.fantalk.api.fanfou.Parser;
import project.fantalk.api.fanfou.Status;

public class FriendsTimelineTest {
	@Test
	public void getFriends() {
		String data = JsonReader.getJsonStringFromFile("friends_timeline.json");
		assertNotNull(data);
		List<Status> statuss = Parser.parseStatuses(data);
		assertNotNull(statuss);
		assertTrue(!statuss.isEmpty());
	}
}
