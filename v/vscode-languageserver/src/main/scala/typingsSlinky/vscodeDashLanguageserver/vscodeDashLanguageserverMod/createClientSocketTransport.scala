package typingsSlinky.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typingsSlinky.vscodeDashJsonrpc.libSocketSupportMod.SocketTransport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "createClientSocketTransport")
@js.native
object createClientSocketTransport extends js.Object {
  def apply(port: Double): typingsSlinky.vscodeDashJsonrpc.Thenable[SocketTransport] = js.native
  def apply(port: Double, encoding: String): typingsSlinky.vscodeDashJsonrpc.Thenable[SocketTransport] = js.native
}

