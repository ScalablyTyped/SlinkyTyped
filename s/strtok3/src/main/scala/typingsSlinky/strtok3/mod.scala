package typingsSlinky.strtok3

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.strtok3.bufferTokenizerMod.BufferTokenizer
import typingsSlinky.strtok3.fileTokenizerMod.FileTokenizer
import typingsSlinky.strtok3.readStreamTokenizerMod.ReadStreamTokenizer
import typingsSlinky.strtok3.typesMod.IFileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("strtok3", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def fromBuffer(buffer: Buffer): BufferTokenizer = js.native
  def fromBuffer(buffer: Buffer, fileInfo: IFileInfo): BufferTokenizer = js.native
  
  def fromFile(sourceFilePath: String): js.Promise[FileTokenizer] = js.native
  
  def fromStream(stream: Readable): js.Promise[ReadStreamTokenizer] = js.native
  def fromStream(stream: Readable, fileInfo: IFileInfo): js.Promise[ReadStreamTokenizer] = js.native
  
  @js.native
  class EndOfStreamError ()
    extends typingsSlinky.strtok3.coreMod.EndOfStreamError
}
