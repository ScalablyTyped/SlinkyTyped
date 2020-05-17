package typingsSlinky.winrtUwp.Windows.Perception.People

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeadPose extends js.Object {
  var forwardDirection: js.Any = js.native
   /* unmapped type */ var position: js.Any = js.native
   /* unmapped type */ var upDirection: js.Any = js.native
}

object HeadPose {
  @scala.inline
  def apply(forwardDirection: js.Any, position: js.Any, upDirection: js.Any): HeadPose = {
    val __obj = js.Dynamic.literal(forwardDirection = forwardDirection.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], upDirection = upDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadPose]
  }
  @scala.inline
  implicit class HeadPoseOps[Self <: HeadPose] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForwardDirection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpDirection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upDirection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

