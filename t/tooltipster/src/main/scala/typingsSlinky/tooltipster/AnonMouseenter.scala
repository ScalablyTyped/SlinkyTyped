package typingsSlinky.tooltipster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMouseenter extends js.Object {
  /**
  			 * When the origin is clicked by a mouse.
  			 */
  var click: js.UndefOr[Boolean] = js.native
  /**
  			 * When a mouse comes over the origin. The delay option is taken into account as the delay before 
  			 * opening.
  			 */
  var mouseenter: js.UndefOr[Boolean] = js.native
  /**
  			 * When the origin is tapped (ie pressed and then released) on a touch screen.
  			 */
  var tap: js.UndefOr[Boolean] = js.native
  /**
  			 * When the origin is pressed on a touch screen. The delayTouch option is taken into account as the 
  			 * delay before opening.
  			 */
  var touchstart: js.UndefOr[Boolean] = js.native
}

object AnonMouseenter {
  @scala.inline
  def apply(): AnonMouseenter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMouseenter]
  }
  @scala.inline
  implicit class AnonMouseenterOps[Self <: AnonMouseenter] (val x: Self) extends AnyVal {
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
    def withMouseenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseenter")(js.undefined)
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
    def withTouchstart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(js.undefined)
        ret
    }
  }
  
}

