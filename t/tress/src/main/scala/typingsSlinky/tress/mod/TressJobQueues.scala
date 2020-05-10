package typingsSlinky.tress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TressJobQueues extends js.Object {
  var failed: js.Array[TressJobData] = js.native
  var finished: js.Array[TressJobData] = js.native
  var waiting: js.Array[TressJobData] = js.native
}

object TressJobQueues {
  @scala.inline
  def apply(failed: js.Array[TressJobData], finished: js.Array[TressJobData], waiting: js.Array[TressJobData]): TressJobQueues = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[TressJobQueues]
  }
  @scala.inline
  implicit class TressJobQueuesOps[Self <: TressJobQueues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailed(value: js.Array[TressJobData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinished(value: js.Array[TressJobData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finished")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaiting(value: js.Array[TressJobData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waiting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

