package typingsSlinky.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "LoyaltyEvent")
@js.native
class LoyaltyEvent () extends StObject {
  
  /**
    * Provides metadata when the event `type` is `ACCUMULATE_POINTS`.
    */
  var accumulate_points: js.UndefOr[LoyaltyEventAccumulatePoints] = js.native
  
  /**
    * Provides metadata when the event `type` is `ADJUST_POINTS`.
    */
  var adjust_points: js.UndefOr[LoyaltyEventAdjustPoints] = js.native
  
  /**
    * Provides metadata when the event `type` is `CREATE_REWARD`.
    */
  var create_reward: js.UndefOr[LoyaltyEventCreateReward] = js.native
  
  /**
    * The timestamp when the event was created, in RFC 3339 format.
    */
  var created_at: String = js.native
  
  /**
    * Provides metadata when the event `type` is `DELETE_REWARD`.
    */
  var delete_reward: js.UndefOr[LoyaltyEventDeleteReward] = js.native
  
  /**
    * Provides metadata when the event `type` is `EXPIRE_POINTS`.
    */
  var expire_points: js.UndefOr[LoyaltyEventExpirePoints] = js.native
  
  /**
    * The Square-assigned ID of the loyalty event.
    */
  var id: String = js.native
  
  /**
    * The ID of the `location` where the event occurred.
    */
  var location_id: js.UndefOr[String] = js.native
  
  /**
    * The ID of the `loyalty account` in which the event occurred.
    */
  var loyalty_account_id: String = js.native
  
  /**
    * Provides metadata when the event `type` is `OTHER`.
    */
  var other_event: js.UndefOr[LoyaltyEventOther] = js.native
  
  /**
    * Provides metadata when the event `type` is `REDEEM_REWARD`.
    */
  var redeem_reward: js.UndefOr[LoyaltyEventRedeemReward] = js.native
  
  /**
    * Defines whether the event was generated by the Square Point of Sale.
    * See [LoyaltyEventSource](#type-loyaltyeventsource) for possible values.
    */
  var source: String = js.native
  
  /**
    * The type of the loyalty event. See [LoyaltyEventType](#type-loyaltyeventtype) for possible values.
    */
  var `type`: String = js.native
}
