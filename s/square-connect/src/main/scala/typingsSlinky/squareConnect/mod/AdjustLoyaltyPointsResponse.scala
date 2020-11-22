package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "AdjustLoyaltyPointsResponse")
@js.native
class AdjustLoyaltyPointsResponse () extends js.Object {
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The resulting event data for adjusting points.
    */
  var event: js.UndefOr[LoyaltyEvent] = js.native
}
