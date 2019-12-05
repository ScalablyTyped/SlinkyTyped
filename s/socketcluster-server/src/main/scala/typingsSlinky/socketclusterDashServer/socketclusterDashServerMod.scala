package typingsSlinky.socketclusterDashServer

import typingsSlinky.node.httpMod.Server
import typingsSlinky.socketclusterDashServer.scserverMod.SCServerOptions
import typingsSlinky.socketclusterDashServer.scserverMod.^
import typingsSlinky.socketclusterDashServer.socketclusterDashServerMod.SCServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketcluster-server", JSImport.Namespace)
@js.native
object socketclusterDashServerMod extends js.Object {
  @js.native
  class SCServer () extends ^ {
    def this(options: SCServerOptions) = this()
  }
  
  @js.native
  class SCServerSocket protected ()
    extends typingsSlinky.socketclusterDashServer.scserversocketMod.^ {
    def this(id: String, server: ^, socket: typingsSlinky.ws.wsMod.^) = this()
  }
  
  def attach(server: Server): SCServer = js.native
  def attach(server: Server, options: SCServerOptions): SCServer = js.native
  def listen(): SCServer = js.native
  def listen(port: Double): SCServer = js.native
  def listen(port: Double, listeningListener: js.Function0[Unit]): SCServer = js.native
  def listen(port: Double, options: SCServerOptions): SCServer = js.native
  def listen(port: Double, options: SCServerOptions, listeningListener: js.Function0[Unit]): SCServer = js.native
}

