package typingsSlinky.streamMock

import typingsSlinky.node.streamMod.ReadableOptions
import typingsSlinky.std.ArrayLike
import typingsSlinky.streamMock.bufferReadableMockMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readableMod {
  
  @JSImport("stream-mock/lib/readable", "BufferReadableMock")
  @js.native
  class BufferReadableMock protected () extends default {
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_], options: ReadableOptions) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
  }
  
  @JSImport("stream-mock/lib/readable", "ObjectReadableMock")
  @js.native
  class ObjectReadableMock protected ()
    extends typingsSlinky.streamMock.objectReadableMockMod.default {
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_], options: ReadableOptions) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
  }
  
  @JSImport("stream-mock/lib/readable", "ReadableMock")
  @js.native
  class ReadableMock protected ()
    extends typingsSlinky.streamMock.readableMockMod.default {
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_], options: ReadableOptions) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
  }
}
