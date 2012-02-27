package org.fantalk.json.reader;

import org.junit.Test;
import static junit.framework.Assert.*;

public class JsonReaderTest {
	@Test
	public void testGetJsonStringFromFile() {
		String str = null;
		assertNull(JsonReader.getJsonStringFromFile(str));
		str = "";
		assertNull(JsonReader.getJsonStringFromFile(str));
		str = "User1.json";
		assertNull(JsonReader.getJsonStringFromFile(str));
		str = "User.json";
		assertNotNull(JsonReader.getJsonStringFromFile(str));
	}
}
