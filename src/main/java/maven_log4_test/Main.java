package maven_log4_test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	static Logger logger = LogManager.getLogger(Main.class);

	public static void main(String[] args) {
		// RollingFileで相対パスを指定した場合、作業フォルダからの相対パスになる
		//System.out.println("作業フォルダ：" + System.getProperty("user.dir"));

		logger.trace("_trace");
		logger.debug("_debug");
		logger.info("_info");
		logger.warn("_warn");
		logger.error("_error");
		logger.fatal("_fatal");
	}

}
