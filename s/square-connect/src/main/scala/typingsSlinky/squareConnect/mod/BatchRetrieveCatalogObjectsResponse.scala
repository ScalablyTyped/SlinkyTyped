package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "BatchRetrieveCatalogObjectsResponse")
@js.native
class BatchRetrieveCatalogObjectsResponse () extends js.Object {
  
  /**
    * The set of `Error`s encountered.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * A list of `CatalogObject`s returned.
    */
  var objects: js.UndefOr[js.Array[CatalogObject]] = js.native
  
  /**
    * A list of `CatalogObject`s referenced by the object in the `objects` field.
    */
  var related_objects: js.UndefOr[js.Array[CatalogObject]] = js.native
}
