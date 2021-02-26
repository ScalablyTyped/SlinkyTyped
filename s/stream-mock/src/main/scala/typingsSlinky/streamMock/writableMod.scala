package typingsSlinky.streamMock

import typingsSlinky.node.streamMod.WritableOptions
import typingsSlinky.streamMock.bufferWritableMockMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writableMod {
  
  @JSImport("stream-mock/lib/writable", "BufferWritableMock")
  @js.native
  class BufferWritableMock () extends default {
    def this(options: WritableOptions) = this()
  }
  
  @JSImport("stream-mock/lib/writable", "ObjectWritableMock")
  @js.native
  class ObjectWritableMock ()
    extends typingsSlinky.streamMock.objectWritableMockMod.default {
    def this(options: WritableOptions) = this()
  }
  
  @JSImport("stream-mock/lib/writable", "WritableMock")
  @js.native
  class WritableMock ()
    extends typingsSlinky.streamMock.writableMockMod.default {
    def this(options: WritableOptions) = this()
  }
}
