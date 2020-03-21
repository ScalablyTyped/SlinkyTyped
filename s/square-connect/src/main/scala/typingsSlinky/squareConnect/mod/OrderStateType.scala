package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.squareConnect.squareConnectStrings.OPEN
  - typingsSlinky.squareConnect.squareConnectStrings.COMPLETED
  - typingsSlinky.squareConnect.squareConnectStrings.CANCELED
*/
trait OrderStateType extends js.Object

object OrderStateType {
  @scala.inline
  def CANCELED: typingsSlinky.squareConnect.squareConnectStrings.CANCELED = this.cast("CANCELED")
  @scala.inline
  def COMPLETED: typingsSlinky.squareConnect.squareConnectStrings.COMPLETED = this.cast("COMPLETED")
  @scala.inline
  def OPEN: typingsSlinky.squareConnect.squareConnectStrings.OPEN = this.cast("OPEN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

