package typingsSlinky.sentryBrowser

import typingsSlinky.sentryTypes.transportMod.TransportOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/browser/dist/transports", JSImport.Namespace)
@js.native
object transportsMod extends js.Object {
  
  @js.native
  abstract class BaseTransport protected ()
    extends typingsSlinky.sentryBrowser.baseMod.BaseTransport {
    def this(options: TransportOptions) = this()
  }
  
  @js.native
  class FetchTransport ()
    extends typingsSlinky.sentryBrowser.fetchMod.FetchTransport
  
  @js.native
  class XHRTransport ()
    extends typingsSlinky.sentryBrowser.xhrMod.XHRTransport
}
