package typingsSlinky.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "IntervalStream")
@js.native
class IntervalStream protected ()
  extends typingsSlinky.wonderFrp.intervalStreamMod.IntervalStream {
  def this(interval: Double, scheduler: typingsSlinky.wonderFrp.schedulerMod.Scheduler) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "IntervalStream")
@js.native
object IntervalStream extends js.Object {
  def create(interval: Double, scheduler: typingsSlinky.wonderFrp.schedulerMod.Scheduler): typingsSlinky.wonderFrp.intervalStreamMod.IntervalStream = js.native
}

