package typingsSlinky.tcomb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushCommand extends Command {
  @JSName("$push")
  var $push: js.Array[_] = js.native
}

object PushCommand {
  @scala.inline
  def apply($push: js.Array[_]): PushCommand = {
    val __obj = js.Dynamic.literal($push = $push.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushCommand]
  }
  @scala.inline
  implicit class PushCommandOps[Self <: PushCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$push(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$push")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

