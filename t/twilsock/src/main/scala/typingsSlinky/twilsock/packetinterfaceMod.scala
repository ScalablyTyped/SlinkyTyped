package typingsSlinky.twilsock

import typingsSlinky.twilsock.channelMod.Channel
import typingsSlinky.twilsock.configurationMod.Configuration
import typingsSlinky.twilsock.messagesMod.InitReply
import typingsSlinky.twilsock.protocolMod.Protocol.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilsock/lib/packetinterface", JSImport.Namespace)
@js.native
object packetinterfaceMod extends js.Object {
  
  @js.native
  class PacketInterface protected () extends js.Object {
    def this(channel: Channel, config: Configuration) = this()
    
    val activeRequests: js.Any = js.native
    
    val channel: js.Any = js.native
    
    val config: js.Any = js.native
    
    def isConnected: Boolean = js.native
    
    def processReply(reply: js.Any): Unit = js.native
    
    def send(header: Header): String = js.native
    def send(header: Header, payload: js.Any): String = js.native
    
    def sendClose(): Unit = js.native
    
    def sendInit(): js.Promise[InitReply] = js.native
    
    def sendWithReply(header: Header): js.Promise[PacketResponse] = js.native
    def sendWithReply(header: Header, payload: js.Any): js.Promise[PacketResponse] = js.native
    
    def shutdown(): Unit = js.native
    
    var storeRequest: js.Any = js.native
  }
  
  @js.native
  class PacketResponse () extends js.Object {
    
    val body: js.UndefOr[js.Any] = js.native
    
    val header: js.Any = js.native
    
    val id: String = js.native
  }
}
