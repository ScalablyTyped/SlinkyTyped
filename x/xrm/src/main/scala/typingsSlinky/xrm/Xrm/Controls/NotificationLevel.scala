package typingsSlinky.xrm.Xrm.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constants to use with the addNotification method of form controls
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xrm.xrmStrings.ERROR
  - typingsSlinky.xrm.xrmStrings.RECOMMENDATION
*/
trait NotificationLevel extends js.Object

object NotificationLevel {
  @scala.inline
  def ERROR: typingsSlinky.xrm.xrmStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def RECOMMENDATION: typingsSlinky.xrm.xrmStrings.RECOMMENDATION = this.cast("RECOMMENDATION")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

