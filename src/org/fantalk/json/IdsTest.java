package org.fantalk.json;

import static junit.framework.Assert.assertNotNull;

import java.util.List;

import org.fantalk.json.reader.JsonReader;
import org.junit.Test;

import project.fantalk.api.fanfou.Parser;

public class IdsTest {
	@Test
	public void getFriends() {
		String data = JsonReader.getJsonStringFromFile("ids.json");
		assertNotNull(data);
		List<String> ids = Parser.parseFriends(data);
		assertNotNull(ids);
		assertNotNull(!ids.isEmpty());
	}
}
