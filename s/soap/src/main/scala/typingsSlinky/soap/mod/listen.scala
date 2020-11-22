package typingsSlinky.soap.mod

import typingsSlinky.soap.serverMod.ServerType
import typingsSlinky.soap.typesMod.IServerOptions
import typingsSlinky.soap.typesMod.IServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("soap", "listen")
@js.native
object listen extends js.Object {
  
  def apply(server: ServerType, options: IServerOptions): typingsSlinky.soap.serverMod.Server = js.native
  def apply(server: ServerType, path: String, services: IServices, wsdl: String): typingsSlinky.soap.serverMod.Server = js.native
  def apply(
    server: ServerType,
    path: String,
    services: IServices,
    wsdl: String,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any, Unit]
  ): typingsSlinky.soap.serverMod.Server = js.native
}
