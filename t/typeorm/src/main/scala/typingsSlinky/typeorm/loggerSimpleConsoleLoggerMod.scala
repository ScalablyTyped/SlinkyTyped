package typingsSlinky.typeorm

import typingsSlinky.typeorm.loggerLoggerMod.Logger
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

object loggerSimpleConsoleLoggerMod {
  
  @JSImport("typeorm/logger/SimpleConsoleLogger", "SimpleConsoleLogger")
  @js.native
  class SimpleConsoleLogger () extends Logger {
    def this(options: js.Array[log | info | warn | query | schema | error | migration]) = this()
    def this(options: Boolean) = this()
    def this(options: all) = this()
    
    var options: js.Any = js.native
    
    /**
      * Converts parameters to a string.
      * Sometimes parameters can have circular objects and therefor we are handle this case too.
      */
    /* protected */ def stringifyParams(parameters: js.Array[_]): String | js.Array[_] = js.native
  }
}
