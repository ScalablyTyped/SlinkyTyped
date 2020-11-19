package typingsSlinky.streamMock

import typingsSlinky.node.streamMod.WritableOptions
import typingsSlinky.streamMock.bufferWritableMockMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stream-mock/lib/writable", JSImport.Namespace)
@js.native
object writableMod extends js.Object {
  
  @js.native
  class BufferWritableMock () extends default {
    def this(options: WritableOptions) = this()
  }
  
  @js.native
  class ObjectWritableMock ()
    extends typingsSlinky.streamMock.objectWritableMockMod.default {
    def this(options: WritableOptions) = this()
  }
  
  @js.native
  class WritableMock ()
    extends typingsSlinky.streamMock.writableMockMod.default {
    def this(options: WritableOptions) = this()
  }
}
