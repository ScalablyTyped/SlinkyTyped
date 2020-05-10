package typingsSlinky.tcomb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveCommand extends Command {
  @JSName("$remove")
  var $remove: js.Array[java.lang.String] = js.native
}

object RemoveCommand {
  @scala.inline
  def apply($remove: js.Array[java.lang.String]): RemoveCommand = {
    val __obj = js.Dynamic.literal($remove = $remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveCommand]
  }
  @scala.inline
  implicit class RemoveCommandOps[Self <: RemoveCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$remove(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$remove")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

