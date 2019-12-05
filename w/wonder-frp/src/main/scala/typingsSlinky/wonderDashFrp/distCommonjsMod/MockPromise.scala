package typingsSlinky.wonderDashFrp.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MockPromise")
@js.native
class MockPromise protected ()
  extends typingsSlinky.wonderDashFrp.distCommonjsTestingMockPromiseMod.MockPromise {
  def this(
    scheduler: typingsSlinky.wonderDashFrp.distCommonjsTestingTestSchedulerMod.TestScheduler,
    messages: js.Array[typingsSlinky.wonderDashFrp.distCommonjsTestingRecordMod.Record]
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MockPromise")
@js.native
object MockPromise extends js.Object {
  def create(
    scheduler: typingsSlinky.wonderDashFrp.distCommonjsTestingTestSchedulerMod.TestScheduler,
    messages: js.Array[typingsSlinky.wonderDashFrp.distCommonjsTestingRecordMod.Record]
  ): typingsSlinky.wonderDashFrp.distCommonjsTestingMockPromiseMod.MockPromise = js.native
}

