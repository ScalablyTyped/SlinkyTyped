package typingsSlinky.winjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entrance extends js.Object {
  var entrance: js.Function = js.native
  var exit: js.Function = js.native
}

object Entrance {
  @scala.inline
  def apply(entrance: js.Function, exit: js.Function): Entrance = {
    val __obj = js.Dynamic.literal(entrance = entrance.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entrance]
  }
  @scala.inline
  implicit class EntranceOps[Self <: Entrance] (val x: Self) extends AnyVal {
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

