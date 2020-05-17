package typingsSlinky.vegaTypings.scaleMod

import typingsSlinky.vegaTypings.anon.Op
import typingsSlinky.vegaTypings.anon.OrderSortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typingsSlinky.vegaTypings.anon.OrderSortOrder
  - typingsSlinky.vegaTypings.anon.Op
*/
trait SortField extends js.Object

object SortField {
  @scala.inline
  implicit def apply(value: Boolean): SortField = value.asInstanceOf[SortField]
  @scala.inline
  implicit def apply(value: Op): SortField = value.asInstanceOf[SortField]
  @scala.inline
  implicit def apply(value: OrderSortOrder): SortField = value.asInstanceOf[SortField]
}

