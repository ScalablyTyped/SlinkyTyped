package typingsSlinky.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Form Notification Levels for {@link Ui.setFormNotification formContext.ui.setFormNotification()}.
  * @see {@link XrmEnum.FormNotificationLevel}
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xrm.xrmStrings.ERROR
  - typingsSlinky.xrm.xrmStrings.INFO
  - typingsSlinky.xrm.xrmStrings.WARNING
*/
trait FormNotificationLevel extends js.Object

object FormNotificationLevel {
  @scala.inline
  def ERROR: typingsSlinky.xrm.xrmStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def INFO: typingsSlinky.xrm.xrmStrings.INFO = this.cast("INFO")
  @scala.inline
  def WARNING: typingsSlinky.xrm.xrmStrings.WARNING = this.cast("WARNING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

