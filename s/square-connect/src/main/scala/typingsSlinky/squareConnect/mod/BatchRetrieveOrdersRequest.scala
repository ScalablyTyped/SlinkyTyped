package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "BatchRetrieveOrdersRequest")
@js.native
class BatchRetrieveOrdersRequest () extends js.Object {
  
  /**
    * The IDs of the orders to retrieve. A maximum of 100 orders can be retrieved per request.
    */
  var order_ids: js.Array[String] = js.native
}
