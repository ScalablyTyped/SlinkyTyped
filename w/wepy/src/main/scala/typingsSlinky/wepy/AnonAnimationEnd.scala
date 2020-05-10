package typingsSlinky.wepy

import typingsSlinky.wepy.wxEnhancedMod.LagLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnimationEnd extends js.Object {
  var autoRotate: Boolean = js.native
  var destination: LagLng = js.native
  var duration: Double = js.native
  var markerId: Double = js.native
  def animationEnd(): Unit = js.native
}

object AnonAnimationEnd {
  @scala.inline
  def apply(
    animationEnd: () => Unit,
    autoRotate: Boolean,
    destination: LagLng,
    duration: Double,
    markerId: Double
  ): AnonAnimationEnd = {
    val __obj = js.Dynamic.literal(animationEnd = js.Any.fromFunction0(animationEnd), autoRotate = autoRotate.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], markerId = markerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimationEnd]
  }
  @scala.inline
  implicit class AnonAnimationEndOps[Self <: AnonAnimationEnd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAutoRotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination(value: LagLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

