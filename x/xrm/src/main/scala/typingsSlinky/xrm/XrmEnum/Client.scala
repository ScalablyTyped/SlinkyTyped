package typingsSlinky.xrm.XrmEnum

import typingsSlinky.xrm.xrmStrings.UnifiedServiceDesk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Client Types for {@link ClientContext.getClient clientContext.getClient()}.
  * @see {@link Xrm.Client}
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xrm.xrmStrings.Web
  - typingsSlinky.xrm.xrmStrings.Outlook
  - typingsSlinky.xrm.xrmStrings.Mobile
  - typingsSlinky.xrm.xrmStrings.UnifiedServiceDesk
*/
trait Client extends js.Object

object Client {
  @scala.inline
  def Mobile: typingsSlinky.xrm.xrmStrings.Mobile = this.cast("Mobile")
  @scala.inline
  def Outlook: typingsSlinky.xrm.xrmStrings.Outlook = this.cast("Outlook")
  @scala.inline
  def USD: UnifiedServiceDesk = this.cast("UnifiedServiceDesk")
  @scala.inline
  def UnifiedServiceDesk: typingsSlinky.xrm.xrmStrings.UnifiedServiceDesk = this.cast("UnifiedServiceDesk")
  @scala.inline
  def Web: typingsSlinky.xrm.xrmStrings.Web = this.cast("Web")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

