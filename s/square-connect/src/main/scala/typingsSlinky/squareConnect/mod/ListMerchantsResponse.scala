package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListMerchantsResponse")
@js.native
class ListMerchantsResponse () extends js.Object {
  
  /**
    * If the  response is truncated, the cursor to use in next request to fetch next set of objects.
    */
  var cursor: js.UndefOr[Double] = js.native
  
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The requested `Merchant` entities.
    */
  var merchant: js.UndefOr[js.Array[Merchant]] = js.native
}
