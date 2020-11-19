package typingsSlinky.strtok3

import typingsSlinky.strtok3.typesMod.IFileInfo
import typingsSlinky.strtok3.typesMod.IReadChunkOptions
import typingsSlinky.strtok3.typesMod.ITokenizer
import typingsSlinky.tokenizerToken.mod.IToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("strtok3/lib/AbstractTokenizer", JSImport.Namespace)
@js.native
object abstractTokenizerMod extends js.Object {
  
  @js.native
  abstract class AbstractTokenizer protected () extends ITokenizer {
    protected def this(fileInfo: IFileInfo) = this()
    
    var numBuffer: js.Any = js.native
    
    def peekBuffer(buffer: js.typedarray.Uint8Array): js.Promise[Double] = js.native
    def peekBuffer(buffer: js.typedarray.Uint8Array, options: IReadChunkOptions): js.Promise[Double] = js.native
    
    /**
      * Read a numeric token from the stream
      * @param token - Numeric token
      * @returns Promise with number
      */
    def peekNumber(token: IToken[Double]): js.Promise[Double] = js.native
    
    def readBuffer(buffer: js.typedarray.Uint8Array): js.Promise[Double] = js.native
    def readBuffer(buffer: js.typedarray.Uint8Array, options: IReadChunkOptions): js.Promise[Double] = js.native
    
    /**
      * Read a numeric token from the stream
      * @param token - Numeric token
      * @returns Promise with number
      */
    def readNumber(token: IToken[Double]): js.Promise[Double] = js.native
  }
}
