package typingsSlinky.stompit

import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.node.streamMod.TransformOptions
import typingsSlinky.std.Error
import typingsSlinky.stompit.libChannelMod.ChannelOptions
import typingsSlinky.stompit.libChannelMod.^
import typingsSlinky.stompit.libChannelPoolMod.ChannelPoolOptions
import typingsSlinky.stompit.libConnectFailoverMod.ConnectFailoverOptions
import typingsSlinky.stompit.libConnectMod.ConnectOptions
import typingsSlinky.stompit.libSocketMod.SocketOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit", JSImport.Namespace)
@js.native
object stompitMod extends js.Object {
  @js.native
  class Channel protected () extends ^ {
    def this(connectFailover: typingsSlinky.stompit.libConnectFailoverMod.^) = this()
    def this(connectFailover: typingsSlinky.stompit.libConnectFailoverMod.^, options: ChannelOptions) = this()
  }
  
  @js.native
  class ChannelFactory protected ()
    extends typingsSlinky.stompit.libChannelFactoryMod.^ {
    def this(connectFailover: typingsSlinky.stompit.libConnectFailoverMod.^) = this()
  }
  
  @js.native
  class ChannelPool protected ()
    extends typingsSlinky.stompit.libChannelPoolMod.^ {
    def this(connectFailover: typingsSlinky.stompit.libConnectFailoverMod.^) = this()
    def this(connectFailover: typingsSlinky.stompit.libConnectFailoverMod.^, options: ChannelPoolOptions) = this()
  }
  
  @js.native
  class Client protected ()
    extends typingsSlinky.stompit.libClientMod.^ {
    def this(transportSocket: Duplex) = this()
    def this(transportSocket: Duplex, options: SocketOptions) = this()
  }
  
  @js.native
  class ConnectFailover ()
    extends typingsSlinky.stompit.libConnectFailoverMod.^ {
    def this(servers: String) = this()
    def this(servers: js.Array[ConnectOptions]) = this()
    def this(servers: String, options: ConnectFailoverOptions) = this()
    def this(servers: js.Array[ConnectOptions], options: ConnectFailoverOptions) = this()
  }
  
  @js.native
  class IncomingFrameStream ()
    extends typingsSlinky.stompit.libIncomingFrameStreamMod.^ {
    def this(opts: TransformOptions) = this()
  }
  
  @js.native
  class OutgoingFrameStream protected ()
    extends typingsSlinky.stompit.libOutgoingFrameStreamMod.^ {
    def this(destination: Duplex) = this()
  }
  
  @js.native
  object connect extends js.Object {
    def apply(optionsOrPath: String): typingsSlinky.stompit.libClientMod.^ = js.native
    def apply(
      optionsOrPath: String,
      connectionListener: js.Function2[/* err */ Error | Null, /* client */ typingsSlinky.stompit.libClientMod.^, Unit]
    ): typingsSlinky.stompit.libClientMod.^ = js.native
    def apply(optionsOrPath: ConnectOptions): typingsSlinky.stompit.libClientMod.^ = js.native
    def apply(
      optionsOrPath: ConnectOptions,
      connectionListener: js.Function2[/* err */ Error | Null, /* client */ typingsSlinky.stompit.libClientMod.^, Unit]
    ): typingsSlinky.stompit.libClientMod.^ = js.native
    def apply(port: Double): typingsSlinky.stompit.libClientMod.^ = js.native
    def apply(port: Double, host: String): typingsSlinky.stompit.libClientMod.^ = js.native
    def apply(
      port: Double,
      host: String,
      connectionListener: js.Function2[/* err */ js.Error | Null, /* client */ typingsSlinky.stompit.libClientMod.^, Unit]
    ): typingsSlinky.stompit.libClientMod.^ = js.native
  }
  
}

