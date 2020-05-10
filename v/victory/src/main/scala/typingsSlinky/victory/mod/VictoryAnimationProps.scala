package typingsSlinky.victory.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VictoryAnimationProps extends js.Object {
  /**
    * The child of should be a function that takes an object of tweened values and returns a component to render.
    * @param style
    */
  var children: js.UndefOr[js.Function1[/* style */ AnimationStyle, ReactElement]] = js.native
  /**
    * The data prop specifies the latest set of values to tween to.
    * When this prop changes, VictoryAnimation will begin animating from the current value to the new value.
    * When given an array of values, VictoryAnimation will use it as an animation queue.
    * @default {}
    */
  var data: js.UndefOr[AnimationData] = js.native
  /**
    * The delay prop specifies a delay in milliseconds before the animation begins.
    * If multiple values are in the animation queue, it is the delay between each animation.
    * @default 0
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * The number of milliseconds the animation should take to complete.
    * @default 1000
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * The easing prop specifies an easing function name to use for tweening.
    * @default "quadInOut"
    */
  var easing: js.UndefOr[AnimationEasing] = js.native
  /**
    * The onEnd prop specifies a function to run when the animation ends. If multiple animations are in the queue, it is called after the last animation.
    */
  var onEnd: js.UndefOr[js.Function0[Unit]] = js.native
}

object VictoryAnimationProps {
  @scala.inline
  def apply(): VictoryAnimationProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryAnimationProps]
  }
  @scala.inline
  implicit class VictoryAnimationPropsOps[Self <: VictoryAnimationProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: /* style */ AnimationStyle => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: AnimationData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: AnimationEasing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.undefined)
        ret
    }
  }
  
}

