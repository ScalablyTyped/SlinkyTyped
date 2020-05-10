package typingsSlinky.stompit

import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.node.streamMod.TransformOptions
import typingsSlinky.stompit.channelMod.ChannelOptions
import typingsSlinky.stompit.channelMod.^
import typingsSlinky.stompit.channelPoolMod.ChannelPoolOptions
import typingsSlinky.stompit.connectFailoverMod.ConnectFailoverOptions
import typingsSlinky.stompit.connectMod.ConnectOptions
import typingsSlinky.stompit.socketMod.SocketOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Channel protected () extends ^ {
    def this(connectFailover: typingsSlinky.stompit.connectFailoverMod.^) = this()
    def this(connectFailover: typingsSlinky.stompit.connectFailoverMod.^, options: ChannelOptions) = this()
  }
  
  @js.native
  class ChannelFactory protected ()
    extends typingsSlinky.stompit.channelFactoryMod.^ {
    def this(connectFailover: typingsSlinky.stompit.connectFailoverMod.^) = this()
  }
  
  @js.native
  class ChannelPool protected ()
    extends typingsSlinky.stompit.channelPoolMod.^ {
    def this(connectFailover: typingsSlinky.stompit.connectFailoverMod.^) = this()
    def this(connectFailover: typingsSlinky.stompit.connectFailoverMod.^, options: ChannelPoolOptions) = this()
  }
  
  @js.native
  class Client protected ()
    extends typingsSlinky.stompit.clientMod.^ {
    def this(transportSocket: Duplex) = this()
    def this(transportSocket: Duplex, options: SocketOptions) = this()
  }
  
  @js.native
  class ConnectFailover ()
    extends typingsSlinky.stompit.connectFailoverMod.^ {
    def this(servers: String) = this()
    def this(servers: js.Array[ConnectOptions]) = this()
    def this(servers: String, options: ConnectFailoverOptions) = this()
    def this(servers: js.Array[ConnectOptions], options: ConnectFailoverOptions) = this()
  }
  
  @js.native
  class IncomingFrameStream ()
    extends typingsSlinky.stompit.incomingFrameStreamMod.^ {
    def this(opts: TransformOptions) = this()
  }
  
  @js.native
  class OutgoingFrameStream protected ()
    extends typingsSlinky.stompit.outgoingFrameStreamMod.^ {
    def this(destination: Duplex) = this()
  }
  
  @js.native
  object connect extends js.Object {
    def apply(optionsOrPath: String): typingsSlinky.stompit.clientMod.^ = js.native
    def apply(
      optionsOrPath: String,
      connectionListener: js.Function2[/* err */ js.Error | Null, /* client */ typingsSlinky.stompit.clientMod.^, Unit]
    ): typingsSlinky.stompit.clientMod.^ = js.native
    def apply(optionsOrPath: ConnectOptions): typingsSlinky.stompit.clientMod.^ = js.native
    def apply(
      optionsOrPath: ConnectOptions,
      connectionListener: js.Function2[/* err */ js.Error | Null, /* client */ typingsSlinky.stompit.clientMod.^, Unit]
    ): typingsSlinky.stompit.clientMod.^ = js.native
    def apply(port: Double): typingsSlinky.stompit.clientMod.^ = js.native
    def apply(port: Double, host: String): typingsSlinky.stompit.clientMod.^ = js.native
    def apply(
      port: Double,
      host: String,
      connectionListener: js.Function2[/* err */ js.Error | Null, /* client */ typingsSlinky.stompit.clientMod.^, Unit]
    ): typingsSlinky.stompit.clientMod.^ = js.native
  }
  
}

