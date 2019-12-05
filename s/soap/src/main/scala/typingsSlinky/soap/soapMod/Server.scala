package typingsSlinky.soap.soapMod

import typingsSlinky.soap.libServerMod.ServerType
import typingsSlinky.soap.libTypesMod.IServerOptions
import typingsSlinky.soap.libTypesMod.IServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "Server")
@js.native
class Server protected ()
  extends typingsSlinky.soap.libServerMod.Server {
  def this(server: ServerType, path: String, services: IServices, wsdl: typingsSlinky.soap.libWsdlMod.WSDL) = this()
  def this(
    server: ServerType,
    path: String,
    services: IServices,
    wsdl: typingsSlinky.soap.libWsdlMod.WSDL,
    options: IServerOptions
  ) = this()
}

