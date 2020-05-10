package typingsSlinky.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationAction extends js.Object {
  var animates: js.Array[Animate] = js.native
  var option: AnimationActionOption = js.native
}

object AnimationAction {
  @scala.inline
  def apply(animates: js.Array[Animate], option: AnimationActionOption): AnimationAction = {
    val __obj = js.Dynamic.literal(animates = animates.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationAction]
  }
  @scala.inline
  implicit class AnimationActionOps[Self <: AnimationAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimates(value: js.Array[Animate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOption(value: AnimationActionOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

