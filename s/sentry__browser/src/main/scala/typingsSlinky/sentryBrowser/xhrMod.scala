package typingsSlinky.sentryBrowser

import typingsSlinky.sentryBrowser.baseMod.BaseTransport
import typingsSlinky.sentryTypes.responseMod.Response
import typingsSlinky.sentryTypes.sessionMod.Session
import typingsSlinky.sentryTypes.transportMod.TransportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xhrMod {
  
  @JSImport("@sentry/browser/dist/transports/xhr", "XHRTransport")
  @js.native
  class XHRTransport protected () extends BaseTransport {
    def this(options: TransportOptions) = this()
    
    /**
      * @param sentryRequest Prepared SentryRequest to be delivered
      * @param originalPayload Original payload used to create SentryRequest
      */
    var _sendRequest: js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("sendSession")
    def sendSession_MXHRTransport(session: Session): js.Thenable[Response] = js.native
  }
}
