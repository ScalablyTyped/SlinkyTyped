package typingsSlinky.strtok3

import typingsSlinky.node.Buffer
import typingsSlinky.strtok3.typesMod.IFileInfo
import typingsSlinky.strtok3.typesMod.IReadChunkOptions
import typingsSlinky.strtok3.typesMod.ITokenizer
import typingsSlinky.tokenizerToken.mod.IToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strtok3/lib/BufferTokenizer", JSImport.Namespace)
@js.native
object bufferTokenizerMod extends js.Object {
  @js.native
  class BufferTokenizer protected () extends ITokenizer {
    /**
      * Construct BufferTokenizer
      * @param buffer - Buffer to tokenize
      * @param fileInfo - Pass additional file information to the tokenizer
      */
    def this(buffer: Buffer) = this()
    def this(buffer: Buffer, fileInfo: IFileInfo) = this()
    var buffer: js.Any = js.native
    def peekBuffer(buffer: js.typedarray.Uint8Array): js.Promise[Double] = js.native
    def peekBuffer(buffer: js.typedarray.Uint8Array, options: IReadChunkOptions): js.Promise[Double] = js.native
    def peekNumber(token: IToken[Double]): js.Promise[Double] = js.native
    def readBuffer(buffer: js.typedarray.Uint8Array): js.Promise[Double] = js.native
    def readBuffer(buffer: js.typedarray.Uint8Array, options: IReadChunkOptions): js.Promise[Double] = js.native
    def readNumber(token: IToken[Double]): js.Promise[Double] = js.native
  }
  
}

