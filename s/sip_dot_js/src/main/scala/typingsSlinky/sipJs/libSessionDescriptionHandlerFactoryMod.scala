package typingsSlinky.sipJs

import typingsSlinky.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandler
import typingsSlinky.sipJs.libSessionMod.InviteClientContext
import typingsSlinky.sipJs.libSessionMod.InviteServerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/session-description-handler-factory", JSImport.Namespace)
@js.native
object libSessionDescriptionHandlerFactoryMod extends js.Object {
  type SessionDescriptionHandlerFactory = js.Function2[
    /* session */ InviteClientContext | InviteServerContext, 
    /* options */ js.UndefOr[SessionDescriptionHandlerFactoryOptions], 
    SessionDescriptionHandler
  ]
  type SessionDescriptionHandlerFactoryOptions = js.Object
}

