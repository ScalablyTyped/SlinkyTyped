package typingsSlinky.sipJs

import typingsSlinky.sipJs.coreMod.Exception
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestPendingMod {
  
  @JSImport("sip.js/lib/api/exceptions/request-pending", "RequestPendingError")
  @js.native
  /** @internal */
  class RequestPendingError () extends Exception {
    def this(message: String) = this()
  }
}
