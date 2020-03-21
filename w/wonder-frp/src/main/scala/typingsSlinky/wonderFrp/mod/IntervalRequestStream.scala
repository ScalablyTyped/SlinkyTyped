package typingsSlinky.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "IntervalRequestStream")
@js.native
class IntervalRequestStream protected ()
  extends typingsSlinky.wonderFrp.intervalRequestStreamMod.IntervalRequestStream {
  def this(scheduler: typingsSlinky.wonderFrp.schedulerMod.Scheduler) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "IntervalRequestStream")
@js.native
object IntervalRequestStream extends js.Object {
  def create(scheduler: typingsSlinky.wonderFrp.schedulerMod.Scheduler): typingsSlinky.wonderFrp.intervalRequestStreamMod.IntervalRequestStream = js.native
}

