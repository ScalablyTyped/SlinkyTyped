package typingsSlinky.sipJs

import org.scalajs.dom.experimental.mediastream.MediaStream
import org.scalajs.dom.experimental.mediastream.MediaStreamConstraints
import org.scalajs.dom.experimental.webrtc.RTCConfiguration
import typingsSlinky.sipJs.coreMod.Logger
import typingsSlinky.sipJs.mediaStreamFactoryMod.MediaStreamFactory
import typingsSlinky.sipJs.sessionDescriptionHandlerConfigurationMod.SessionDescriptionHandlerConfiguration
import typingsSlinky.sipJs.sessionDescriptionHandlerSessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webSessionDescriptionHandlerMod {
  
  @JSImport("sip.js/lib/platform/web/session-description-handler", "SessionDescriptionHandler")
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
  object SessionDescriptionHandler {
    
    @JSImport("sip.js/lib/platform/web/session-description-handler", "SessionDescriptionHandler")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sip.js/lib/platform/web/session-description-handler", "SessionDescriptionHandler.dispatchAddTrackEvent")
    @js.native
    def dispatchAddTrackEvent: js.Any = js.native
    @scala.inline
    def dispatchAddTrackEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dispatchAddTrackEvent")(x.asInstanceOf[js.Any])
    
    @JSImport("sip.js/lib/platform/web/session-description-handler", "SessionDescriptionHandler.dispatchRemoveTrackEvent")
    @js.native
    def dispatchRemoveTrackEvent: js.Any = js.native
    @scala.inline
    def dispatchRemoveTrackEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dispatchRemoveTrackEvent")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sip.js/lib/platform/web/session-description-handler", "defaultMediaStreamFactory")
  @js.native
  def defaultMediaStreamFactory(): MediaStreamFactory = js.native
  
  @JSImport("sip.js/lib/platform/web/session-description-handler", "defaultPeerConnectionConfiguration")
  @js.native
  def defaultPeerConnectionConfiguration(): RTCConfiguration = js.native
  
  @JSImport("sip.js/lib/platform/web/session-description-handler", "defaultSessionDescriptionHandlerFactory")
  @js.native
  def defaultSessionDescriptionHandlerFactory(): SessionDescriptionHandlerFactory = js.native
  @JSImport("sip.js/lib/platform/web/session-description-handler", "defaultSessionDescriptionHandlerFactory")
  @js.native
  def defaultSessionDescriptionHandlerFactory(
    mediaStreamFactory: js.Function2[
      /* constraints */ MediaStreamConstraints, 
      /* sessionDescriptionHandler */ typingsSlinky.sipJs.sessionDescriptionHandlerSessionDescriptionHandlerMod.SessionDescriptionHandler, 
      js.Promise[MediaStream]
    ]
  ): SessionDescriptionHandlerFactory = js.native
}
