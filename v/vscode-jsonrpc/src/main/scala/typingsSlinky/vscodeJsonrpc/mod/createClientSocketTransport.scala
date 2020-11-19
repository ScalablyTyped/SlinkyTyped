package typingsSlinky.vscodeJsonrpc.mod

import typingsSlinky.node.BufferEncoding
import typingsSlinky.vscodeJsonrpc.socketSupportMod.SocketTransport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc", "createClientSocketTransport")
@js.native
object createClientSocketTransport extends js.Object {
  
  def apply(port: Double): js.Promise[SocketTransport] = js.native
  def apply(port: Double, encoding: BufferEncoding): js.Promise[SocketTransport] = js.native
}
