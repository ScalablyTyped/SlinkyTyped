package typingsSlinky.streamMock

import typingsSlinky.node.streamMod.ReadableOptions
import typingsSlinky.std.ArrayLike
import typingsSlinky.streamMock.bufferReadableMockMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stream-mock/lib/readable", JSImport.Namespace)
@js.native
object readableMod extends js.Object {
  
  @js.native
  class BufferReadableMock protected () extends default {
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: js.Iterable[_], options: ReadableOptions) = this()
  }
  
  @js.native
  class ObjectReadableMock protected ()
    extends typingsSlinky.streamMock.objectReadableMockMod.default {
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: js.Iterable[_], options: ReadableOptions) = this()
  }
  
  @js.native
  class ReadableMock protected ()
    extends typingsSlinky.streamMock.readableMockMod.default {
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: js.Iterable[_], options: ReadableOptions) = this()
  }
}
