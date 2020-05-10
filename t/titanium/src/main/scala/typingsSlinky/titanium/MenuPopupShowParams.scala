package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary of options for showing a menu popup with <Titanium.UI.iOS.MenuPopup.show>.
  */
@js.native
trait MenuPopupShowParams extends js.Object {
  /**
  	 * Determines whether the menu popup should be opened or closed animated.
  	 */
  var animated: js.UndefOr[Boolean] = js.native
  /**
  	 * Indicates the arrow direction of the menu popup.
  	 */
  var arrowDirection: js.UndefOr[Double] = js.native
  /**
  	 * The view where the menu pop is shown at.
  	 */
  var view: View = js.native
}

object MenuPopupShowParams {
  @scala.inline
  def apply(view: View): MenuPopupShowParams = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuPopupShowParams]
  }
  @scala.inline
  implicit class MenuPopupShowParamsOps[Self <: MenuPopupShowParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withView(value: View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
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
    def withArrowDirection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowDirection")(js.undefined)
        ret
    }
  }
  
}

