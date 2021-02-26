package typingsSlinky.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchOrdersResponse")
@js.native
class SearchOrdersResponse () extends StObject {
  
  /**
    * The pagination cursor to be used in a subsequent request. If unset, this is the final response.
    * See [Pagination](https://developer.squareup.com/docs/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * `Errors` encountered during the search.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * List of `OrderEntries` that fit the query conditions. Populated only if `return_entries` was set to `true` in the request.
    */
  var order_entries: js.UndefOr[js.Array[OrderEntry]] = js.native
  
  /**
    * List of `Order` objects that match query conditions. Populated only if `return_entries` in the request is set to `false`.
    */
  var orders: js.UndefOr[js.Array[Order]] = js.native
}
