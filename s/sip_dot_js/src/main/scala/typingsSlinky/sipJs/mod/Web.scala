package typingsSlinky.sipJs.mod

import org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit
import typingsSlinky.sipJs.coreMod.Logger
import typingsSlinky.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typingsSlinky.sipJs.webSessionDescriptionHandlerObserverMod.SessionDescriptionHandlerObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Web")
@js.native
object Web extends js.Object {
  @js.native
  class SessionDescriptionHandler protected ()
    extends typingsSlinky.sipJs.libWebMod.SessionDescriptionHandler {
    def this(logger: Logger, observer: SessionDescriptionHandlerObserver, options: js.Any) = this()
  }
  
  @js.native
  class Simple protected ()
    extends typingsSlinky.sipJs.libWebMod.Simple {
    def this(options: js.Any) = this()
  }
  
  @js.native
  class Transport protected ()
    extends typingsSlinky.sipJs.libWebMod.Transport {
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
    def defaultFactory(session: typingsSlinky.sipJs.libSessionMod.InviteClientContext, options: js.Any): typingsSlinky.sipJs.libWebSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
    def defaultFactory(session: typingsSlinky.sipJs.libSessionMod.InviteServerContext, options: js.Any): typingsSlinky.sipJs.libWebSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
    def defaultFactory(session: typingsSlinky.sipJs.sessionMod.Session, options: js.Any): typingsSlinky.sipJs.libWebSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
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

