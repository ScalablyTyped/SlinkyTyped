package typingsSlinky.streamMock

import typingsSlinky.node.streamMod.ReadableOptions
import typingsSlinky.std.ArrayLike
import typingsSlinky.streamMock.ireadablemockMod.IReadableMock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/readable/ObjectReadableMock", JSImport.Namespace)
@js.native
object objectReadableMockMod extends js.Object {
  @js.native
  trait ObjectReadableMock extends IReadableMock {
    def _read(): Unit = js.native
  }
  
  @js.native
  class default protected () extends ObjectReadableMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: js.Iterable[_], options: ReadableOptions) = this()
  }
  
}

