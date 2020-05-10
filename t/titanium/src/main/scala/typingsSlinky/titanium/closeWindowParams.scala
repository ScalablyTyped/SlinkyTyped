package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary of options for the <Titanium.UI.Window.close> method.
  */
@js.native
trait closeWindowParams extends js.Object {
  /**
  	 * Animation resource to use for the incoming activity.
  	 */
  var activityEnterAnimation: js.UndefOr[Double] = js.native
  /**
  	 * Animation resource to use for the outgoing activity.
  	 */
  var activityExitAnimation: js.UndefOr[Double] = js.native
  /**
  	 * Determines whether to use an animated effect when the window is closed. Defaults to `true` on Android, `false` on iOS.
  	 */
  var animated: js.UndefOr[Boolean] = js.native
  /**
  	 * duration of the animation in milliseconds
  	 */
  var animationDuration: js.UndefOr[Double] = js.native
  /**
  	 * Transition type to use during a transition animation.
  	 */
  var animationStyle: js.UndefOr[Double] = js.native
}

object closeWindowParams {
  @scala.inline
  def apply(): closeWindowParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[closeWindowParams]
  }
  @scala.inline
  implicit class closeWindowParamsOps[Self <: closeWindowParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityEnterAnimation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityEnterAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityEnterAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityEnterAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityExitAnimation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityExitAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityExitAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityExitAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationStyle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationStyle")(js.undefined)
        ret
    }
  }
  
}

