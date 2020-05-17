package typingsSlinky.shopifyPrime.transactionStatusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.shopifyPrime.shopifyPrimeStrings.pending
  - typingsSlinky.shopifyPrime.shopifyPrimeStrings.failure
  - typingsSlinky.shopifyPrime.shopifyPrimeStrings.success
  - typingsSlinky.shopifyPrime.shopifyPrimeStrings.error
  - java.lang.String
*/
trait TransactionStatus extends js.Object

object TransactionStatus {
  @scala.inline
  def pending: typingsSlinky.shopifyPrime.shopifyPrimeStrings.pending = "pending".asInstanceOf[typingsSlinky.shopifyPrime.shopifyPrimeStrings.pending]
  @scala.inline
  def failure: typingsSlinky.shopifyPrime.shopifyPrimeStrings.failure = "failure".asInstanceOf[typingsSlinky.shopifyPrime.shopifyPrimeStrings.failure]
  @scala.inline
  def success: typingsSlinky.shopifyPrime.shopifyPrimeStrings.success = "success".asInstanceOf[typingsSlinky.shopifyPrime.shopifyPrimeStrings.success]
  @scala.inline
  def error: typingsSlinky.shopifyPrime.shopifyPrimeStrings.error = "error".asInstanceOf[typingsSlinky.shopifyPrime.shopifyPrimeStrings.error]
  @scala.inline
  implicit def apply(value: String): TransactionStatus = value.asInstanceOf[TransactionStatus]
}

