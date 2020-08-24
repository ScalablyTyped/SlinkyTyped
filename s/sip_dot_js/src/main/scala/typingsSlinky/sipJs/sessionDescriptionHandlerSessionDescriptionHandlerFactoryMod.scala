package typingsSlinky.sipJs

import typingsSlinky.sipJs.apiMod.Session
import typingsSlinky.sipJs.sessionDescriptionHandlerFactoryOptionsMod.SessionDescriptionHandlerFactoryOptions
import typingsSlinky.sipJs.sessionDescriptionHandlerSessionDescriptionHandlerMod.SessionDescriptionHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/platform/web/session-description-handler/session-description-handler-factory", JSImport.Namespace)
@js.native
object sessionDescriptionHandlerSessionDescriptionHandlerFactoryMod extends js.Object {
  @js.native
  trait SessionDescriptionHandlerFactory
    extends typingsSlinky.sipJs.sessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactory {
    /**
      * SessionDescriptionHandler factory function.
      * @remarks
      * The `options` are provided as part of the UserAgent configuration
      * and passed through on every call to SessionDescriptionHandlerFactory's constructor.
      */
    def apply(session: Session): SessionDescriptionHandler = js.native
    def apply(session: Session, options: SessionDescriptionHandlerFactoryOptions): SessionDescriptionHandler = js.native
  }
  
}

