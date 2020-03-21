package typingsSlinky.soap.mod

import typingsSlinky.soap.serverMod.ServerType
import typingsSlinky.soap.typesMod.IServerOptions
import typingsSlinky.soap.typesMod.IServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "Server")
@js.native
class Server protected ()
  extends typingsSlinky.soap.serverMod.Server {
  def this(server: ServerType, path: String, services: IServices, wsdl: typingsSlinky.soap.wsdlMod.WSDL) = this()
  def this(
    server: ServerType,
    path: String,
    services: IServices,
    wsdl: typingsSlinky.soap.wsdlMod.WSDL,
    options: IServerOptions
  ) = this()
}

