package typingsSlinky.squareDashConnect.squareDashConnectMod

import typingsSlinky.squareDashConnect.squareDashConnectStrings.AUTHORIZED
import typingsSlinky.squareDashConnect.squareDashConnectStrings.CAPTURED
import typingsSlinky.squareDashConnect.squareDashConnectStrings.CONTACTLESS
import typingsSlinky.squareDashConnect.squareDashConnectStrings.EMV
import typingsSlinky.squareDashConnect.squareDashConnectStrings.FAILED
import typingsSlinky.squareDashConnect.squareDashConnectStrings.KEYED
import typingsSlinky.squareDashConnect.squareDashConnectStrings.ON_FILE
import typingsSlinky.squareDashConnect.squareDashConnectStrings.SWIPED
import typingsSlinky.squareDashConnect.squareDashConnectStrings.VOIDED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "TenderCardDetails")
@js.native
class TenderCardDetails () extends js.Object {
  /**
    * The credit card's non-confidential details.
    */
  var card: js.UndefOr[Card] = js.native
  /**
    * The method used to enter the card's details for the transaction.
    * See [TenderCardDetailsEntryMethod](#type-tendercarddetailsentrymethod) for possible values.
    */
  var entry_method: js.UndefOr[SWIPED | KEYED | EMV | ON_FILE | CONTACTLESS] = js.native
  /**
    * The credit card payment's current state (such as `AUTHORIZED` or `CAPTURED`).
    * See [TenderCardDetailsStatus](#type-tendercarddetailsstatus) for possible values.
    */
  var status: js.UndefOr[AUTHORIZED | CAPTURED | VOIDED | FAILED] = js.native
}

