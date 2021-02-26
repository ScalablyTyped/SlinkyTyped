package typingsSlinky.sipJs

import org.scalajs.dom.experimental.mediastream.MediaStream
import org.scalajs.dom.experimental.mediastream.MediaStreamConstraints
import typingsSlinky.sipJs.sessionDescriptionHandlerSessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactory
import typingsSlinky.sipJs.sessionDescriptionHandlerSessionDescriptionHandlerMod.SessionDescriptionHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionDescriptionHandlerFactoryDefaultMod {
  
  @JSImport("sip.js/lib/platform/web/session-description-handler/session-description-handler-factory-default", "defaultSessionDescriptionHandlerFactory")
  @js.native
  def defaultSessionDescriptionHandlerFactory(): SessionDescriptionHandlerFactory = js.native
  @JSImport("sip.js/lib/platform/web/session-description-handler/session-description-handler-factory-default", "defaultSessionDescriptionHandlerFactory")
  @js.native
  def defaultSessionDescriptionHandlerFactory(
    mediaStreamFactory: js.Function2[
      /* constraints */ MediaStreamConstraints, 
      /* sessionDescriptionHandler */ SessionDescriptionHandler, 
      js.Promise[MediaStream]
    ]
  ): SessionDescriptionHandlerFactory = js.native
}
