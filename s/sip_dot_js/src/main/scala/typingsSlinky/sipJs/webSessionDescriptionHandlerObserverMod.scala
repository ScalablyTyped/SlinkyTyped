package typingsSlinky.sipJs

import typingsSlinky.sipJs.enumsMod.TypeStrings
import typingsSlinky.sipJs.libSessionMod.InviteClientContext
import typingsSlinky.sipJs.libSessionMod.InviteServerContext
import typingsSlinky.sipJs.sessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Web/SessionDescriptionHandlerObserver", JSImport.Namespace)
@js.native
object webSessionDescriptionHandlerObserverMod extends js.Object {
  @js.native
  class SessionDescriptionHandlerObserver protected () extends js.Object {
    def this(session: InviteClientContext, options: js.Any) = this()
    def this(session: InviteServerContext, options: js.Any) = this()
    def this(session: Session, options: js.Any) = this()
    var options: js.Any = js.native
    var session: js.Any = js.native
    var `type`: TypeStrings = js.native
    def directionChanged(): Unit = js.native
    def trackAdded(): Unit = js.native
  }
  
}

