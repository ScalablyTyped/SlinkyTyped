package typingsSlinky.streamMock

import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.streamMod.WritableOptions
import typingsSlinky.streamMock.iwritablemockMod.IWritableMock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stream-mock/lib/writable/BufferWritableMock", JSImport.Namespace)
@js.native
object bufferWritableMockMod extends js.Object {
  
  @js.native
  trait BufferWritableMock extends IWritableMock {
    
    def _write(
      chunk: String,
      encoding: BufferEncoding,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def _write(
      chunk: Buffer,
      encoding: BufferEncoding,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    @JSName("data")
    var data_BufferWritableMock: js.Array[Buffer] = js.native
    
    @JSName("flatData")
    var flatData_BufferWritableMock: Buffer = js.native
  }
  
  @js.native
  class default () extends BufferWritableMock {
    def this(options: WritableOptions) = this()
  }
}
