package typingsSlinky.wonderDashFrp

import typingsSlinky.wonderDashFrp.distCommonjsStreamBaseStreamMod.BaseStream
import typingsSlinky.wonderDashFrp.distCommonjsTestingRecordMod.Record
import typingsSlinky.wonderDashFrp.distCommonjsTestingTestSchedulerMod.TestScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/testing/TestStream", JSImport.Namespace)
@js.native
object distCommonjsTestingTestStreamMod extends js.Object {
  @js.native
  class TestStream protected () extends BaseStream {
    def this(messages: js.Array[Record], scheduler: TestScheduler) = this()
    var _messages: js.Any = js.native
    @JSName("scheduler")
    var scheduler_TestStream: TestScheduler = js.native
  }
  
  /* static members */
  @js.native
  object TestStream extends js.Object {
    def create(messages: js.Array[Record], scheduler: TestScheduler): TestStream = js.native
  }
  
}

