package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "RetrieveMerchantResponse")
@js.native
class RetrieveMerchantResponse () extends js.Object {
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  /**
    * The requested `Merchant` object.
    */
  var merchant: js.UndefOr[Merchant] = js.native
}

