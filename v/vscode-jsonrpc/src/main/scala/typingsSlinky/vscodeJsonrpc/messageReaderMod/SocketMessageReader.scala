package typingsSlinky.vscodeJsonrpc.messageReaderMod

import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/messageReader", "SocketMessageReader")
@js.native
class SocketMessageReader protected () extends StreamMessageReader {
  def this(socket: Socket) = this()
  def this(socket: Socket, encoding: BufferEncoding) = this()
}

