package typingsSlinky.wonderFrp

import typingsSlinky.wonderFrp.baseStreamMod.BaseStream
import typingsSlinky.wonderFrp.recordMod.Record
import typingsSlinky.wonderFrp.testSchedulerMod.TestScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/testing/TestStream", JSImport.Namespace)
@js.native
object testStreamMod extends js.Object {
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

