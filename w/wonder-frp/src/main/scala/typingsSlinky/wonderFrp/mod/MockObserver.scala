package typingsSlinky.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MockObserver")
@js.native
class MockObserver protected ()
  extends typingsSlinky.wonderFrp.mockObserverMod.MockObserver {
  def this(scheduler: typingsSlinky.wonderFrp.testSchedulerMod.TestScheduler) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MockObserver")
@js.native
object MockObserver extends js.Object {
  def create(scheduler: typingsSlinky.wonderFrp.testSchedulerMod.TestScheduler): typingsSlinky.wonderFrp.mockObserverMod.MockObserver = js.native
}

