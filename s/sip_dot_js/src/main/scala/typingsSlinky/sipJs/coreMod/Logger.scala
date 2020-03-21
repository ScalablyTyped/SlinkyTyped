package typingsSlinky.sipJs.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "Logger")
@js.native
class Logger protected ()
  extends typingsSlinky.sipJs.logMod.Logger {
  def this(logger: typingsSlinky.sipJs.loggerFactoryMod.LoggerFactory, category: String) = this()
  def this(logger: typingsSlinky.sipJs.loggerFactoryMod.LoggerFactory, category: String, label: String) = this()
}

