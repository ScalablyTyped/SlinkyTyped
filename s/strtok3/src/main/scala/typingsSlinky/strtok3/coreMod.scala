package typingsSlinky.strtok3

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.strtok3.bufferTokenizerMod.BufferTokenizer
import typingsSlinky.strtok3.readStreamTokenizerMod.ReadStreamTokenizer
import typingsSlinky.strtok3.typesMod.IFileInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("strtok3/lib/core", "EndOfStreamError")
  @js.native
  class EndOfStreamError ()
    extends typingsSlinky.peekReadable.mod.EndOfStreamError
  
  @JSImport("strtok3/lib/core", "fromBuffer")
  @js.native
  def fromBuffer(buffer: Buffer): BufferTokenizer = js.native
  @JSImport("strtok3/lib/core", "fromBuffer")
  @js.native
  def fromBuffer(buffer: Buffer, fileInfo: IFileInfo): BufferTokenizer = js.native
  
  @JSImport("strtok3/lib/core", "fromStream")
  @js.native
  def fromStream(stream: Readable): ReadStreamTokenizer = js.native
  @JSImport("strtok3/lib/core", "fromStream")
  @js.native
  def fromStream(stream: Readable, fileInfo: IFileInfo): ReadStreamTokenizer = js.native
}
