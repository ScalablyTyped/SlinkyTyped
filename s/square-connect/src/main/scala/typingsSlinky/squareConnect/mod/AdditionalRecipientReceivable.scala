package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "AdditionalRecipientReceivable")
@js.native
class AdditionalRecipientReceivable () extends js.Object {
  
  /**
    * The amount of the receivable. This will always be non-negative.
    */
  var amount_money: Money = js.native
  
  /**
    * The time when the additional recipient receivable was created, in RFC 3339 format.
    */
  var created_at: js.UndefOr[String] = js.native
  
  /**
    * The additional recipient receivable's unique ID, issued by Square payments servers.
    */
  var id: String = js.native
  
  /**
    * Any refunds of the receivable that have been applied.
    */
  var refunds: js.UndefOr[js.Array[AdditionalRecipientReceivableRefund]] = js.native
  
  /**
    * The ID of the transaction that the additional recipient receivable was applied to.
    */
  var transaction_id: String = js.native
  
  /**
    * The ID of the location that created the receivable. This is the location ID on the associated transaction.
    */
  var transaction_location_id: String = js.native
}
