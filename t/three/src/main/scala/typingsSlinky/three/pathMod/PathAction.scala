package typingsSlinky.three.pathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathAction extends js.Object {
  var action: PathActions
  var args: js.Any
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: PathActions): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgs(value: js.Any): Self = this.set("args", value.asInstanceOf[js.Any])
  }
  
}

