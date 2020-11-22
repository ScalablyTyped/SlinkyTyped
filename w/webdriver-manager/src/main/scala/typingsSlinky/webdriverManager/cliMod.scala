package typingsSlinky.webdriverManager

import typingsSlinky.webdriverManager.loggerMod.LogLevel
import typingsSlinky.webdriverManager.loggerMod.WriteTo
import typingsSlinky.webdriverManager.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webdriver-manager/built/lib/cli", JSImport.Namespace)
@js.native
object cliMod extends js.Object {
  
  def unparseOptions(options: Options): js.Array[String] = js.native
  
  @js.native
  class Cli ()
    extends typingsSlinky.webdriverManager.cliCliMod.Cli
  
  @js.native
  object LogLevel extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.webdriverManager.loggerMod.LogLevel with Double] = js.native
    
    /* 3 */ val DEBUG: typingsSlinky.webdriverManager.loggerMod.LogLevel.DEBUG with Double = js.native
    
    /* 0 */ val ERROR: typingsSlinky.webdriverManager.loggerMod.LogLevel.ERROR with Double = js.native
    
    /* 2 */ val INFO: typingsSlinky.webdriverManager.loggerMod.LogLevel.INFO with Double = js.native
    
    /* 1 */ val WARN: typingsSlinky.webdriverManager.loggerMod.LogLevel.WARN with Double = js.native
  }
  
  @js.native
  class Logger protected ()
    extends typingsSlinky.webdriverManager.loggerMod.Logger {
    /**
      * Creates a logger instance with an ID for the logger.
      * @constructor
      */
    def this(id: String) = this()
  }
  /* static members */
  @js.native
  object Logger extends js.Object {
    
    var fd: js.Any = js.native
    
    var firstWrite: Boolean = js.native
    
    /**
      * Get the identifier of the logger as '/<id>'
      * @param logLevel The log level of the message.
      * @param writeTo The enum for where to write the logs.
      * @return The string of the formatted id
      */
    def id_(logLevel: LogLevel, id: String, writeTo: WriteTo): String = js.native
    
    /**
      * Get the log level formatted with the first letter. For info, it is I.
      * @param logLevel The log level of the message.
      * @param writeTo The enum for where to write the logs.
      * @return The string of the formatted log level
      */
    def level_(logLevel: LogLevel, id: String, writeTo: WriteTo): String = js.native
    
    var logLevel: LogLevel = js.native
    
    /**
      * Convert the list of messages to a single string message.
      * @param msgs The list of messages.
      * @return The string of the formatted messages
      */
    def msgToFile_(msgs: js.Array[_]): String = js.native
    
    /**
      * Set up the write location. If writing to a file, get the file descriptor.
      * @param writeTo The enum for where to write the logs.
      * @param opt_logFile An optional parameter to override the log file location.
      */
    def setWrite(writeTo: WriteTo): Unit = js.native
    def setWrite(writeTo: WriteTo, opt_logFile: String): Unit = js.native
    
    var showId: Boolean = js.native
    
    var showTimestamp: Boolean = js.native
    
    /**
      * Get a timestamp formatted with [hh:mm:ss]
      * @param writeTo The enum for where to write the logs.
      * @return The string of the formatted timestamp
      */
    def timestamp_(writeTo: WriteTo): String = js.native
    
    var writeTo: WriteTo = js.native
  }
  
  @js.native
  class Option protected ()
    extends typingsSlinky.webdriverManager.optionsMod.Option {
    def this(opt: String, description: String, `type`: String) = this()
    def this(opt: String, description: String, `type`: String, defaultValue: String) = this()
    def this(opt: String, description: String, `type`: String, defaultValue: Boolean) = this()
    def this(opt: String, description: String, `type`: String, defaultValue: Double) = this()
  }
  
  @js.native
  class Program ()
    extends typingsSlinky.webdriverManager.programsMod.Program
  /* static members */
  @js.native
  object Program extends js.Object {
    
    var MIN_SPACING: Double = js.native
  }
  
  @js.native
  object WriteTo extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.webdriverManager.loggerMod.WriteTo with Double] = js.native
    
    /* 2 */ val BOTH: typingsSlinky.webdriverManager.loggerMod.WriteTo.BOTH with Double = js.native
    
    /* 0 */ val CONSOLE: typingsSlinky.webdriverManager.loggerMod.WriteTo.CONSOLE with Double = js.native
    
    /* 1 */ val FILE: typingsSlinky.webdriverManager.loggerMod.WriteTo.FILE with Double = js.native
    
    /* 3 */ val NONE: typingsSlinky.webdriverManager.loggerMod.WriteTo.NONE with Double = js.native
  }
}
