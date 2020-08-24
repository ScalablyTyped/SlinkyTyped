package typingsSlinky.strtok3

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.strtok3.bufferTokenizerMod.BufferTokenizer
import typingsSlinky.strtok3.readStreamTokenizerMod.ReadStreamTokenizer
import typingsSlinky.strtok3.typesMod.IFileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strtok3/lib/core", JSImport.Namespace)
@js.native
object coreMod extends js.Object {
  @js.native
  class EndOfStreamError ()
    extends typingsSlinky.peekReadable.mod.EndOfStreamError
  
  def fromBuffer(buffer: Buffer): BufferTokenizer = js.native
  def fromBuffer(buffer: Buffer, fileInfo: IFileInfo): BufferTokenizer = js.native
  def fromStream(stream: Readable): ReadStreamTokenizer = js.native
  def fromStream(stream: Readable, fileInfo: IFileInfo): ReadStreamTokenizer = js.native
}

