package typingsSlinky.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "IntervalStream")
@js.native
class IntervalStream protected ()
  extends typingsSlinky.wonderFrp.streamIntervalStreamMod.IntervalStream {
  def this(interval: Double, scheduler: typingsSlinky.wonderFrp.coreSchedulerMod.Scheduler) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "IntervalStream")
@js.native
object IntervalStream extends js.Object {
  def create(interval: Double, scheduler: typingsSlinky.wonderFrp.coreSchedulerMod.Scheduler): typingsSlinky.wonderFrp.streamIntervalStreamMod.IntervalStream = js.native
}

