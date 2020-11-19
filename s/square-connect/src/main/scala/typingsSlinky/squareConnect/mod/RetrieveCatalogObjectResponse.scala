package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "RetrieveCatalogObjectResponse")
@js.native
class RetrieveCatalogObjectResponse () extends js.Object {
  
  /**
    * Information on any errors encountered.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The CatalogObjects returned.
    */
  var `object`: js.UndefOr[CatalogObject] = js.native
  
  /**
    * A list of CatalogObjects referenced by the object in the `object` field.
    */
  var related_objects: js.UndefOr[js.Array[CatalogObject]] = js.native
}
