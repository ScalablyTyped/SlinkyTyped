package typingsSlinky.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MockPromise")
@js.native
class MockPromise protected ()
  extends typingsSlinky.wonderFrp.mockPromiseMod.MockPromise {
  def this(
    scheduler: typingsSlinky.wonderFrp.testSchedulerMod.TestScheduler,
    messages: js.Array[typingsSlinky.wonderFrp.recordMod.Record]
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MockPromise")
@js.native
object MockPromise extends js.Object {
  def create(
    scheduler: typingsSlinky.wonderFrp.testSchedulerMod.TestScheduler,
    messages: js.Array[typingsSlinky.wonderFrp.recordMod.Record]
  ): typingsSlinky.wonderFrp.mockPromiseMod.MockPromise = js.native
}

