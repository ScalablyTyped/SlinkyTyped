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
  def apply(
    adjustMapMargin: js.UndefOr[Boolean] = js.undefined,
    collapseOnBlur: js.UndefOr[Boolean] = js.undefined,
    float: none | left | right = null,
    floatIndex: js.UndefOr[Double] = js.undefined,
    popupAnimate: js.UndefOr[Boolean] = js.undefined,
    popupFloat: auto | left | right = null,
    popupWidth: String = null,
    position: Bottom = null,
    size: auto | small | medium | large = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AdjustMapMargin = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustMapMargin)) __obj.updateDynamic("adjustMapMargin")(adjustMapMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collapseOnBlur)) __obj.updateDynamic("collapseOnBlur")(collapseOnBlur.get.asInstanceOf[js.Any])
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (!js.isUndefined(floatIndex)) __obj.updateDynamic("floatIndex")(floatIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(popupAnimate)) __obj.updateDynamic("popupAnimate")(popupAnimate.get.asInstanceOf[js.Any])
    if (popupFloat != null) __obj.updateDynamic("popupFloat")(popupFloat.asInstanceOf[js.Any])
    if (popupWidth != null) __obj.updateDynamic("popupWidth")(popupWidth.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjustMapMargin]
  }
}

