package typingsSlinky.yandexMaps.anon

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

trait AdjustMapMargin extends js.Object {
  var adjustMapMargin: js.UndefOr[Boolean] = js.undefined
  var collapseOnBlur: js.UndefOr[Boolean] = js.undefined
  var float: js.UndefOr[none | left | right] = js.undefined
  var floatIndex: js.UndefOr[Double] = js.undefined
  var popupAnimate: js.UndefOr[Boolean] = js.undefined
  var popupFloat: js.UndefOr[auto | left | right] = js.undefined
  var popupWidth: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[Bottom] = js.undefined
  var size: js.UndefOr[auto | small | medium | large] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AdjustMapMargin {
  @scala.inline
  def apply(): AdjustMapMargin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdjustMapMargin]
  }
  @scala.inline
  implicit class AdjustMapMarginOps[Self <: AdjustMapMargin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdjustMapMargin(value: Boolean): Self = this.set("adjustMapMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjustMapMargin: Self = this.set("adjustMapMargin", js.undefined)
    @scala.inline
    def setCollapseOnBlur(value: Boolean): Self = this.set("collapseOnBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseOnBlur: Self = this.set("collapseOnBlur", js.undefined)
    @scala.inline
    def setFloat(value: none | left | right): Self = this.set("float", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloat: Self = this.set("float", js.undefined)
    @scala.inline
    def setFloatIndex(value: Double): Self = this.set("floatIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatIndex: Self = this.set("floatIndex", js.undefined)
    @scala.inline
    def setPopupAnimate(value: Boolean): Self = this.set("popupAnimate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupAnimate: Self = this.set("popupAnimate", js.undefined)
    @scala.inline
    def setPopupFloat(value: auto | left | right): Self = this.set("popupFloat", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupFloat: Self = this.set("popupFloat", js.undefined)
    @scala.inline
    def setPopupWidth(value: String): Self = this.set("popupWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupWidth: Self = this.set("popupWidth", js.undefined)
    @scala.inline
    def setPosition(value: Bottom): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSize(value: auto | small | medium | large): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

