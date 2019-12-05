package typingsSlinky.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.squareDashConnect.squareDashConnectStrings.PROPOSED
  - typings.squareDashConnect.squareDashConnectStrings.RESERVED
  - typings.squareDashConnect.squareDashConnectStrings.PREPARED
  - typings.squareDashConnect.squareDashConnectStrings.COMPLETED
  - typings.squareDashConnect.squareDashConnectStrings.CANCELED
  - typings.squareDashConnect.squareDashConnectStrings.FAILED
*/
trait FulfillmentStateType extends js.Object

object FulfillmentStateType {
  @scala.inline
  def CANCELED: typingsSlinky.squareDashConnect.squareDashConnectStrings.CANCELED = this.cast("CANCELED")
  @scala.inline
  def COMPLETED: typingsSlinky.squareDashConnect.squareDashConnectStrings.COMPLETED = this.cast("COMPLETED")
  @scala.inline
  def FAILED: typingsSlinky.squareDashConnect.squareDashConnectStrings.FAILED = this.cast("FAILED")
  @scala.inline
  def PREPARED: typingsSlinky.squareDashConnect.squareDashConnectStrings.PREPARED = this.cast("PREPARED")
  @scala.inline
  def PROPOSED: typingsSlinky.squareDashConnect.squareDashConnectStrings.PROPOSED = this.cast("PROPOSED")
  @scala.inline
  def RESERVED: typingsSlinky.squareDashConnect.squareDashConnectStrings.RESERVED = this.cast("RESERVED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

