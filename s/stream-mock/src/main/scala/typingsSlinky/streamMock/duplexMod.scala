package typingsSlinky.streamMock

import typingsSlinky.node.streamMod.DuplexOptions
import typingsSlinky.std.ArrayLike
import typingsSlinky.streamMock.duplexMockMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/duplex", JSImport.Namespace)
@js.native
object duplexMod extends js.Object {
  @js.native
  class DuplexMock () extends default {
    def this(source: ArrayLike[_]) = this()
    def this(source: js.Iterable[_]) = this()
    def this(source: ArrayLike[_], options: DuplexOptions) = this()
    def this(source: js.Iterable[_], options: DuplexOptions) = this()
  }
  
}

