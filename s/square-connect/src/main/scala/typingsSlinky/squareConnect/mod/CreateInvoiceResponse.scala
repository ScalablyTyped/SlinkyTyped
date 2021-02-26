package typingsSlinky.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateInvoiceResponse")
@js.native
class CreateInvoiceResponse () extends StObject {
  
  /**
    * Information about errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The newly created invoice.
    */
  var invoice: js.UndefOr[Invoice] = js.native
}
