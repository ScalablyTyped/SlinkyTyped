package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "DeleteCatalogObjectResponse")
@js.native
class DeleteCatalogObjectResponse () extends js.Object {
  
  /**
    * The database [timestamp](https://developer.squareup.com/docs/build-basics/working-with-dates) of this deletion
    * in RFC 3339 format, e.g., `2016-09-04T23:59:33.123Z`.
    */
  var deleted_at: js.UndefOr[String] = js.native
  
  /**
    * The IDs of all catalog objects deleted by this request. Multiple IDs may be returned when associated objects
    * are also deleted, for example a catalog item variation will be deleted (and its ID included in this field)
    * when its parent catalog item is deleted.
    */
  var deleted_object_ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Information on any errors encountered.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}
