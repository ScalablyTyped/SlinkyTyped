package typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics

import typingsSlinky.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods that enable you to retrieve the parameters of an opacity (fade in or fade out) animation. */
@js.native
trait OpacityAnimation extends js.Object {
  /** Gets the location of the first control point for the cubic Bézier curve that describes how the opacity should animate over time. */
  var control1: Point = js.native
  /** Gets the location of the second control point for the cubic Bézier curve that describes how the opacity should animate over time. */
  var control2: Point = js.native
  /** Gets the amount of time between when the opacity animation is instructed to begin and when that animation actually begins to draw. */
  var delay: Double = js.native
  /** Gets the amount of time over which the opacity animation should be performed. This does not include the delay. */
  var duration: Double = js.native
  /** Gets the object's final opacity. */
  var finalOpacity: Double = js.native
  /** Gets the object's initial opacity. */
  var initialOpacity: Double = js.native
  /** Gets the type of animation represented by this object. */
  var `type`: PropertyAnimationType = js.native
}

object OpacityAnimation {
  @scala.inline
  def apply(
    control1: Point,
    control2: Point,
    delay: Double,
    duration: Double,
    finalOpacity: Double,
    initialOpacity: Double,
    `type`: PropertyAnimationType
  ): OpacityAnimation = {
    val __obj = js.Dynamic.literal(control1 = control1.asInstanceOf[js.Any], control2 = control2.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], finalOpacity = finalOpacity.asInstanceOf[js.Any], initialOpacity = initialOpacity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacityAnimation]
  }
  @scala.inline
  implicit class OpacityAnimationOps[Self <: OpacityAnimation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControl1(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControl2(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinalOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PropertyAnimationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

