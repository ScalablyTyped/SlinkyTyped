package typingsSlinky.shopifyPrime.transactionKindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.shopifyPrime.shopifyPrimeStrings.authorization
  - typingsSlinky.shopifyPrime.shopifyPrimeStrings.capture
  - typingsSlinky.shopifyPrime.shopifyPrimeStrings.sale
  - typingsSlinky.shopifyPrime.shopifyPrimeStrings.void
  - typingsSlinky.shopifyPrime.shopifyPrimeStrings.refund
  - java.lang.String
*/
trait TransactionKind extends js.Object

object TransactionKind {
  @scala.inline
  def authorization: typingsSlinky.shopifyPrime.shopifyPrimeStrings.authorization = "authorization".asInstanceOf[typingsSlinky.shopifyPrime.shopifyPrimeStrings.authorization]
  @scala.inline
  def capture: typingsSlinky.shopifyPrime.shopifyPrimeStrings.capture = "capture".asInstanceOf[typingsSlinky.shopifyPrime.shopifyPrimeStrings.capture]
  @scala.inline
  def sale: typingsSlinky.shopifyPrime.shopifyPrimeStrings.sale = "sale".asInstanceOf[typingsSlinky.shopifyPrime.shopifyPrimeStrings.sale]
  @scala.inline
  def void: typingsSlinky.shopifyPrime.shopifyPrimeStrings.void = "void".asInstanceOf[typingsSlinky.shopifyPrime.shopifyPrimeStrings.void]
  @scala.inline
  def refund: typingsSlinky.shopifyPrime.shopifyPrimeStrings.refund = "refund".asInstanceOf[typingsSlinky.shopifyPrime.shopifyPrimeStrings.refund]
  @scala.inline
  implicit def apply(value: String): TransactionKind = value.asInstanceOf[TransactionKind]
}

