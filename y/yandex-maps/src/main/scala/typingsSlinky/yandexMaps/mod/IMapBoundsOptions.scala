package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMapBoundsOptions extends IMapPositionOptions {
  var preciseZoom: js.UndefOr[Boolean] = js.native
  var zoomMargin: js.UndefOr[js.Array[js.Array[Double] | Double]] = js.native
}

object IMapBoundsOptions {
  @scala.inline
  def apply(): IMapBoundsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapBoundsOptions]
  }
  @scala.inline
  implicit class IMapBoundsOptionsOps[Self <: IMapBoundsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreciseZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preciseZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreciseZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preciseZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomMargin(value: js.Array[js.Array[Double] | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMargin")(js.undefined)
        ret
    }
  }
  
}

