package typingsSlinky.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "AdjustLoyaltyPointsRequest")
@js.native
class AdjustLoyaltyPointsRequest () extends StObject {
  
  /**
    * The points to adjust (add or subtract) and the reason for the adjustment.
    */
  var adjust_points: LoyaltyEventAdjustPoints = js.native
  
  /**
    * A unique string that identifies this `AdjustLoyaltyPoints` request.
    * Keys can be any valid string, but must be unique for every request.
    */
  var idempotency_key: String = js.native
}
