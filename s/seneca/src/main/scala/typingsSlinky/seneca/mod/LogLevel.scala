package typingsSlinky.seneca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// { level: 'warn+' }
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.seneca.senecaStrings.none
  - typingsSlinky.seneca.senecaStrings.debugPlussign
  - typingsSlinky.seneca.senecaStrings.infoPlussign
  - typingsSlinky.seneca.senecaStrings.warnPlussign
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debugPlussign: typingsSlinky.seneca.senecaStrings.debugPlussign = this.cast("debug+")
  @scala.inline
  def infoPlussign: typingsSlinky.seneca.senecaStrings.infoPlussign = this.cast("info+")
  @scala.inline
  def none: typingsSlinky.seneca.senecaStrings.none = this.cast("none")
  @scala.inline
  def warnPlussign: typingsSlinky.seneca.senecaStrings.warnPlussign = this.cast("warn+")
}

