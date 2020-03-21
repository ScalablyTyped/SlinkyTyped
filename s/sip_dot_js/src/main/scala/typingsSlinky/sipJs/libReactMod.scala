package typingsSlinky.sipJs

import typingsSlinky.sipJs.coreMod.Logger
import typingsSlinky.sipJs.libSessionMod.InviteClientContext
import typingsSlinky.sipJs.libSessionMod.InviteServerContext
import typingsSlinky.sipJs.sessionDescriptionHandlerObserverMod.SessionDescriptionHandlerObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/React", JSImport.Namespace)
@js.native
object libReactMod extends js.Object {
  @js.native
  class SessionDescriptionHandler protected ()
    extends typingsSlinky.sipJs.libReactSessionDescriptionHandlerMod.SessionDescriptionHandler {
    def this(logger: Logger, observer: SessionDescriptionHandlerObserver, options: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object SessionDescriptionHandler extends js.Object {
    /**
      * @param {SIP.Session} session
      * @param {Object} [options]
      */
    def defaultFactory(session: InviteClientContext, options: js.Any): typingsSlinky.sipJs.libReactSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
    def defaultFactory(session: InviteServerContext, options: js.Any): typingsSlinky.sipJs.libReactSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
  }
  
}

