package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary of options for <Titanium.UI.iPad.Popover.show>.
  */
@js.native
trait ShowPopoverParams extends js.Object {
  /**
  	 * Indicates whether to animate showing the popover.
  	 */
  var animated: js.UndefOr[Boolean] = js.native
  /**
  	 * Sets the arrow position of the popover relative to the attached view object's dimensions
  	 * when showing the popover.
  	 */
  var rect: js.UndefOr[Dimension] = js.native
  /**
  	 * Attaches the popover to the specified view when showing the popover.
  	 */
  var view: View = js.native
}

object ShowPopoverParams {
  @scala.inline
  def apply(view: View): ShowPopoverParams = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowPopoverParams]
  }
  @scala.inline
  implicit class ShowPopoverParamsOps[Self <: ShowPopoverParams] (val x: Self) extends AnyVal {
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
    def withRect(value: Dimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rect")(js.undefined)
        ret
    }
  }
  
}

