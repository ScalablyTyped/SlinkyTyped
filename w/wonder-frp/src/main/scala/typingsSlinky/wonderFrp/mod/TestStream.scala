package typingsSlinky.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "TestStream")
@js.native
class TestStream protected ()
  extends typingsSlinky.wonderFrp.testStreamMod.TestStream {
  def this(
    messages: js.Array[typingsSlinky.wonderFrp.recordMod.Record],
    scheduler: typingsSlinky.wonderFrp.testSchedulerMod.TestScheduler
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "TestStream")
@js.native
object TestStream extends js.Object {
  def create(
    messages: js.Array[typingsSlinky.wonderFrp.recordMod.Record],
    scheduler: typingsSlinky.wonderFrp.testSchedulerMod.TestScheduler
  ): typingsSlinky.wonderFrp.testStreamMod.TestStream = js.native
}

