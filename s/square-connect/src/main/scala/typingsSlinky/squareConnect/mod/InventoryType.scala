package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.squareConnect.squareConnectStrings.PHYSICAL_COUNT
  - typingsSlinky.squareConnect.squareConnectStrings.ADJUSTMENT
  - typingsSlinky.squareConnect.squareConnectStrings.TRANSFER
*/
trait InventoryType extends js.Object

object InventoryType {
  @scala.inline
  def ADJUSTMENT: typingsSlinky.squareConnect.squareConnectStrings.ADJUSTMENT = this.cast("ADJUSTMENT")
  @scala.inline
  def PHYSICAL_COUNT: typingsSlinky.squareConnect.squareConnectStrings.PHYSICAL_COUNT = this.cast("PHYSICAL_COUNT")
  @scala.inline
  def TRANSFER: typingsSlinky.squareConnect.squareConnectStrings.TRANSFER = this.cast("TRANSFER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

