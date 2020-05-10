package typingsSlinky.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoplayOptions extends js.Object {
  /**
    * Delay between transitions (in ms). If this parameter is not specified, auto play will be disabled
    *
    * If you need to specify different delay for specifi slides you can do it by using
    * data-swiper-autoplay (in ms) attribute on slide.
    *
    * @example
    * <!-- hold this slide for 2 seconds -->
    * <div class="swiper-slide" data-swiper-autoplay="2000">
    *
    * @default 3000
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Set to false and autoplay will not be disabled after
    * user interactions (swipes), it will be restarted
    * every time after interaction
    *
    * @default true
    */
  var disableOnInteraction: js.UndefOr[Boolean] = js.native
  /**
    * Enables autoplay in reverse direction
    *
    * @default false
    */
  var reverseDirection: js.UndefOr[Boolean] = js.native
  /**
    * Enable this parameter and autoplay will be stopped when it reaches last slide (has no effect in loop mode)
    *
    * @default false
    */
  var stopOnLastSlide: js.UndefOr[Boolean] = js.native
  /**
    * When enabled autoplay will wait for wrapper transition to continue.
    * Can be disabled in case of using Virtual Translate when your
    * slider may not have transition
    *
    * @default true
    */
  var waitForTransition: js.UndefOr[Boolean] = js.native
}

object AutoplayOptions {
  @scala.inline
  def apply(): AutoplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoplayOptions]
  }
  @scala.inline
  implicit class AutoplayOptionsOps[Self <: AutoplayOptions] (val x: Self) extends AnyVal {
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
    def withDisableOnInteraction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableOnInteraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableOnInteraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableOnInteraction")(js.undefined)
        ret
    }
    @scala.inline
    def withReverseDirection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverseDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withStopOnLastSlide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOnLastSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopOnLastSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOnLastSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForTransition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForTransition")(js.undefined)
        ret
    }
  }
  
}

