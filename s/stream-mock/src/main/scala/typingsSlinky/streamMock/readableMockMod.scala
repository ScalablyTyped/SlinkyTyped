package typingsSlinky.streamMock

import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.streamMod.ReadableOptions
import typingsSlinky.std.ArrayLike
import typingsSlinky.streamMock.ireadablemockMod.IReadableMock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readableMockMod {
  
  @JSImport("stream-mock/lib/readable/ReadableMock", JSImport.Default)
  @js.native
  class default protected () extends ReadableMock {
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_], options: ReadableOptions) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
  }
  
  @js.native
  trait ReadableMock extends IReadableMock {
    
    var _readableState: js.Any = js.native
    
    var encoding: BufferEncoding = js.native
    
    var objectMode: Boolean = js.native
  }
}
