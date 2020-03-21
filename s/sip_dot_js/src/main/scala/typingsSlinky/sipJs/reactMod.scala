package typingsSlinky.sipJs

import typingsSlinky.sipJs.apiMod.Session
import typingsSlinky.sipJs.coreMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/platform/react", JSImport.Namespace)
@js.native
object reactMod extends js.Object {
  @js.native
  class SessionDescriptionHandler protected ()
    extends typingsSlinky.sipJs.reactSessionDescriptionHandlerMod.SessionDescriptionHandler {
    def this(logger: Logger, options: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object SessionDescriptionHandler extends js.Object {
    /**
      * @param {SIP.Session} session
      * @param {Object} [options]
      */
    def defaultFactory(session: Session, options: js.Any): typingsSlinky.sipJs.reactSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
  }
  
}

