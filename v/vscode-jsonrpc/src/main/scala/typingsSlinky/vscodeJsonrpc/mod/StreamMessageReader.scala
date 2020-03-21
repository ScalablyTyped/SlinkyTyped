package typingsSlinky.vscodeJsonrpc.mod

import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "StreamMessageReader")
@js.native
class StreamMessageReader protected ()
  extends typingsSlinky.vscodeJsonrpc.messageReaderMod.StreamMessageReader {
  def this(readable: ReadableStream) = this()
  def this(readable: ReadableStream, encoding: String) = this()
}

