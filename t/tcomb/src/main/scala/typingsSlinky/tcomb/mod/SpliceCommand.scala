package typingsSlinky.tcomb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpliceCommand extends Command {
  @JSName("$splice")
  var $splice: js.Array[js.Array[_]] = js.native
}

object SpliceCommand {
  @scala.inline
  def apply($splice: js.Array[js.Array[_]]): SpliceCommand = {
    val __obj = js.Dynamic.literal($splice = $splice.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpliceCommand]
  }
  @scala.inline
  implicit class SpliceCommandOps[Self <: SpliceCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$splice(value: js.Array[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$splice")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

