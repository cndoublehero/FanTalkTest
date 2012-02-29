package org.fantalk.json;

import static junit.framework.Assert.assertNotNull;
import org.fantalk.json.reader.JsonReader;
import org.junit.Test;

import project.fantalk.api.fanfou.domain.User;

public class ShowTest {
	@Test
	public void getFriends() {
		String data = JsonReader.getJsonStringFromFile("show.json");
		assertNotNull(data);
		User user = User.parse(data);
		assertNotNull(user);
		assertNotNull(user.getId());
	}
}
