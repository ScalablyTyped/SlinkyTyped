package typingsSlinky.tcomb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeCommand extends Command {
  @JSName("$merge")
  var $merge: js.Object = js.native
}

object MergeCommand {
  @scala.inline
  def apply($merge: js.Object): MergeCommand = {
    val __obj = js.Dynamic.literal($merge = $merge.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeCommand]
  }
  @scala.inline
  implicit class MergeCommandOps[Self <: MergeCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$merge(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$merge")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

