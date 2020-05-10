package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary of options for the <Titanium.UI.Window.open> method.
  */
@js.native
trait openWindowParams extends js.Object {
  /**
  	 * Animation resource to run on the activity being opened.
  	 */
  var activityEnterAnimation: js.UndefOr[Double] = js.native
  /**
  	 * Animation resource to run on the activity that is being put in background as a window is being opened above it.
  	 */
  var activityExitAnimation: js.UndefOr[Double] = js.native
  /**
  	 * Determines whether to use an animated effect when the window is shown.
  	 */
  var animated: js.UndefOr[Boolean] = js.native
  /**
  	 * Window's bottom position, in platform-specific units.
  	 */
  var bottom: js.UndefOr[Double | java.lang.String] = js.native
  /**
  	 * Indicates whether the window enforces modal behaviour.
  	 */
  var forceModal: js.UndefOr[Boolean] = js.native
  /**
  	 * Determines if the window is fullscreen.
  	 */
  var fullscreen: js.UndefOr[Boolean] = js.native
  /**
  	 * Window's height, in platform-specific units.
  	 */
  var height: js.UndefOr[Double | java.lang.String] = js.native
  /**
  	 * Window's left position, in platform-specific units.
  	 */
  var left: js.UndefOr[Double | java.lang.String] = js.native
  /**
  	 * Determines whether to open the window modal in front of other windows.
  	 */
  var modal: js.UndefOr[Boolean] = js.native
  /**
  	 * Presentation style of this modal window.
  	 */
  var modalStyle: js.UndefOr[Double] = js.native
  /**
  	 * Transition style of this modal window.
  	 */
  var modalTransitionStyle: js.UndefOr[Double] = js.native
  /**
  	 * For modal windows, hides the nav bar (`true`) or shows the nav bar (`false`).
  	 */
  var navBarHidden: js.UndefOr[Boolean] = js.native
  /**
  	 * Window's right position, in platform-specific units.
  	 */
  var right: js.UndefOr[Double | java.lang.String] = js.native
  /**
  	 * Window's top position, in platform-specific units.
  	 */
  var top: js.UndefOr[Double | java.lang.String] = js.native
  /**
  	 * Transition style of this non-modal window.
  	 */
  var transition: js.UndefOr[Double] = js.native
  /**
  	 * Window's width, in platform-specific units.
  	 */
  var width: js.UndefOr[Double | java.lang.String] = js.native
}

object openWindowParams {
  @scala.inline
  def apply(): openWindowParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[openWindowParams]
  }
  @scala.inline
  implicit class openWindowParamsOps[Self <: openWindowParams] (val x: Self) extends AnyVal {
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
    def withBottom(value: Double | java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withForceModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceModal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceModal")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Double | java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(js.undefined)
        ret
    }
    @scala.inline
    def withModalStyle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withModalTransitionStyle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalTransitionStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalTransitionStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalTransitionStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withNavBarHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navBarHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavBarHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navBarHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: Double | java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Double | java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

