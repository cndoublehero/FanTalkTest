package org.fantalk.json.reader;

import org.junit.Test;

import project.fantalk.api.Utils;

public class SourceReaderTest {
	@Test
	public void testGetSource() {
		String source = "<a href=\"http://feed.fanfouapps.com\" target=\"_blank\">FFReeder</a>";
		System.out.println(Utils.getSource(source));
		source = "��ҳ";
		System.out.println(Utils.getSource(source));
		source = "<a href=\"https://chrome.google.com/extensions/detail/aicelmgbddfgmpieedjiggifabdpcnln?hl=zh-cn\" target=\"_blank\">FaWave��΢</a>";
		System.out.println(Utils.getSource(source));
	}
}
