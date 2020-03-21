package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "UpsertCatalogObjectResponse")
@js.native
class UpsertCatalogObjectResponse () extends js.Object {
  /**
    * The created [CatalogObject](#type-catalogobject).
    */
  var catalog_object: js.UndefOr[CatalogObject] = js.native
  /**
    * The set of [Error](#type-error)s encountered.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  /**
    * The mapping between client and server IDs for this Upsert.
    */
  var id_mappings: js.UndefOr[js.Array[CatalogIdMapping]] = js.native
}

