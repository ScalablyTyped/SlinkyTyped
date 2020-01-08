package typingsSlinky.streamDashMock

import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.streamMod.ReadableOptions
import typingsSlinky.std.ArrayLike
import typingsSlinky.streamDashMock.libReadableIReadableMockMod.IReadableMock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/readable/ReadableMock", JSImport.Namespace)
@js.native
object libReadableReadableMockMod extends js.Object {
  @js.native
  trait ReadableMock extends IReadableMock {
    var _readableState: js.Any = js.native
    var encoding: BufferEncoding = js.native
    var objectMode: Boolean = js.native
  }
  
  @js.native
  class default protected () extends ReadableMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: js.Iterable[_], options: ReadableOptions) = this()
  }
  
}

