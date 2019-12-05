package typingsSlinky.streamDashMock

import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.streamMod.ReadableOptions
import typingsSlinky.std.ArrayLike
import typingsSlinky.streamDashMock.libReadableBufferReadableMockMod.BufferReadableMock
import typingsSlinky.streamDashMock.libReadableIReadableMockMod.IReadableMock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/readable/BufferReadableMock", JSImport.Namespace)
@js.native
object libReadableBufferReadableMockMod extends js.Object {
  @js.native
  trait BufferReadableMock extends IReadableMock {
    var encoding: BufferEncoding = js.native
    def _read(): Unit = js.native
  }
  
  @js.native
  class default protected () extends BufferReadableMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: js.Iterable[_], options: ReadableOptions) = this()
  }
  
}

