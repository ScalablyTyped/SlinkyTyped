package typingsSlinky.sipJs

import org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit
import typingsSlinky.sipJs.coreMod.Logger
import typingsSlinky.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typingsSlinky.sipJs.libSessionMod.InviteClientContext
import typingsSlinky.sipJs.libSessionMod.InviteServerContext
import typingsSlinky.sipJs.sessionMod.Session
import typingsSlinky.sipJs.webSessionDescriptionHandlerObserverMod.SessionDescriptionHandlerObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Web", JSImport.Namespace)
@js.native
object libWebMod extends js.Object {
  @js.native
  class SessionDescriptionHandler protected ()
    extends typingsSlinky.sipJs.libWebSessionDescriptionHandlerMod.SessionDescriptionHandler {
    def this(logger: Logger, observer: SessionDescriptionHandlerObserver, options: js.Any) = this()
  }
  
  @js.native
  class Simple protected ()
    extends typingsSlinky.sipJs.simpleMod.Simple {
    def this(options: js.Any) = this()
  }
  
  @js.native
  class Transport protected ()
    extends typingsSlinky.sipJs.libWebTransportMod.Transport {
    def this(logger: Logger) = this()
    def this(logger: Logger, options: js.Any) = this()
  }
  
  @js.native
  object Modifiers extends js.Object {
    def addMidLines(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
    def cleanJitsiSdpImageattr(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
    def stripG722(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
    def stripRtpPayload(payload: String): SessionDescriptionHandlerModifier = js.native
    def stripTcpCandidates(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
    def stripTelephoneEvent(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
    def stripVideo(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  }
  
  /* static members */
  @js.native
  object SessionDescriptionHandler extends js.Object {
    /**
      * @param {SIP.Session} session
      * @param {Object} [options]
      */
    def defaultFactory(session: InviteClientContext, options: js.Any): typingsSlinky.sipJs.libWebSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
    def defaultFactory(session: InviteServerContext, options: js.Any): typingsSlinky.sipJs.libWebSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
    def defaultFactory(session: Session, options: js.Any): typingsSlinky.sipJs.libWebSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
  }
  
  /* static members */
  @js.native
  object Simple extends js.Object {
    val C: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SimpleStatus */ js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Transport extends js.Object {
    val C: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TransportStatus */ js.Any = js.native
  }
  
}

