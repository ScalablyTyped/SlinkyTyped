package typingsSlinky.yandexMaps.mod

import typingsSlinky.yandexMaps.AnonHref
import typingsSlinky.yandexMaps.yandexMapsStrings.clusterNumbersignballoonAccordion
import typingsSlinky.yandexMaps.yandexMapsStrings.clusterNumbersignballoonCarousel
import typingsSlinky.yandexMaps.yandexMapsStrings.clusterNumbersignballoonTwoColumns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClusterPlacemarkOptions extends js.Object {
  var balloonContentLayout: js.UndefOr[
    clusterNumbersignballoonTwoColumns | clusterNumbersignballoonCarousel | clusterNumbersignballoonAccordion | String | IClassConstructor[ILayout]
  ] = js.native
  var balloonContentLayoutHeight: js.UndefOr[Double] = js.native
  var balloonContentLayoutWidth: js.UndefOr[Double] = js.native
  var balloonItemContentLayout: js.UndefOr[ILayout | String] = js.native
  var balloonPanelContentLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.native
  var cursor: js.UndefOr[String] = js.native
  var disableClickZoom: js.UndefOr[Boolean] = js.native
  var hideIconOnBalloonOpen: js.UndefOr[Boolean] = js.native
  var iconColor: js.UndefOr[String] = js.native
  var iconContentLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.native
  var iconLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.native
  var iconShape: js.UndefOr[IGeometryJson] = js.native
  var icons: js.UndefOr[js.Array[AnonHref]] = js.native
  var interactivityModel: js.UndefOr[InteractivityModelKey] = js.native
  var numbers: js.UndefOr[js.Array[Double]] = js.native
  var openBalloonOnClick: js.UndefOr[Boolean] = js.native
  var openEmptyHint: js.UndefOr[Boolean] = js.native
  var openHintOnHover: js.UndefOr[Boolean] = js.native
  var zIndexHover: js.UndefOr[Double] = js.native
}

object IClusterPlacemarkOptions {
  @scala.inline
  def apply(): IClusterPlacemarkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClusterPlacemarkOptions]
  }
  @scala.inline
  implicit class IClusterPlacemarkOptionsOps[Self <: IClusterPlacemarkOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBalloonContentLayout(
      value: clusterNumbersignballoonTwoColumns | clusterNumbersignballoonCarousel | clusterNumbersignballoonAccordion | String | IClassConstructor[ILayout]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balloonContentLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBalloonContentLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balloonContentLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withBalloonContentLayoutHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balloonContentLayoutHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBalloonContentLayoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balloonContentLayoutHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withBalloonContentLayoutWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balloonContentLayoutWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBalloonContentLayoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balloonContentLayoutWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBalloonItemContentLayout(value: ILayout | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balloonItemContentLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBalloonItemContentLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balloonItemContentLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withBalloonPanelContentLayout(value: String | IClassConstructor[ILayout]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balloonPanelContentLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBalloonPanelContentLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balloonPanelContentLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableClickZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableClickZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableClickZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableClickZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withHideIconOnBalloonOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideIconOnBalloonOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideIconOnBalloonOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideIconOnBalloonOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withIconColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconColor")(js.undefined)
        ret
    }
    @scala.inline
    def withIconContentLayout(value: String | IClassConstructor[ILayout]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContentLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconContentLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContentLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withIconLayout(value: String | IClassConstructor[ILayout]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withIconShape(value: IGeometryJson): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconShape")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: js.Array[AnonHref]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractivityModel(value: InteractivityModelKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactivityModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractivityModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactivityModel")(js.undefined)
        ret
    }
    @scala.inline
    def withNumbers(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numbers")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenBalloonOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openBalloonOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenBalloonOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openBalloonOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenEmptyHint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openEmptyHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenEmptyHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openEmptyHint")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenHintOnHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openHintOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenHintOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openHintOnHover")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndexHover(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndexHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndexHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndexHover")(js.undefined)
        ret
    }
  }
  
}

