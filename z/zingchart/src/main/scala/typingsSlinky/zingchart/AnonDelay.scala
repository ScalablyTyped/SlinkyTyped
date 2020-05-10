package typingsSlinky.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDelay extends js.Object {
  /**
    * Sets the delay in milliseconds between each step of the animation. 5 | 10 | ...
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Sets the type of animation effect. ANIMATION_FADE_IN | ANIMATION_EXPAND_VERTICAL | 1 | 2 | ...
    */
  var effect: js.UndefOr[Double] = js.native
  /**
    * Sets the method used for each animation effect. ANIMATION_LINEAR | ANIMATION_BACK_EASE_OUT | 0 | 1 | ...
    */
  var method: js.UndefOr[Double] = js.native
  /**
    * Determines whether or not animation occurs when a change is made to the chart via an API event (e.g., adding node, adding plot, re
    * moving node). true (default) | false | 1 | 0
    */
  var `on-change`: js.UndefOr[Boolean] = js.native
  /**
    * Determines whether or not animation occurs when users toggle legend items on and off. Note that in the "legend" object, the "toggl
    * e-action" attribute must be set to "remove". true (default) | false | 1 | 0
    */
  var `on-legend-toggle`: js.UndefOr[Boolean] = js.native
  /**
    * Determines animation groups. ANIMATION_NO_SEQUENCE | ANIMATION_BY_PLOT | 0 | 1 | ...
    */
  var sequence: js.UndefOr[Double] = js.native
  /**
    * Sets the length of the animation in milliseconds. ANIMATION_SLOW | ANIMATION_FAST | 1000 | 4000 | ...
    */
  var speed: js.UndefOr[Double] = js.native
}

object AnonDelay {
  @scala.inline
  def apply(): AnonDelay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDelay]
  }
  @scala.inline
  implicit class AnonDelayOps[Self <: AnonDelay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withEffect(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def `withOn-change`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on-change")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOn-change`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on-change")(js.undefined)
        ret
    }
    @scala.inline
    def `withOn-legend-toggle`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on-legend-toggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOn-legend-toggle`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on-legend-toggle")(js.undefined)
        ret
    }
    @scala.inline
    def withSequence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
  }
  
}

