class LoggerJEUSLog {
	@java.lang.SuppressWarnings("all")
	private static final java.util.logging.Logger log = jeus.util.logging.JeusLogger.getLogger(LoggerJEUSLog.class);
}
class LoggerJEUSLogWithImport {
	@java.lang.SuppressWarnings("all")
	private static final java.util.logging.Logger log = jeus.util.logging.JeusLogger.getLogger(LoggerJEUSLogWithImport.class);
}
class LoggerJEUSLogOuter {
	static class Inner {
		@java.lang.SuppressWarnings("all")
		private static final java.util.logging.Logger log = jeus.util.logging.JeusLogger.getLogger(Inner.class);
	}
}

class LoggerJEUSLogWithDifferentLoggerName {
	@java.lang.SuppressWarnings("all")
	private static final java.util.logging.Logger log = jeus.util.logging.JeusLogger.getLogger("DifferentLogger");
}

class LoggerJEUSLogWithStaticField {
	@java.lang.SuppressWarnings("all")
	private static final java.util.logging.Logger log = jeus.util.logging.JeusLogger.getLogger(LoggerJEUSLogWithStaticField.TOPIC);
	static final String TOPIC = "StaticField";
}