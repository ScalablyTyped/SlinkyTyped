package typingsSlinky.typeorm

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

object loggerOptionsMod {
  
  @js.native
  trait FileLoggerOptions extends StObject {
    
    /**
      * Specify custom path for log file, relative to application root
      */
    var logPath: String = js.native
  }
  object FileLoggerOptions {
    
    @scala.inline
    def apply(logPath: String): FileLoggerOptions = {
      val __obj = js.Dynamic.literal(logPath = logPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileLoggerOptions]
    }
    
    @scala.inline
    implicit class FileLoggerOptionsMutableBuilder[Self <: FileLoggerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogPath(value: String): Self = StObject.set(x, "logPath", value.asInstanceOf[js.Any])
    }
  }
  
  type LoggerOptions = Boolean | all | (js.Array[query | schema | error | warn | info | log | migration])
}
