package typingsSlinky.typeorm

import typingsSlinky.typeorm.loggerMod.Logger
import typingsSlinky.typeorm.loggerOptionsMod.FileLoggerOptions
import typingsSlinky.typeorm.typeormStrings.all
import typingsSlinky.typeorm.typeormStrings.error
import typingsSlinky.typeorm.typeormStrings.info
import typingsSlinky.typeorm.typeormStrings.log
import typingsSlinky.typeorm.typeormStrings.migration
import typingsSlinky.typeorm.typeormStrings.query
import typingsSlinky.typeorm.typeormStrings.schema
import typingsSlinky.typeorm.typeormStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileLoggerMod {
  
  @JSImport("typeorm/browser/logger/FileLogger", "FileLogger")
  @js.native
  class FileLogger () extends Logger {
    def this(options: js.Array[error | log | info | warn | query | schema | migration]) = this()
    def this(options: Boolean) = this()
    def this(options: all) = this()
    def this(options: js.UndefOr[scala.Nothing], fileLoggerOptions: FileLoggerOptions) = this()
    def this(
      options: js.Array[error | log | info | warn | query | schema | migration],
      fileLoggerOptions: FileLoggerOptions
    ) = this()
    def this(options: Boolean, fileLoggerOptions: FileLoggerOptions) = this()
    def this(options: all, fileLoggerOptions: FileLoggerOptions) = this()
    
    var fileLoggerOptions: js.Any = js.native
    
    var options: js.Any = js.native
    
    /**
      * Converts parameters to a string.
      * Sometimes parameters can have circular objects and therefor we are handle this case too.
      */
    /* protected */ def stringifyParams(parameters: js.Array[_]): String | js.Array[_] = js.native
    
    /**
      * Writes given strings into the log file.
      */
    /* protected */ def write(strings: String): Unit = js.native
    /* protected */ def write(strings: js.Array[String]): Unit = js.native
  }
}
