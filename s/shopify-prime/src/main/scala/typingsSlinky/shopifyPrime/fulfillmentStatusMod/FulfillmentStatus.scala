package typingsSlinky.shopifyPrime.fulfillmentStatusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.shopifyPrime.shopifyPrimeStrings.shipped
  - typingsSlinky.shopifyPrime.shopifyPrimeStrings.partial
  - typingsSlinky.shopifyPrime.shopifyPrimeStrings.unshipped
  - typingsSlinky.shopifyPrime.shopifyPrimeStrings.any
  - java.lang.String
*/
trait FulfillmentStatus extends js.Object

object FulfillmentStatus {
  @scala.inline
  def shipped: typingsSlinky.shopifyPrime.shopifyPrimeStrings.shipped = "shipped".asInstanceOf[typingsSlinky.shopifyPrime.shopifyPrimeStrings.shipped]
  @scala.inline
  def partial: typingsSlinky.shopifyPrime.shopifyPrimeStrings.partial = "partial".asInstanceOf[typingsSlinky.shopifyPrime.shopifyPrimeStrings.partial]
  @scala.inline
  def unshipped: typingsSlinky.shopifyPrime.shopifyPrimeStrings.unshipped = "unshipped".asInstanceOf[typingsSlinky.shopifyPrime.shopifyPrimeStrings.unshipped]
  @scala.inline
  def any: typingsSlinky.shopifyPrime.shopifyPrimeStrings.any = "any".asInstanceOf[typingsSlinky.shopifyPrime.shopifyPrimeStrings.any]
  @scala.inline
  implicit def apply(value: String): FulfillmentStatus = value.asInstanceOf[FulfillmentStatus]
}

