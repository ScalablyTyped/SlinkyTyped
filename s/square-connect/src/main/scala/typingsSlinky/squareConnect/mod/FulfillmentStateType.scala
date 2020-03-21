package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.squareConnect.squareConnectStrings.PROPOSED
  - typingsSlinky.squareConnect.squareConnectStrings.RESERVED
  - typingsSlinky.squareConnect.squareConnectStrings.PREPARED
  - typingsSlinky.squareConnect.squareConnectStrings.COMPLETED
  - typingsSlinky.squareConnect.squareConnectStrings.CANCELED
  - typingsSlinky.squareConnect.squareConnectStrings.FAILED
*/
trait FulfillmentStateType extends js.Object

object FulfillmentStateType {
  @scala.inline
  def CANCELED: typingsSlinky.squareConnect.squareConnectStrings.CANCELED = this.cast("CANCELED")
  @scala.inline
  def COMPLETED: typingsSlinky.squareConnect.squareConnectStrings.COMPLETED = this.cast("COMPLETED")
  @scala.inline
  def FAILED: typingsSlinky.squareConnect.squareConnectStrings.FAILED = this.cast("FAILED")
  @scala.inline
  def PREPARED: typingsSlinky.squareConnect.squareConnectStrings.PREPARED = this.cast("PREPARED")
  @scala.inline
  def PROPOSED: typingsSlinky.squareConnect.squareConnectStrings.PROPOSED = this.cast("PROPOSED")
  @scala.inline
  def RESERVED: typingsSlinky.squareConnect.squareConnectStrings.RESERVED = this.cast("RESERVED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

