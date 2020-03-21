package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.squareConnect.squareConnectStrings.PICKUP
  - typingsSlinky.squareConnect.squareConnectStrings.SHIPMENT
*/
trait FulfillmentType extends js.Object

object FulfillmentType {
  @scala.inline
  def PICKUP: typingsSlinky.squareConnect.squareConnectStrings.PICKUP = this.cast("PICKUP")
  @scala.inline
  def SHIPMENT: typingsSlinky.squareConnect.squareConnectStrings.SHIPMENT = this.cast("SHIPMENT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

