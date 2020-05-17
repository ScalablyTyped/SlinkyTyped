package typingsSlinky.shopifyPrime.orderStatusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.shopifyPrime.shopifyPrimeStrings.open
  - typingsSlinky.shopifyPrime.shopifyPrimeStrings.closed
  - typingsSlinky.shopifyPrime.shopifyPrimeStrings.cancelled
  - typingsSlinky.shopifyPrime.shopifyPrimeStrings.any
  - java.lang.String
*/
trait OrderStatus extends js.Object

object OrderStatus {
  @scala.inline
  def open: typingsSlinky.shopifyPrime.shopifyPrimeStrings.open = "open".asInstanceOf[typingsSlinky.shopifyPrime.shopifyPrimeStrings.open]
  @scala.inline
  def closed: typingsSlinky.shopifyPrime.shopifyPrimeStrings.closed = "closed".asInstanceOf[typingsSlinky.shopifyPrime.shopifyPrimeStrings.closed]
  @scala.inline
  def cancelled: typingsSlinky.shopifyPrime.shopifyPrimeStrings.cancelled = "cancelled".asInstanceOf[typingsSlinky.shopifyPrime.shopifyPrimeStrings.cancelled]
  @scala.inline
  def any: typingsSlinky.shopifyPrime.shopifyPrimeStrings.any = "any".asInstanceOf[typingsSlinky.shopifyPrime.shopifyPrimeStrings.any]
  @scala.inline
  implicit def apply(value: String): OrderStatus = value.asInstanceOf[OrderStatus]
}

