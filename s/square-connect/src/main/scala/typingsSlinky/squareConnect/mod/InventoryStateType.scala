package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.squareConnect.squareConnectStrings.CUSTOM
  - typingsSlinky.squareConnect.squareConnectStrings.IN_STOCK
  - typingsSlinky.squareConnect.squareConnectStrings.SOLD
  - typingsSlinky.squareConnect.squareConnectStrings.RETURNED_BY_CUSTOMER
  - typingsSlinky.squareConnect.squareConnectStrings.RESERVED_FOR_SALE
  - typingsSlinky.squareConnect.squareConnectStrings.SOLD_ONLINE
  - typingsSlinky.squareConnect.squareConnectStrings.ORDERED_FROM_VENDOR
  - typingsSlinky.squareConnect.squareConnectStrings.RECEIVED_FROM_VENDOR
  - typingsSlinky.squareConnect.squareConnectStrings.IN_TRANSIT_TO
  - typingsSlinky.squareConnect.squareConnectStrings.NONE
  - typingsSlinky.squareConnect.squareConnectStrings.WASTE
  - typingsSlinky.squareConnect.squareConnectStrings.UNLINKED_RETURN
*/
trait InventoryStateType extends js.Object

object InventoryStateType {
  @scala.inline
  def CUSTOM: typingsSlinky.squareConnect.squareConnectStrings.CUSTOM = this.cast("CUSTOM")
  @scala.inline
  def IN_STOCK: typingsSlinky.squareConnect.squareConnectStrings.IN_STOCK = this.cast("IN_STOCK")
  @scala.inline
  def IN_TRANSIT_TO: typingsSlinky.squareConnect.squareConnectStrings.IN_TRANSIT_TO = this.cast("IN_TRANSIT_TO")
  @scala.inline
  def NONE: typingsSlinky.squareConnect.squareConnectStrings.NONE = this.cast("NONE")
  @scala.inline
  def ORDERED_FROM_VENDOR: typingsSlinky.squareConnect.squareConnectStrings.ORDERED_FROM_VENDOR = this.cast("ORDERED_FROM_VENDOR")
  @scala.inline
  def RECEIVED_FROM_VENDOR: typingsSlinky.squareConnect.squareConnectStrings.RECEIVED_FROM_VENDOR = this.cast("RECEIVED_FROM_VENDOR")
  @scala.inline
  def RESERVED_FOR_SALE: typingsSlinky.squareConnect.squareConnectStrings.RESERVED_FOR_SALE = this.cast("RESERVED_FOR_SALE")
  @scala.inline
  def RETURNED_BY_CUSTOMER: typingsSlinky.squareConnect.squareConnectStrings.RETURNED_BY_CUSTOMER = this.cast("RETURNED_BY_CUSTOMER")
  @scala.inline
  def SOLD: typingsSlinky.squareConnect.squareConnectStrings.SOLD = this.cast("SOLD")
  @scala.inline
  def SOLD_ONLINE: typingsSlinky.squareConnect.squareConnectStrings.SOLD_ONLINE = this.cast("SOLD_ONLINE")
  @scala.inline
  def UNLINKED_RETURN: typingsSlinky.squareConnect.squareConnectStrings.UNLINKED_RETURN = this.cast("UNLINKED_RETURN")
  @scala.inline
  def WASTE: typingsSlinky.squareConnect.squareConnectStrings.WASTE = this.cast("WASTE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

