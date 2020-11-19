package typingsSlinky.vscodeJsonrpc.mod

import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc", "SocketMessageWriter")
@js.native
class SocketMessageWriter protected ()
  extends typingsSlinky.vscodeJsonrpc.messageWriterMod.SocketMessageWriter {
  def this(socket: Socket) = this()
  def this(socket: Socket, encoding: BufferEncoding) = this()
}
