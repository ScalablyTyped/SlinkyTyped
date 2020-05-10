package typingsSlinky.yandexMaps

import typingsSlinky.yandexMaps.yandexMapsStrings.auto
import typingsSlinky.yandexMaps.yandexMapsStrings.large
import typingsSlinky.yandexMaps.yandexMapsStrings.left
import typingsSlinky.yandexMaps.yandexMapsStrings.medium
import typingsSlinky.yandexMaps.yandexMapsStrings.none
import typingsSlinky.yandexMaps.yandexMapsStrings.right
import typingsSlinky.yandexMaps.yandexMapsStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdjustMapMargin extends js.Object {
  var adjustMapMargin: js.UndefOr[Boolean] = js.native
  var collapseOnBlur: js.UndefOr[Boolean] = js.native
  var float: js.UndefOr[none | left | right] = js.native
  var floatIndex: js.UndefOr[Double] = js.native
  var popupAnimate: js.UndefOr[Boolean] = js.native
  var popupFloat: js.UndefOr[auto | left | right] = js.native
  var popupWidth: js.UndefOr[String] = js.native
  var position: js.UndefOr[AnonBottom] = js.native
  var size: js.UndefOr[auto | small | medium | large] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object AnonAdjustMapMargin {
  @scala.inline
  def apply(): AnonAdjustMapMargin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAdjustMapMargin]
  }
  @scala.inline
  implicit class AnonAdjustMapMarginOps[Self <: AnonAdjustMapMargin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustMapMargin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustMapMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjustMapMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustMapMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseOnBlur(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseOnBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseOnBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withFloat(value: none | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupAnimate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupAnimate")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupFloat(value: auto | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupFloat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupFloat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupFloat")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: AnonBottom): Self = {
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
    def withSize(value: auto | small | medium | large): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

