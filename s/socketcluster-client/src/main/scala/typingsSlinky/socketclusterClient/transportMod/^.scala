package typingsSlinky.socketclusterClient.transportMod

import typingsSlinky.socketclusterClient.authMod.AGAuthEngine
import typingsSlinky.socketclusterClient.clientsocketMod.ClientOptions
import typingsSlinky.socketclusterServer.serverMod.CodecEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketcluster-client/lib/transport", JSImport.Namespace)
@js.native
class ^ protected () extends AGTransport {
  def this(authEngine: AGAuthEngine, codecEngine: CodecEngine, options: ClientOptions) = this()
  def this(
    authEngine: AGAuthEngine,
    codecEngine: CodecEngine,
    options: ClientOptions,
    wsOptions: typingsSlinky.ws.mod.ClientOptions
  ) = this()
  def this(
    authEngine: AGAuthEngine,
    codecEngine: CodecEngine,
    options: ClientOptions,
    wsOptions: js.UndefOr[scala.Nothing],
    handlers: TransportHandlers
  ) = this()
  def this(
    authEngine: AGAuthEngine,
    codecEngine: CodecEngine,
    options: ClientOptions,
    wsOptions: typingsSlinky.ws.mod.ClientOptions,
    handlers: TransportHandlers
  ) = this()
}

