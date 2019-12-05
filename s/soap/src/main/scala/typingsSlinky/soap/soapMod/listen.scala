package typingsSlinky.soap.soapMod

import typingsSlinky.soap.libServerMod.ServerType
import typingsSlinky.soap.libTypesMod.IServerOptions
import typingsSlinky.soap.libTypesMod.IServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "listen")
@js.native
object listen extends js.Object {
  def apply(server: ServerType, options: IServerOptions): typingsSlinky.soap.libServerMod.Server = js.native
  def apply(server: ServerType, path: String, services: IServices, wsdl: String): typingsSlinky.soap.libServerMod.Server = js.native
  def apply(
    server: ServerType,
    path: String,
    services: IServices,
    wsdl: String,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any, Unit]
  ): typingsSlinky.soap.libServerMod.Server = js.native
}

