package typingsSlinky.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "TestScheduler")
@js.native
class TestScheduler protected ()
  extends typingsSlinky.wonderFrp.testingTestSchedulerMod.TestScheduler {
  def this(isReset: Boolean) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "TestScheduler")
@js.native
object TestScheduler extends js.Object {
  def completed(tick: js.Any): typingsSlinky.wonderFrp.testingRecordMod.Record = js.native
  def create(): typingsSlinky.wonderFrp.testingTestSchedulerMod.TestScheduler = js.native
  def create(isReset: Boolean): typingsSlinky.wonderFrp.testingTestSchedulerMod.TestScheduler = js.native
  def error(tick: js.Any, error: js.Any): typingsSlinky.wonderFrp.testingRecordMod.Record = js.native
  def next(tick: js.Any, value: js.Any): typingsSlinky.wonderFrp.testingRecordMod.Record = js.native
}

