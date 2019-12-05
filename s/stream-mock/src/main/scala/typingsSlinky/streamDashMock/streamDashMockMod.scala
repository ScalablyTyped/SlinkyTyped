package typingsSlinky.streamDashMock

import typingsSlinky.node.streamMod.DuplexOptions
import typingsSlinky.node.streamMod.ReadableOptions
import typingsSlinky.node.streamMod.WritableOptions
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock", JSImport.Namespace)
@js.native
object streamDashMockMod extends js.Object {
  @js.native
  class BufferReadableMock protected ()
    extends typingsSlinky.streamDashMock.libReadableMod.BufferReadableMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: js.Iterable[_], options: ReadableOptions) = this()
  }
  
  @js.native
  class BufferWritableMock ()
    extends typingsSlinky.streamDashMock.libWritableMod.BufferWritableMock {
    def this(options: WritableOptions) = this()
  }
  
  @js.native
  class DuplexMock ()
    extends typingsSlinky.streamDashMock.libDuplexMod.DuplexMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_], options: DuplexOptions) = this()
    def this(source: js.Iterable[_], options: DuplexOptions) = this()
  }
  
  @js.native
  class ObjectReadableMock protected ()
    extends typingsSlinky.streamDashMock.libReadableMod.ObjectReadableMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: js.Iterable[_], options: ReadableOptions) = this()
  }
  
  @js.native
  class ObjectWritableMock ()
    extends typingsSlinky.streamDashMock.libWritableMod.ObjectWritableMock {
    def this(options: WritableOptions) = this()
  }
  
  @js.native
  class ReadableMock protected ()
    extends typingsSlinky.streamDashMock.libReadableMod.ReadableMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: js.Iterable[_], options: ReadableOptions) = this()
  }
  
  @js.native
  class WritableMock ()
    extends typingsSlinky.streamDashMock.libWritableMod.WritableMock {
    def this(options: WritableOptions) = this()
  }
  
}

