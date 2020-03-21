package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeJsonrpc.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "createClientSocketTransport")
@js.native
object createClientSocketTransport extends js.Object {
  def apply(port: Double): Thenable[typingsSlinky.vscodeJsonrpc.socketSupportMod.SocketTransport] = js.native
  def apply(port: Double, encoding: String): Thenable[typingsSlinky.vscodeJsonrpc.socketSupportMod.SocketTransport] = js.native
}

