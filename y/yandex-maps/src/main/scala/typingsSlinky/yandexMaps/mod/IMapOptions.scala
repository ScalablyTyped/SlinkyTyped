package typingsSlinky.yandexMaps.mod

import typingsSlinky.yandexMaps.yandexMapsStrings.always
import typingsSlinky.yandexMaps.yandexMapsStrings.ifNull
import typingsSlinky.yandexMaps.yandexMapsStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMapOptions extends js.Object {
  var autoFitToViewport: js.UndefOr[none | ifNull | always] = js.native
  var avoidFractionalZoom: js.UndefOr[Boolean] = js.native
  var exitFullscreenByEsc: js.UndefOr[Boolean] = js.native
  var fullscreenZIndex: js.UndefOr[Double] = js.native
  var mapAutoFocus: js.UndefOr[Boolean] = js.native
  var maxAnimationZoomDifference: js.UndefOr[Double] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var minZoom: js.UndefOr[Double] = js.native
  var nativeFullscreen: js.UndefOr[Boolean] = js.native
  var projection: js.UndefOr[IProjection] = js.native
  var restrictMapArea: js.UndefOr[Boolean] = js.native
  var suppressMapOpenBlock: js.UndefOr[Boolean] = js.native
  var suppressObsoleteBrowserNotifier: js.UndefOr[Boolean] = js.native
  var yandexMapAutoSwitch: js.UndefOr[Boolean] = js.native
  var yandexMapDisablePoiInteractivity: js.UndefOr[Boolean] = js.native
}

object IMapOptions {
  @scala.inline
  def apply(): IMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapOptions]
  }
  @scala.inline
  implicit class IMapOptionsOps[Self <: IMapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFitToViewport(value: none | ifNull | always): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFitToViewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFitToViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFitToViewport")(js.undefined)
        ret
    }
    @scala.inline
    def withAvoidFractionalZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidFractionalZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoidFractionalZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidFractionalZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withExitFullscreenByEsc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitFullscreenByEsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitFullscreenByEsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitFullscreenByEsc")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreenZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenZIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreenZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenZIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withMapAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapAutoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapAutoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAnimationZoomDifference(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAnimationZoomDifference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAnimationZoomDifference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAnimationZoomDifference")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeFullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeFullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withProjection(value: IProjection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictMapArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictMapArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictMapArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictMapArea")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressMapOpenBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMapOpenBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressMapOpenBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMapOpenBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressObsoleteBrowserNotifier(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressObsoleteBrowserNotifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressObsoleteBrowserNotifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressObsoleteBrowserNotifier")(js.undefined)
        ret
    }
    @scala.inline
    def withYandexMapAutoSwitch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yandexMapAutoSwitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYandexMapAutoSwitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yandexMapAutoSwitch")(js.undefined)
        ret
    }
    @scala.inline
    def withYandexMapDisablePoiInteractivity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yandexMapDisablePoiInteractivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYandexMapDisablePoiInteractivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yandexMapDisablePoiInteractivity")(js.undefined)
        ret
    }
  }
  
}

