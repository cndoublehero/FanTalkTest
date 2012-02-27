package org.fantalk.json.reader;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import project.fantalk.api.Utils;

public class JsonReader {
	private final static String filePath = "src\\org\\fantalk\\json\\file\\";

	public static String getJsonStringFromFile(String fileName) {
		if (!Utils.isEmpty(fileName)) {
			File file = new File(filePath + fileName);
			if (file.exists()) {
				FileInputStream fileOutPutStream = null;
				BufferedInputStream bufferedInputStream = null;
				try {
					fileOutPutStream = new FileInputStream(file);
					bufferedInputStream = new BufferedInputStream(
							fileOutPutStream);
					byte data[] = new byte[1024];
					int bytesRead = 0;
					StringBuffer sb = new StringBuffer();
					while ((bytesRead = bufferedInputStream.read(data)) != -1) {
						sb.append(new String(data, 0, bytesRead));
					}
					return sb.toString();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if (bufferedInputStream != null) {
						try {
							bufferedInputStream.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					if (fileOutPutStream != null) {
						try {
							fileOutPutStream.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}

				}
			}
		}
		return null;
	}
}
