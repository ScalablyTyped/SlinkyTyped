package typingsSlinky.sipJs.mod

import org.scalajs.dom.experimental.mediastream.MediaStream
import org.scalajs.dom.experimental.mediastream.MediaStreamConstraints
import org.scalajs.dom.experimental.webrtc.RTCConfiguration
import org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit
import typingsSlinky.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typingsSlinky.sipJs.coreMod.Logger
import typingsSlinky.sipJs.mediaStreamFactoryMod.MediaStreamFactory
import typingsSlinky.sipJs.sessionDescriptionHandlerConfigurationMod.SessionDescriptionHandlerConfiguration
import typingsSlinky.sipJs.sessionDescriptionHandlerSessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactory
import typingsSlinky.sipJs.simpleUserOptionsMod.SimpleUserOptions
import typingsSlinky.sipJs.transportOptionsMod.TransportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Web {
  
  @JSImport("sip.js", "Web.SessionDescriptionHandler")
  @js.native
  class SessionDescriptionHandler protected ()
    extends typingsSlinky.sipJs.webMod.SessionDescriptionHandler {
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
    
    @JSImport("sip.js", "Web.SessionDescriptionHandler")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sip.js", "Web.SessionDescriptionHandler.dispatchAddTrackEvent")
    @js.native
    def dispatchAddTrackEvent: js.Any = js.native
    @scala.inline
    def dispatchAddTrackEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dispatchAddTrackEvent")(x.asInstanceOf[js.Any])
    
    @JSImport("sip.js", "Web.SessionDescriptionHandler.dispatchRemoveTrackEvent")
    @js.native
    def dispatchRemoveTrackEvent: js.Any = js.native
    @scala.inline
    def dispatchRemoveTrackEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dispatchRemoveTrackEvent")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sip.js", "Web.SimpleUser")
  @js.native
  class SimpleUser protected ()
    extends typingsSlinky.sipJs.webMod.SimpleUser {
    /**
      * Constructs a new instance of the `SimpleUser` class.
      * @param server - SIP WebSocket Server URL.
      * @param options - Options bucket. See {@link SimpleUserOptions} for details.
      */
    def this(server: String) = this()
    def this(server: String, options: SimpleUserOptions) = this()
  }
  
  @JSImport("sip.js", "Web.Transport")
  @js.native
  class Transport protected ()
    extends typingsSlinky.sipJs.webMod.Transport {
    def this(logger: Logger) = this()
    def this(logger: Logger, options: TransportOptions) = this()
  }
  /* static members */
  object Transport {
    
    @JSImport("sip.js", "Web.Transport")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sip.js", "Web.Transport.defaultOptions")
    @js.native
    def defaultOptions: js.Any = js.native
    @scala.inline
    def defaultOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sip.js", "Web.addMidLines")
  @js.native
  def addMidLines(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  
  @JSImport("sip.js", "Web.cleanJitsiSdpImageattr")
  @js.native
  def cleanJitsiSdpImageattr(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  
  @JSImport("sip.js", "Web.defaultMediaStreamFactory")
  @js.native
  def defaultMediaStreamFactory(): MediaStreamFactory = js.native
  
  @JSImport("sip.js", "Web.defaultPeerConnectionConfiguration")
  @js.native
  def defaultPeerConnectionConfiguration(): RTCConfiguration = js.native
  
  @JSImport("sip.js", "Web.defaultSessionDescriptionHandlerFactory")
  @js.native
  def defaultSessionDescriptionHandlerFactory(): SessionDescriptionHandlerFactory = js.native
  @JSImport("sip.js", "Web.defaultSessionDescriptionHandlerFactory")
  @js.native
  def defaultSessionDescriptionHandlerFactory(
    mediaStreamFactory: js.Function2[
      /* constraints */ MediaStreamConstraints, 
      /* sessionDescriptionHandler */ typingsSlinky.sipJs.sessionDescriptionHandlerSessionDescriptionHandlerMod.SessionDescriptionHandler, 
      js.Promise[MediaStream]
    ]
  ): SessionDescriptionHandlerFactory = js.native
  
  @JSImport("sip.js", "Web.holdModifier")
  @js.native
  def holdModifier(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  
  @JSImport("sip.js", "Web.stripG722")
  @js.native
  def stripG722(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  
  @JSImport("sip.js", "Web.stripRtpPayload")
  @js.native
  def stripRtpPayload(payload: String): SessionDescriptionHandlerModifier = js.native
  
  @JSImport("sip.js", "Web.stripTcpCandidates")
  @js.native
  def stripTcpCandidates(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  
  @JSImport("sip.js", "Web.stripTelephoneEvent")
  @js.native
  def stripTelephoneEvent(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  
  @JSImport("sip.js", "Web.stripVideo")
  @js.native
  def stripVideo(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
}
