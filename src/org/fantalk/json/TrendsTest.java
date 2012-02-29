package org.fantalk.json;

import static junit.framework.Assert.assertNotNull;

import java.util.List;

import org.fantalk.json.reader.JsonReader;
import org.json.JSONException;
import org.junit.Test;

import project.fantalk.api.fanfou.Parser;
import project.fantalk.api.fanfou.domain.Trends;

public class TrendsTest {
	@Test
	public void getFriends() throws JSONException {
		String data = JsonReader.getJsonStringFromFile("trends.json");
		assertNotNull(data);
		List<Trends> trends = Parser.parseTrends(data);
		assertNotNull(trends);
		assertNotNull(!trends.isEmpty());
	}

}
