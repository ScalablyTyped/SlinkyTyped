package typingsSlinky.websocket.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConfig extends StObject {
  
  /**
    * If true, fragmented messages will be automatically assembled and the full
    * message will be emitted via a `message` event. If false, each frame will be
    * emitted on the `connection` object via a `frame` event and the application
    * will be responsible for aggregating multiple fragmented frames. Single-frame
    * messages will emit a `message` event in addition to the `frame` event.
    * @default true
    */
  var assembleFragments: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of milliseconds to wait after sending a close frame for an
    * `acknowledgement` to come back before giving up and just closing the socket.
    * @default 5000
    */
  var closeTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Whether or not to fragment outgoing messages. If true, messages will be
    * automatically fragmented into chunks of up to `fragmentationThreshold` bytes.
    * @default true
    */
  var fragmentOutgoingMessages: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum size of a frame in bytes before it is automatically fragmented.
    * @default 16KiB
    */
  var fragmentationThreshold: js.UndefOr[Double] = js.native
  
  /**
    * The maximum allowed received frame size in bytes.
    * Single frame messages will also be limited to this maximum.
    * @default 1MiB
    */
  var maxReceivedFrameSize: js.UndefOr[Double] = js.native
  
  /**
    * The maximum allowed aggregate message size (for fragmented messages) in bytes
    * @default 8MiB
    */
  var maxReceivedMessageSize: js.UndefOr[Double] = js.native
}
object IConfig {
  
  @scala.inline
  def apply(): IConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConfig]
  }
  
  @scala.inline
  implicit class IConfigMutableBuilder[Self <: IConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssembleFragments(value: Boolean): Self = StObject.set(x, "assembleFragments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssembleFragmentsUndefined: Self = StObject.set(x, "assembleFragments", js.undefined)
    
    @scala.inline
    def setCloseTimeout(value: Double): Self = StObject.set(x, "closeTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseTimeoutUndefined: Self = StObject.set(x, "closeTimeout", js.undefined)
    
    @scala.inline
    def setFragmentOutgoingMessages(value: Boolean): Self = StObject.set(x, "fragmentOutgoingMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentOutgoingMessagesUndefined: Self = StObject.set(x, "fragmentOutgoingMessages", js.undefined)
    
    @scala.inline
    def setFragmentationThreshold(value: Double): Self = StObject.set(x, "fragmentationThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentationThresholdUndefined: Self = StObject.set(x, "fragmentationThreshold", js.undefined)
    
    @scala.inline
    def setMaxReceivedFrameSize(value: Double): Self = StObject.set(x, "maxReceivedFrameSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxReceivedFrameSizeUndefined: Self = StObject.set(x, "maxReceivedFrameSize", js.undefined)
    
    @scala.inline
    def setMaxReceivedMessageSize(value: Double): Self = StObject.set(x, "maxReceivedMessageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxReceivedMessageSizeUndefined: Self = StObject.set(x, "maxReceivedMessageSize", js.undefined)
  }
}
