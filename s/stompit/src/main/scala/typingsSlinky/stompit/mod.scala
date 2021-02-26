package typingsSlinky.stompit

import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.node.streamMod.TransformOptions
import typingsSlinky.stompit.channelMod.ChannelOptions
import typingsSlinky.stompit.channelMod.^
import typingsSlinky.stompit.channelPoolMod.ChannelPoolOptions
import typingsSlinky.stompit.connectFailoverMod.ConnectFailoverOptions
import typingsSlinky.stompit.connectMod.ConnectOptions
import typingsSlinky.stompit.connectMod.ConnectionListener
import typingsSlinky.stompit.socketMod.SocketOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stompit", "Channel")
  @js.native
  class Channel protected () extends ^ {
    def this(connectFailover: typingsSlinky.stompit.connectFailoverMod.^) = this()
    def this(connectFailover: typingsSlinky.stompit.connectFailoverMod.^, options: ChannelOptions) = this()
  }
  
  @JSImport("stompit", "ChannelFactory")
  @js.native
  class ChannelFactory protected ()
    extends typingsSlinky.stompit.channelFactoryMod.^ {
    def this(connectFailover: typingsSlinky.stompit.connectFailoverMod.^) = this()
  }
  
  @JSImport("stompit", "ChannelPool")
  @js.native
  class ChannelPool protected ()
    extends typingsSlinky.stompit.channelPoolMod.^ {
    def this(connectFailover: typingsSlinky.stompit.connectFailoverMod.^) = this()
    def this(connectFailover: typingsSlinky.stompit.connectFailoverMod.^, options: ChannelPoolOptions) = this()
  }
  
  @JSImport("stompit", "Client")
  @js.native
  class Client protected ()
    extends typingsSlinky.stompit.clientMod.^ {
    def this(transportSocket: Duplex) = this()
    def this(transportSocket: Duplex, options: SocketOptions) = this()
  }
  
  @JSImport("stompit", "ConnectFailover")
  @js.native
  class ConnectFailover ()
    extends typingsSlinky.stompit.connectFailoverMod.^ {
    def this(servers: String) = this()
    def this(servers: js.Array[ConnectOptions]) = this()
    def this(servers: js.UndefOr[scala.Nothing], options: ConnectFailoverOptions) = this()
    def this(servers: String, options: ConnectFailoverOptions) = this()
    def this(servers: js.Array[ConnectOptions], options: ConnectFailoverOptions) = this()
  }
  
  @JSImport("stompit", "IncomingFrameStream")
  @js.native
  class IncomingFrameStream ()
    extends typingsSlinky.stompit.incomingFrameStreamMod.^ {
    def this(opts: TransformOptions) = this()
  }
  
  @JSImport("stompit", "OutgoingFrameStream")
  @js.native
  class OutgoingFrameStream protected ()
    extends typingsSlinky.stompit.outgoingFrameStreamMod.^ {
    def this(destination: Duplex) = this()
  }
  
  object connect {
    
    @JSImport("stompit", "connect")
    @js.native
    def apply(optionsOrPathOrPort: String): typingsSlinky.stompit.clientMod.^ = js.native
    @JSImport("stompit", "connect")
    @js.native
    def apply(optionsOrPathOrPort: String, connectionListener: ConnectionListener): typingsSlinky.stompit.clientMod.^ = js.native
    @JSImport("stompit", "connect")
    @js.native
    def apply(optionsOrPathOrPort: Double): typingsSlinky.stompit.clientMod.^ = js.native
    @JSImport("stompit", "connect")
    @js.native
    def apply(optionsOrPathOrPort: Double, connectionListener: ConnectionListener): typingsSlinky.stompit.clientMod.^ = js.native
    @JSImport("stompit", "connect")
    @js.native
    def apply(optionsOrPathOrPort: ConnectOptions): typingsSlinky.stompit.clientMod.^ = js.native
    @JSImport("stompit", "connect")
    @js.native
    def apply(optionsOrPathOrPort: ConnectOptions, connectionListener: ConnectionListener): typingsSlinky.stompit.clientMod.^ = js.native
    @JSImport("stompit", "connect")
    @js.native
    def apply(port: Double, host: js.UndefOr[scala.Nothing], connectionListener: ConnectionListener): typingsSlinky.stompit.clientMod.^ = js.native
    @JSImport("stompit", "connect")
    @js.native
    def apply(port: Double, host: String): typingsSlinky.stompit.clientMod.^ = js.native
    @JSImport("stompit", "connect")
    @js.native
    def apply(port: Double, host: String, connectionListener: ConnectionListener): typingsSlinky.stompit.clientMod.^ = js.native
  }
}
