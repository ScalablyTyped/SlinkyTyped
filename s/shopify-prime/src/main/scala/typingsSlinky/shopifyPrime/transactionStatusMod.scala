package typingsSlinky.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/enums/transaction_status", JSImport.Namespace)
@js.native
object transactionStatusMod extends js.Object {
  trait _TransactionStatus extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.pending
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.failure
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.success
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.error
    - java.lang.String
  */
  type TransactionStatus = _TransactionStatus | String
}

