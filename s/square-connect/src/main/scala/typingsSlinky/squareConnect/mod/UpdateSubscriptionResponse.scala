package typingsSlinky.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "UpdateSubscriptionResponse")
@js.native
class UpdateSubscriptionResponse () extends StObject {
  
  /**
    * Information about errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The modified `Subscription` object.
    */
  var subscription: js.UndefOr[Subscription] = js.native
}
