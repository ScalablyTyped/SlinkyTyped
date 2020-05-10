package typingsSlinky.three.pathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathAction extends js.Object {
  var action: PathActions = js.native
  var args: js.Any = js.native
}

object PathAction {
  @scala.inline
  def apply(action: PathActions, args: js.Any): PathAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAction]
  }
  @scala.inline
  implicit class PathActionOps[Self <: PathAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: PathActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

