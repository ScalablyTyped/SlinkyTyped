package typingsSlinky.tooltipster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Click extends js.Object {
  /**
  			 * When a mouse click happens anywhere in the page. However, if the interactive option is set to true, 
  			 * a click happening inside the tooltip will not close it.
  			 */
  var click: js.UndefOr[Boolean] = js.native
  /**
  			 * When the mouse goes away from the origin. The delay option is taken into account as the delay before 
  			 * closing.
  			 */
  var mouseleave: js.UndefOr[Boolean] = js.native
  /**
  			 * When the origin is clicked by a mouse. This mimics a behavior that browsers usually have and is meant 
  			 * to be used with the mouseenter open trigger.
  			 */
  var originClick: js.UndefOr[Boolean] = js.native
  /**
  			 * When scrolling happens in the window or in a scrollable area which is a parent of the origin.
  			 */
  var scroll: js.UndefOr[Boolean] = js.native
  /**
  			 * When the finger taps (ie presses and releases) anywhere in the touch screen.
  			 */
  var tap: js.UndefOr[Boolean] = js.native
  /**
  			 * When the finger is removed from the touch screen or if the interaction was stopped by the device. The 
  			 * delayTouch option is taken into account as the delay before closing.
  			 */
  var touchleave: js.UndefOr[Boolean] = js.native
}

object Click {
  @scala.inline
  def apply(): Click = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Click]
  }
  @scala.inline
  implicit class ClickOps[Self <: Click] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseleave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseleave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseleave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseleave")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originClick")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.undefined)
        ret
    }
    @scala.inline
    def withTap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tap")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchleave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchleave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchleave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchleave")(js.undefined)
        ret
    }
  }
  
}

