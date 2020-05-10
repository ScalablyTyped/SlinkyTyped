package typingsSlinky.xrm.Xrm.Navigation

import typingsSlinky.xrm.Xrm.Navigation.NavigationOptions.SizeValue
import typingsSlinky.xrm.xrmNumbers.`1`
import typingsSlinky.xrm.xrmNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for navigating to a page: whether to open inline or in a dialog. If you don't specify this parameter, page is opened inline by default.
  * */
@js.native
trait NavigationOptions_ extends js.Object {
  /**
    * The width of dialog. To specify the width in pixels, just type a numeric value. To specify the width in percentage, specify an object of type
    * */
  var height: js.UndefOr[Double | SizeValue] = js.native
  /**
    * Specify 1 to open the dialog in center; 2 to open the dialog on the side. Default is 1 (center).
    * */
  var position: js.UndefOr[`1` | `2`] = js.native
  /**
    * Specify 1 to open the page inline; 2 to open the page in a dialog.
    * Entity lists can only be opened inline; web resources can be opened either inline or in a dialog.
    * */
  var target: `1` | `2` = js.native
  /**
    * The width of dialog. To specify the width in pixels, just type a numeric value. To specify the width in percentage, specify an object of type
    * */
  var width: js.UndefOr[Double | SizeValue] = js.native
}

object NavigationOptions_ {
  @scala.inline
  def apply(target: `1` | `2`): NavigationOptions_ = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationOptions_]
  }
  @scala.inline
  implicit class NavigationOptions_Ops[Self <: NavigationOptions_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget(value: `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double | SizeValue): Self = {
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
    def withPosition(value: `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | SizeValue): Self = {
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

