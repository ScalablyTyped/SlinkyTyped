package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListCatalogResponse")
@js.native
class ListCatalogResponse () extends js.Object {
  
  /**
    * The pagination cursor to be used in a subsequent request. If unset, this is the final response.
    * See [Pagination](https://developer.squareup.com/docs/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The CatalogObjects returned.
    */
  var objects: js.UndefOr[js.Array[CatalogObject]] = js.native
}
