package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "createClientSocketTransport")
@js.native
object createClientSocketTransport extends js.Object {
  
  def apply(port: Double): js.Promise[typingsSlinky.vscodeJsonrpc.socketSupportMod.SocketTransport] = js.native
  def apply(port: Double, encoding: BufferEncoding): js.Promise[typingsSlinky.vscodeJsonrpc.socketSupportMod.SocketTransport] = js.native
}
