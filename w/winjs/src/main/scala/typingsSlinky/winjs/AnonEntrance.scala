package typingsSlinky.winjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEntrance extends js.Object {
  var entrance: js.Function = js.native
  var exit: js.Function = js.native
}

object AnonEntrance {
  @scala.inline
  def apply(entrance: js.Function, exit: js.Function): AnonEntrance = {
    val __obj = js.Dynamic.literal(entrance = entrance.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEntrance]
  }
  @scala.inline
  implicit class AnonEntranceOps[Self <: AnonEntrance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntrance(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entrance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExit(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

