package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "BatchDeleteCatalogObjectsRequest")
@js.native
class BatchDeleteCatalogObjectsRequest () extends js.Object {
  
  /**
    * The IDs of the CatalogObjects to be deleted. When an object is deleted, other objects in the graph that depend on
    * that object will be deleted as well (for example, deleting a CatalogItem will delete its CatalogItemVariation.
    */
  var object_ids: js.UndefOr[js.Array[String]] = js.native
}
