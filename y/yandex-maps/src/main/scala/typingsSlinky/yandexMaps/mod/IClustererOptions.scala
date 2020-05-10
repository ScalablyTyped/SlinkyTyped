package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClustererOptions extends js.Object {
  var gridSize: js.UndefOr[Double] = js.native
  var groupByCoordinates: js.UndefOr[Boolean] = js.native
  var hasBalloon: js.UndefOr[Boolean] = js.native
  var hasHint: js.UndefOr[Boolean] = js.native
  var margin: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.native
  var maxZoom: js.UndefOr[js.Array[Double] | Double] = js.native
  var minClusterSize: js.UndefOr[Double] = js.native
  var preset: js.UndefOr[PresetKey] = js.native
  var showInAlphabeticalOrder: js.UndefOr[Boolean] = js.native
  var useMapMargin: js.UndefOr[Boolean] = js.native
  var viewportMargin: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.native
  var zoomMargin: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.native
}

object IClustererOptions {
  @scala.inline
  def apply(): IClustererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClustererOptions]
  }
  @scala.inline
  implicit class IClustererOptionsOps[Self <: IClustererOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGridSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupByCoordinates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByCoordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupByCoordinates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByCoordinates")(js.undefined)
        ret
    }
    @scala.inline
    def withHasBalloon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBalloon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasBalloon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBalloon")(js.undefined)
        ret
    }
    @scala.inline
    def withHasHint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasHint")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: (js.Array[js.Array[Double] | Double]) | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: js.Array[Double] | Double): Self = {
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
    def withMinClusterSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minClusterSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinClusterSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minClusterSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPreset(value: PresetKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInAlphabeticalOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInAlphabeticalOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInAlphabeticalOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInAlphabeticalOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withUseMapMargin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMapMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMapMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMapMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withViewportMargin(value: (js.Array[js.Array[Double] | Double]) | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewportMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomMargin(value: (js.Array[js.Array[Double] | Double]) | Double): Self = {
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

