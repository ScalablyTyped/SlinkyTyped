package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateCatalogImageResponse")
@js.native
class CreateCatalogImageResponse () extends js.Object {
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The newly created `CatalogImage` including a Square-generated URL for each image.
    */
  var image: js.UndefOr[CatalogObject] = js.native
}
