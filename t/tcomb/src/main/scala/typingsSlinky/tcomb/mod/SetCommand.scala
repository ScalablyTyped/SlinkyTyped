package typingsSlinky.tcomb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetCommand extends Command {
  @JSName("$set")
  var $set: js.Any = js.native
}

object SetCommand {
  @scala.inline
  def apply($set: js.Any): SetCommand = {
    val __obj = js.Dynamic.literal($set = $set.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCommand]
  }
  @scala.inline
  implicit class SetCommandOps[Self <: SetCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$set(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$set")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

