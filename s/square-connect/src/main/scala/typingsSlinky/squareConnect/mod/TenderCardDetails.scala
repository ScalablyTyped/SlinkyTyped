package typingsSlinky.squareConnect.mod

import typingsSlinky.squareConnect.squareConnectStrings.AUTHORIZED
import typingsSlinky.squareConnect.squareConnectStrings.CAPTURED
import typingsSlinky.squareConnect.squareConnectStrings.CONTACTLESS
import typingsSlinky.squareConnect.squareConnectStrings.EMV
import typingsSlinky.squareConnect.squareConnectStrings.FAILED
import typingsSlinky.squareConnect.squareConnectStrings.KEYED
import typingsSlinky.squareConnect.squareConnectStrings.ON_FILE
import typingsSlinky.squareConnect.squareConnectStrings.SWIPED
import typingsSlinky.squareConnect.squareConnectStrings.VOIDED
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
    * See `TenderCardDetailsStatus` for possible values.
    * See [TenderCardDetailsStatus](#type-tendercarddetailsstatus) for possible values.
    */
  var status: js.UndefOr[AUTHORIZED | CAPTURED | VOIDED | FAILED] = js.native
}

