package typingsSlinky.xrm.XrmEnum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Client States for {@link ClientContext.getClientState clientContext.getClientState()}.
  * @see {@link Xrm.ClientState}
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xrm.xrmStrings.Online
  - typingsSlinky.xrm.xrmStrings.Offline
*/
trait ClientState extends js.Object

object ClientState {
  @scala.inline
  def Offline: typingsSlinky.xrm.xrmStrings.Offline = this.cast("Offline")
  @scala.inline
  def Online: typingsSlinky.xrm.xrmStrings.Online = this.cast("Online")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

