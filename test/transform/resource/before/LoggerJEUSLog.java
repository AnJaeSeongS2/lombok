import lombok.extern.jeuslog.JEUSLog;

@lombok.extern.jeuslog.JEUSLog
class LoggerJEUSLog {
}

@JEUSLog
class LoggerJEUSLogWithImport {
}

class LoggerJEUSLogOuter {
	@lombok.extern.jeuslog.JEUSLog
	static class Inner {
		
	}
}

@JEUSLog(topic="DifferentLogger")
class LoggerJEUSLogWithDifferentLoggerName {
}

@JEUSLog(topic=LoggerJEUSLogWithStaticField.TOPIC)
class LoggerJEUSLogWithStaticField {
	static final String TOPIC = "StaticField";
}