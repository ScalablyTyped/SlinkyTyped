package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "GetTerminalCheckoutResponse")
@js.native
class GetTerminalCheckoutResponse () extends js.Object {
  
  /**
    * The requested `TerminalCheckout`
    */
  var checkout: js.UndefOr[TerminalCheckout] = js.native
  
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}
