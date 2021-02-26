package typingsSlinky.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchLoyaltyRewardsResponse")
@js.native
class SearchLoyaltyRewardsResponse () extends StObject {
  
  /**
    * The pagination cursor to be used in a subsequent request. If empty, this is the final response.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The loyalty rewards that satisfy the search criteria. These are returned in descending order by `updated_at`.
    */
  var rewards: js.UndefOr[js.Array[LoyaltyReward]] = js.native
}
