package typingsSlinky.sipJs

import typingsSlinky.sipJs.coreMod.Logger
import typingsSlinky.sipJs.transportOptionsMod.TransportOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/platform/web/transport", JSImport.Namespace)
@js.native
object webTransportMod extends js.Object {
  
  @js.native
  class Transport protected ()
    extends typingsSlinky.sipJs.transportTransportMod.Transport {
    def this(logger: Logger) = this()
    def this(logger: Logger, options: TransportOptions) = this()
  }
  /* static members */
  @js.native
  object Transport extends js.Object {
    
    var defaultOptions: js.Any = js.native
  }
}
