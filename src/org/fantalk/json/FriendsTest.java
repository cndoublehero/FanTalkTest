package org.fantalk.json;

import java.util.List;

import org.fantalk.json.reader.JsonReader;
import org.junit.Test;
import static junit.framework.Assert.*;
import project.fantalk.api.fanfou.Parser;
import project.fantalk.api.fanfou.User;

public class FriendsTest {
	@Test
	public void getFriends() {
		String data = JsonReader.getJsonStringFromFile("friends.json");
		assertNotNull(data);
		List<User> users = Parser.parseUsers(data);
		assertNotNull(users);
		assertTrue(!users.isEmpty());
	}
}
