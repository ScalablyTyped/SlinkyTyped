package typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery

import typingsSlinky.ts3NodejsLibrary.commandMod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueItem extends js.Object {
  var cmd: Command = js.native
  var fulfill: js.Function = js.native
  var priority: Boolean = js.native
  var reject: js.Function = js.native
}

object QueueItem {
  @scala.inline
  def apply(cmd: Command, fulfill: js.Function, priority: Boolean, reject: js.Function): QueueItem = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], fulfill = fulfill.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], reject = reject.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueItem]
  }
  @scala.inline
  implicit class QueueItemOps[Self <: QueueItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCmd(value: Command): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFulfill(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReject(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

