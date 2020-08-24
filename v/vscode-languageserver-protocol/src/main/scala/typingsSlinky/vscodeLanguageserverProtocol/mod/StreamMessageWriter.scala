package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "StreamMessageWriter")
@js.native
class StreamMessageWriter protected ()
  extends typingsSlinky.vscodeJsonrpc.mod.StreamMessageWriter {
  def this(writable: WritableStream) = this()
  def this(writable: WritableStream, encoding: BufferEncoding) = this()
}

