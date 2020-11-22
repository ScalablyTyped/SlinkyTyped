package typingsSlinky.typeorm.mod

import typingsSlinky.typeorm.typeormStrings.all
import typingsSlinky.typeorm.typeormStrings.error
import typingsSlinky.typeorm.typeormStrings.info
import typingsSlinky.typeorm.typeormStrings.log
import typingsSlinky.typeorm.typeormStrings.migration
import typingsSlinky.typeorm.typeormStrings.query
import typingsSlinky.typeorm.typeormStrings.schema
import typingsSlinky.typeorm.typeormStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "AdvancedConsoleLogger")
@js.native
class AdvancedConsoleLogger ()
  extends typingsSlinky.typeorm.loggerAdvancedConsoleLoggerMod.AdvancedConsoleLogger {
  def this(options: js.Array[log | info | warn | query | schema | error | migration]) = this()
  def this(options: Boolean) = this()
  def this(options: all) = this()
}
