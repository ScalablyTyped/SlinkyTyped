package typingsSlinky.sentryBrowser

import typingsSlinky.sentryTypes.transportMod.TransportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportsMod {
  
  @JSImport("@sentry/browser/dist/transports", "BaseTransport")
  @js.native
  abstract class BaseTransport protected ()
    extends typingsSlinky.sentryBrowser.baseMod.BaseTransport {
    def this(options: TransportOptions) = this()
  }
  
  @JSImport("@sentry/browser/dist/transports", "FetchTransport")
  @js.native
  class FetchTransport protected ()
    extends typingsSlinky.sentryBrowser.fetchMod.FetchTransport {
    def this(options: TransportOptions) = this()
  }
  
  @JSImport("@sentry/browser/dist/transports", "XHRTransport")
  @js.native
  class XHRTransport protected ()
    extends typingsSlinky.sentryBrowser.xhrMod.XHRTransport {
    def this(options: TransportOptions) = this()
  }
}
