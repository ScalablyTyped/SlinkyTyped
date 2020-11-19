package typingsSlinky.streamMock

import typingsSlinky.node.streamMod.DuplexOptions
import typingsSlinky.node.streamMod.ReadableOptions
import typingsSlinky.node.streamMod.WritableOptions
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stream-mock", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class BufferReadableMock protected ()
    extends typingsSlinky.streamMock.readableMod.BufferReadableMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: js.Iterable[_], options: ReadableOptions) = this()
  }
  
  @js.native
  class BufferWritableMock ()
    extends typingsSlinky.streamMock.writableMod.BufferWritableMock {
    def this(options: WritableOptions) = this()
  }
  
  @js.native
  class DuplexMock ()
    extends typingsSlinky.streamMock.duplexMod.DuplexMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_]) = this()
    def this(source: js.UndefOr[scala.Nothing], options: DuplexOptions) = this()
    def this(source: ArrayLike[_], options: DuplexOptions) = this()
    def this(source: js.Iterable[_], options: DuplexOptions) = this()
  }
  
  @js.native
  class ObjectReadableMock protected ()
    extends typingsSlinky.streamMock.readableMod.ObjectReadableMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: js.Iterable[_], options: ReadableOptions) = this()
  }
  
  @js.native
  class ObjectWritableMock ()
    extends typingsSlinky.streamMock.writableMod.ObjectWritableMock {
    def this(options: WritableOptions) = this()
  }
  
  @js.native
  class ReadableMock protected ()
    extends typingsSlinky.streamMock.readableMod.ReadableMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: js.Iterable[_], options: ReadableOptions) = this()
  }
  
  @js.native
  class WritableMock ()
    extends typingsSlinky.streamMock.writableMod.WritableMock {
    def this(options: WritableOptions) = this()
  }
}
