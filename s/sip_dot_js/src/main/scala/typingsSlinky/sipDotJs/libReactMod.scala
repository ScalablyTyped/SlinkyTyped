package typingsSlinky.sipDotJs

import typingsSlinky.sipDotJs.libCoreMod.Logger
import typingsSlinky.sipDotJs.libReactSessionDescriptionHandlerObserverMod.SessionDescriptionHandlerObserver
import typingsSlinky.sipDotJs.libSessionMod.InviteClientContext
import typingsSlinky.sipDotJs.libSessionMod.InviteServerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/React", JSImport.Namespace)
@js.native
object libReactMod extends js.Object {
  @js.native
  class SessionDescriptionHandler protected ()
    extends typingsSlinky.sipDotJs.libReactSessionDescriptionHandlerMod.SessionDescriptionHandler {
    def this(logger: Logger, observer: SessionDescriptionHandlerObserver, options: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object SessionDescriptionHandler extends js.Object {
    /**
      * @param {SIP.Session} session
      * @param {Object} [options]
      */
    def defaultFactory(session: InviteClientContext, options: js.Any): typingsSlinky.sipDotJs.libReactSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
    def defaultFactory(session: InviteServerContext, options: js.Any): typingsSlinky.sipDotJs.libReactSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
  }
  
}

