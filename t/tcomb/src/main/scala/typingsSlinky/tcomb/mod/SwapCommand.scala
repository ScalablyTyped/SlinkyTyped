package typingsSlinky.tcomb.mod

import typingsSlinky.tcomb.anon.From
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwapCommand extends Command {
  @JSName("$swap")
  var $swap: From = js.native
}

object SwapCommand {
  @scala.inline
  def apply($swap: From): SwapCommand = {
    val __obj = js.Dynamic.literal($swap = $swap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwapCommand]
  }
  @scala.inline
  implicit class SwapCommandOps[Self <: SwapCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$swap(value: From): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$swap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

