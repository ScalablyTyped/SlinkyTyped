package typingsSlinky.storybookChannelWebsocket

import org.scalajs.dom.raw.Event
import typingsSlinky.storybookChannels.mod.Channel
import typingsSlinky.storybookChannels.mod.ChannelHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/channel-websocket", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(hasUrlAsyncOnError: CreateChannelArgs): Channel = js.native
  
  @js.native
  trait CreateChannelArgs extends js.Object {
    
    var async: Boolean = js.native
    
    def onError(message: Event): Unit = js.native
    @JSName("onError")
    var onError_Original: OnError = js.native
    
    var url: String = js.native
  }
  
  @js.native
  class WebsocketTransport protected () extends js.Object {
    def this(hasUrlOnError: WebsocketTransportArgs) = this()
    
    var buffer: js.Any = js.native
    
    var connect: js.Any = js.native
    
    var flush: js.Any = js.native
    
    var handler: js.Any = js.native
    
    var isReady: js.Any = js.native
    
    def send(event: js.Any): Unit = js.native
    
    var sendLater: js.Any = js.native
    
    var sendNow: js.Any = js.native
    
    def setHandler(handler: ChannelHandler): Unit = js.native
    
    var socket: js.Any = js.native
  }
  
  @js.native
  trait WebsocketTransportArgs extends js.Object {
    
    def onError(message: Event): Unit = js.native
    @JSName("onError")
    var onError_Original: OnError = js.native
    
    var url: String = js.native
  }
  
  type OnError = js.Function1[/* message */ Event, Unit]
}
