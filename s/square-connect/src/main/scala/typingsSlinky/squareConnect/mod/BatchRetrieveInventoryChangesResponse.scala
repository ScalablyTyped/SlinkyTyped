package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "BatchRetrieveInventoryChangesResponse")
@js.native
class BatchRetrieveInventoryChangesResponse () extends js.Object {
  
  /**
    * The current calculated inventory changes for the requested objects and locations.
    */
  var changes: js.UndefOr[js.Array[InventoryChange]] = js.native
  
  /**
    * The pagination cursor to be used in a subsequent request. If unset, this is the final response.
    * See the [Pagination](https://developer.squareup.com/docs/working-with-apis/pagination) guide for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}
