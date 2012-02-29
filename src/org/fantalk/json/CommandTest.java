package org.fantalk.json;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static junit.framework.Assert.*;
import org.junit.Test;

public class CommandTest {
	@Test
	public void command() {
		String name = "fanfou";
		String[] otherNames = { "f", "fan" };
		StringBuilder sb = new StringBuilder("^[/-](?:");// ("^[/-\@](?:")
		sb.append(name);
		for (String otherName : otherNames) {
			sb.append("|").append(otherName);
		}
		sb.append(")(\\s.*)?$");

		Pattern pattern = Pattern.compile(sb.toString());
		Matcher matcher = pattern.matcher("-fanfou");
		assertTrue(matcher.matches());
		assertEquals("-fanfou", matcher.group(0));

		matcher = pattern.matcher("-  ");
		assertFalse(matcher.matches());

		matcher = pattern.matcher("-fanfou FADSFDS DSADFAS");
		assertTrue(matcher.matches());
		System.out.println(matcher.groupCount());
		assertEquals("-fanfou FADSFDS DSADFAS", matcher.group(0));
		assertEquals("FADSFDS DSADFAS", matcher.group(1).trim());

		matcher = pattern.matcher("/fanfou FADSFDS DSADFAS");
		assertTrue(matcher.matches());
		System.out.println(matcher.groupCount());
		assertEquals("/fanfou FADSFDS DSADFAS", matcher.group(0));
		assertEquals("FADSFDS DSADFAS", matcher.group(1).trim());

		matcher = pattern.matcher("  /fanfou FADSFDS DSADFAS");
		assertFalse(matcher.matches());
	}

	@Test
	public void name() {
		String name = "/fanfou FADSFDS DSADFAS";
		name = name.substring(1);
		assertEquals("fanfou FADSFDS DSADFAS", name);
		assertTrue(name.startsWith("fanfou"));
		assertTrue(name.startsWith("fan"));
		assertFalse(name.startsWith("tencent"));
	}
}
