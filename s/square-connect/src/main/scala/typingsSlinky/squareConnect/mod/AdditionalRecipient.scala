package typingsSlinky.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "AdditionalRecipient")
@js.native
class AdditionalRecipient () extends StObject {
  
  /**
    * The amount of money distributed to the recipient.
    */
  var amount_money: Money = js.native
  
  /**
    * The description of the additional recipient.
    */
  var description: String = js.native
  
  /**
    * The location ID for a recipient (other than the merchant) receiving a portion of this tender.
    */
  var location_id: String = js.native
  
  /**
    * The unique ID for this `AdditionalRecipientReceivable`, assigned by the server.
    */
  var receivable_id: js.UndefOr[String] = js.native
}
