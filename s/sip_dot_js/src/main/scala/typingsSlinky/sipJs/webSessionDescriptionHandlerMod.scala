package typingsSlinky.sipJs

import org.scalajs.dom.experimental.mediastream.MediaStream
import org.scalajs.dom.experimental.mediastream.MediaStreamConstraints
import org.scalajs.dom.experimental.webrtc.RTCConfiguration
import typingsSlinky.sipJs.coreMod.Logger
import typingsSlinky.sipJs.mediaStreamFactoryMod.MediaStreamFactory
import typingsSlinky.sipJs.sessionDescriptionHandlerConfigurationMod.SessionDescriptionHandlerConfiguration
import typingsSlinky.sipJs.sessionDescriptionHandlerSessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/platform/web/session-description-handler", JSImport.Namespace)
@js.native
object webSessionDescriptionHandlerMod extends js.Object {
  
  def defaultMediaStreamFactory(): MediaStreamFactory = js.native
  
  def defaultPeerConnectionConfiguration(): RTCConfiguration = js.native
  
  def defaultSessionDescriptionHandlerFactory(): SessionDescriptionHandlerFactory = js.native
  def defaultSessionDescriptionHandlerFactory(
    mediaStreamFactory: js.Function2[
      /* constraints */ MediaStreamConstraints, 
      /* sessionDescriptionHandler */ typingsSlinky.sipJs.sessionDescriptionHandlerSessionDescriptionHandlerMod.SessionDescriptionHandler, 
      js.Promise[MediaStream]
    ]
  ): SessionDescriptionHandlerFactory = js.native
  
  @js.native
  class SessionDescriptionHandler protected ()
    extends typingsSlinky.sipJs.sessionDescriptionHandlerSessionDescriptionHandlerMod.SessionDescriptionHandler {
    /**
      * Constructor
      * @param logger - A logger
      * @param mediaStreamFactory - A factory to provide a MediaStream
      * @param options - Options passed from the SessionDescriptionHandleFactory
      */
    def this(logger: Logger, mediaStreamFactory: MediaStreamFactory) = this()
    def this(
      logger: Logger,
      mediaStreamFactory: MediaStreamFactory,
      sessionDescriptionHandlerConfiguration: SessionDescriptionHandlerConfiguration
    ) = this()
  }
  /* static members */
  @js.native
  object SessionDescriptionHandler extends js.Object {
    
    var dispatchAddTrackEvent: js.Any = js.native
    
    var dispatchRemoveTrackEvent: js.Any = js.native
  }
}
