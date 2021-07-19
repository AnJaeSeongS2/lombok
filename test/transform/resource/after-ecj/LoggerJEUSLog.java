import lombok.extern.jeuslog.JEUSLog;
@lombok.extern.jeuslog.JEUSLog class LoggerJEUSLog {
  private static final java.util.logging.Logger log = jeus.util.logging.JeusLogger.getLogger(LoggerJEUSLog.class);
  <clinit>() {
  }
  LoggerJEUSLog() {
    super();
  }
}
@JEUSLog class LoggerJEUSLogWithImport {
  private static final java.util.logging.Logger log = jeus.util.logging.JeusLogger.getLogger(LoggerJEUSLogWithImport.class);
  <clinit>() {
  }
  LoggerJEUSLogWithImport() {
    super();
  }
}
class LoggerJEUSLogOuter {
  static @lombok.extern.jeuslog.JEUSLog class Inner {
    private static final java.util.logging.Logger log = jeus.util.logging.JeusLogger.getLogger(Inner.class);
    <clinit>() {
    }
    Inner() {
      super();
    }
  }
  LoggerJEUSLogOuter() {
    super();
  }
}
@JEUSLog(topic = "DifferentLogger") class LoggerJEUSLogWithDifferentLoggerName {
  private static final java.util.logging.Logger log = jeus.util.logging.JeusLogger.getLogger("DifferentLogger");
  <clinit>() {
  }
  LoggerJEUSLogWithDifferentLoggerName() {
    super();
  }
}
@JEUSLog(topic = LoggerJEUSLogWithStaticField.TOPIC) class LoggerJEUSLogWithStaticField {
  private static final java.util.logging.Logger log = jeus.util.logging.JeusLogger.getLogger(LoggerJEUSLogWithStaticField.TOPIC);
  static final String TOPIC = "StaticField";
  <clinit>() {
  }
  LoggerJEUSLogWithStaticField() {
    super();
  }
}