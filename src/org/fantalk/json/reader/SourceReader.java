package org.fantalk.json.reader;

import org.junit.Test;

public class SourceReader {
	public static String getSource(String source) {
		if (source.indexOf("a href=") != -1) {
			return source.substring(source.indexOf("\">") + 2,
					source.indexOf("</a>"));
		} else {
			return source;
		}
	}

	@Test
	public void testGetSource() {
		String source = "<a href=\"http://feed.fanfouapps.com\" target=\"_blank\">FFReeder</a>";
		System.out.println(SourceReader.getSource(source));
		source = "ÍøÒ³";
		System.out.println(SourceReader.getSource(source));
		source = "<a href=\"https://chrome.google.com/extensions/detail/aicelmgbddfgmpieedjiggifabdpcnln?hl=zh-cn\" target=\"_blank\">FaWave·¢Î¢</a>";
		System.out.println(SourceReader.getSource(source));
	}
}
