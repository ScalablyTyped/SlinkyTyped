package typingsSlinky.victory.mod

import typingsSlinky.victory.anon.After
import typingsSlinky.victory.anon.Before
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimatePropTypeInterface extends js.Object {
  /**
    * Animation duration
    */
  var duration: Double = js.native
  /**
    * The easing prop specifies an easing function name to use for tweening.
    * @default "quadInOut"
    */
  var easing: js.UndefOr[AnimationEasing] = js.native
  /**
    * Animation end callback
    */
  var onEnd: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Animation enter transition configuration
    */
  var onEnter: js.UndefOr[After] = js.native
  /**
    * Animation exit transition configuration
    */
  var onExit: js.UndefOr[Before] = js.native
  /**
    * Animation load transition configuration
    */
  var onLoad: js.UndefOr[After] = js.native
}

object AnimatePropTypeInterface {
  @scala.inline
  def apply(duration: Double): AnimatePropTypeInterface = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatePropTypeInterface]
  }
  @scala.inline
  implicit class AnimatePropTypeInterfaceOps[Self <: AnimatePropTypeInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withOnEnter(value: After): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExit(value: Before): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: After): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
  }
  
}

