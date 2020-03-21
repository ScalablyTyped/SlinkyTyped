package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.squareConnect.squareConnectStrings.ORDER
  - typingsSlinky.squareConnect.squareConnectStrings.LINE_ITEM
  - typingsSlinky.squareConnect.squareConnectStrings.OTHER_DISCOUNT_SCOPE
*/
trait DiscountApplicationScopeType extends js.Object

object DiscountApplicationScopeType {
  @scala.inline
  def LINE_ITEM: typingsSlinky.squareConnect.squareConnectStrings.LINE_ITEM = this.cast("LINE_ITEM")
  @scala.inline
  def ORDER: typingsSlinky.squareConnect.squareConnectStrings.ORDER = this.cast("ORDER")
  @scala.inline
  def OTHER_DISCOUNT_SCOPE: typingsSlinky.squareConnect.squareConnectStrings.OTHER_DISCOUNT_SCOPE = this.cast("OTHER_DISCOUNT_SCOPE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

