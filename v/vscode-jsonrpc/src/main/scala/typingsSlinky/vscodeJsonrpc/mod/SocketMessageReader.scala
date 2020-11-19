package typingsSlinky.vscodeJsonrpc.mod

import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc", "SocketMessageReader")
@js.native
class SocketMessageReader protected ()
  extends typingsSlinky.vscodeJsonrpc.messageReaderMod.SocketMessageReader {
  def this(socket: Socket) = this()
  def this(socket: Socket, encoding: BufferEncoding) = this()
}
