package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPolylineOptions extends js.Object {
  var cursor: js.UndefOr[String] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var hasBalloon: js.UndefOr[Boolean] = js.native
  var hasHint: js.UndefOr[Boolean] = js.native
  var interactiveZIndex: js.UndefOr[Boolean] = js.native
  var interactivityModel: js.UndefOr[String] = js.native
  var lineStringOverlay: js.UndefOr[js.Function0[js.Object | String]] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var openBalloonOnClick: js.UndefOr[Boolean] = js.native
  var openEmptyBalloon: js.UndefOr[Boolean] = js.native
  var openEmptyHint: js.UndefOr[Boolean] = js.native
  var openHintOnHover: js.UndefOr[Boolean] = js.native
  var pane: js.UndefOr[String] = js.native
  var strokeColor: js.UndefOr[String | js.Array[String]] = js.native
  var strokeOpacity: js.UndefOr[Double | js.Array[Double]] = js.native
  var strokeStyle: js.UndefOr[String | (js.Array[js.Object | String]) | js.Object] = js.native
  var strokeWidth: js.UndefOr[Double | js.Array[Double]] = js.native
  var syncOverlayInit: js.UndefOr[Boolean] = js.native
  var useMapMarginInDragging: js.UndefOr[Boolean] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
  var zIndexActive: js.UndefOr[Double] = js.native
  var zIndexDrag: js.UndefOr[Double] = js.native
  var zIndexHover: js.UndefOr[Double] = js.native
}

object IPolylineOptions {
  @scala.inline
  def apply(): IPolylineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolylineOptions]
  }
  @scala.inline
  implicit class IPolylineOptionsOps[Self <: IPolylineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
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
    def withInteractiveZIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactiveZIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractiveZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactiveZIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractivityModel(value: String): Self = {
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
    def withLineStringOverlay(value: () => js.Object | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStringOverlay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLineStringOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStringOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
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
    def withOpenEmptyBalloon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openEmptyBalloon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenEmptyBalloon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openEmptyBalloon")(js.undefined)
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
    def withPane(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeColor(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeOpacity(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeStyle(value: String | (js.Array[js.Object | String]) | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncOverlayInit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncOverlayInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncOverlayInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncOverlayInit")(js.undefined)
        ret
    }
    @scala.inline
    def withUseMapMarginInDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMapMarginInDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMapMarginInDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMapMarginInDragging")(js.undefined)
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
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndexActive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndexActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndexActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndexActive")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndexDrag(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndexDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndexDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndexDrag")(js.undefined)
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

