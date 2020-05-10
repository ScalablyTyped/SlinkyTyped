package typingsSlinky.tcomb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnshiftCommand extends Command {
  @JSName("$unshift")
  var $unshift: js.Array[_] = js.native
}

object UnshiftCommand {
  @scala.inline
  def apply($unshift: js.Array[_]): UnshiftCommand = {
    val __obj = js.Dynamic.literal($unshift = $unshift.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnshiftCommand]
  }
  @scala.inline
  implicit class UnshiftCommandOps[Self <: UnshiftCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$unshift(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$unshift")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

