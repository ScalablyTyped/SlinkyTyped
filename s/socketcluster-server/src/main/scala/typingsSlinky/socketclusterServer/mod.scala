package typingsSlinky.socketclusterServer

import typingsSlinky.node.httpMod.Server
import typingsSlinky.socketclusterServer.serverMod.AGServerOptions
import typingsSlinky.socketclusterServer.serverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketcluster-server", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AGServer () extends ^ {
    def this(options: AGServerOptions) = this()
  }
  
  @js.native
  class AGServerSocket protected ()
    extends typingsSlinky.socketclusterServer.serversocketMod.^ {
    def this(id: String, server: ^, socket: typingsSlinky.ws.mod.^, protocolVersion: Double) = this()
  }
  
  def attach(server: Server): AGServer = js.native
  def attach(server: Server, options: AGServerOptions): AGServer = js.native
  def listen(): AGServer = js.native
  def listen(port: Double): AGServer = js.native
  def listen(port: Double, listeningListener: js.Function0[Unit]): AGServer = js.native
  def listen(port: Double, options: AGServerOptions): AGServer = js.native
  def listen(port: Double, options: AGServerOptions, listeningListener: js.Function0[Unit]): AGServer = js.native
}

