package typingsSlinky.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "MockPromise")
@js.native
class MockPromise protected ()
  extends typingsSlinky.wonderFrp.testingMockPromiseMod.MockPromise {
  def this(
    scheduler: typingsSlinky.wonderFrp.testingTestSchedulerMod.TestScheduler,
    messages: js.Array[typingsSlinky.wonderFrp.testingRecordMod.Record]
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "MockPromise")
@js.native
object MockPromise extends js.Object {
  def create(
    scheduler: typingsSlinky.wonderFrp.testingTestSchedulerMod.TestScheduler,
    messages: js.Array[typingsSlinky.wonderFrp.testingRecordMod.Record]
  ): typingsSlinky.wonderFrp.testingMockPromiseMod.MockPromise = js.native
}

