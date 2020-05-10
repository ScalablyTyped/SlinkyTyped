package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlacemarkOptions extends js.Object {
  var cursor: js.UndefOr[String] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var hasBalloon: js.UndefOr[Boolean] = js.native
  var hasHint: js.UndefOr[Boolean] = js.native
  var hideIconOnBalloonOpen: js.UndefOr[Boolean] = js.native
  var iconOffset: js.UndefOr[js.Array[Double]] = js.native
  var iconShape: js.UndefOr[IGeometryJson | Null] = js.native
  var interactiveZIndex: js.UndefOr[Boolean] = js.native
  var interactivityModel: js.UndefOr[String] = js.native
  var openBalloonOnClick: js.UndefOr[Boolean] = js.native
  var openEmptyBalloon: js.UndefOr[Boolean] = js.native
  var openEmptyHint: js.UndefOr[Boolean] = js.native
  var openHintOnHover: js.UndefOr[Boolean] = js.native
  var pane: js.UndefOr[String] = js.native
  var pointOverlay: js.UndefOr[String] = js.native
  var syncOverlayInit: js.UndefOr[Boolean] = js.native
  var useMapMarginInDragging: js.UndefOr[Boolean] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
  var zIndexActive: js.UndefOr[Double] = js.native
  var zIndexDrag: js.UndefOr[Double] = js.native
  var zIndexHover: js.UndefOr[Double] = js.native
}

object IPlacemarkOptions {
  @scala.inline
  def apply(): IPlacemarkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPlacemarkOptions]
  }
  @scala.inline
  implicit class IPlacemarkOptionsOps[Self <: IPlacemarkOptions] (val x: Self) extends AnyVal {
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
    def withIconOffset(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconOffset")(js.undefined)
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
    def withIconShapeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconShape")(null)
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
    def withPointOverlay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointOverlay")(js.undefined)
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

