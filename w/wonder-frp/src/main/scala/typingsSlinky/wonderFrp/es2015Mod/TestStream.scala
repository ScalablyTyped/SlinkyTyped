package typingsSlinky.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "TestStream")
@js.native
class TestStream protected ()
  extends typingsSlinky.wonderFrp.testingTestStreamMod.TestStream {
  def this(
    messages: js.Array[typingsSlinky.wonderFrp.testingRecordMod.Record],
    scheduler: typingsSlinky.wonderFrp.testingTestSchedulerMod.TestScheduler
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "TestStream")
@js.native
object TestStream extends js.Object {
  def create(
    messages: js.Array[typingsSlinky.wonderFrp.testingRecordMod.Record],
    scheduler: typingsSlinky.wonderFrp.testingTestSchedulerMod.TestScheduler
  ): typingsSlinky.wonderFrp.testingTestStreamMod.TestStream = js.native
}

