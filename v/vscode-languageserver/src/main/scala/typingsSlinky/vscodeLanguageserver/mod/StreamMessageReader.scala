package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "StreamMessageReader")
@js.native
class StreamMessageReader protected ()
  extends typingsSlinky.vscodeLanguageserverProtocol.mod.StreamMessageReader {
  def this(readable: ReadableStream) = this()
  def this(readable: ReadableStream, encoding: BufferEncoding) = this()
}

