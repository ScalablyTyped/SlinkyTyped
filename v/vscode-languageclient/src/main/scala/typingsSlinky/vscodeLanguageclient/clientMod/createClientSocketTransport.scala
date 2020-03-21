package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeJsonrpc.Thenable
import typingsSlinky.vscodeJsonrpc.socketSupportMod.SocketTransport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "createClientSocketTransport")
@js.native
object createClientSocketTransport extends js.Object {
  def apply(port: Double): Thenable[SocketTransport] = js.native
  def apply(port: Double, encoding: String): Thenable[SocketTransport] = js.native
}

