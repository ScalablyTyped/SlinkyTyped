package typingsSlinky.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/enums/transaction_kind", JSImport.Namespace)
@js.native
object transactionKindMod extends js.Object {
  trait _TransactionKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.authorization
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.capture
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.sale
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.void
    - typingsSlinky.shopifyPrime.shopifyPrimeStrings.refund
    - java.lang.String
  */
  type TransactionKind = _TransactionKind | String
}

