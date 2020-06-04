package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlacemarkOptions extends js.Object {
  var cursor: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var hasBalloon: js.UndefOr[Boolean] = js.undefined
  var hasHint: js.UndefOr[Boolean] = js.undefined
  var hideIconOnBalloonOpen: js.UndefOr[Boolean] = js.undefined
  var iconOffset: js.UndefOr[js.Array[Double]] = js.undefined
  var iconShape: js.UndefOr[IGeometryJson | Null] = js.undefined
  var interactiveZIndex: js.UndefOr[Boolean] = js.undefined
  var interactivityModel: js.UndefOr[String] = js.undefined
  var openBalloonOnClick: js.UndefOr[Boolean] = js.undefined
  var openEmptyBalloon: js.UndefOr[Boolean] = js.undefined
  var openEmptyHint: js.UndefOr[Boolean] = js.undefined
  var openHintOnHover: js.UndefOr[Boolean] = js.undefined
  var pane: js.UndefOr[String] = js.undefined
  var pointOverlay: js.UndefOr[String] = js.undefined
  var syncOverlayInit: js.UndefOr[Boolean] = js.undefined
  var useMapMarginInDragging: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
  var zIndexActive: js.UndefOr[Double] = js.undefined
  var zIndexDrag: js.UndefOr[Double] = js.undefined
  var zIndexHover: js.UndefOr[Double] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setHasBalloon(value: Boolean): Self = this.set("hasBalloon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasBalloon: Self = this.set("hasBalloon", js.undefined)
    @scala.inline
    def setHasHint(value: Boolean): Self = this.set("hasHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasHint: Self = this.set("hasHint", js.undefined)
    @scala.inline
    def setHideIconOnBalloonOpen(value: Boolean): Self = this.set("hideIconOnBalloonOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideIconOnBalloonOpen: Self = this.set("hideIconOnBalloonOpen", js.undefined)
    @scala.inline
    def setIconOffset(value: js.Array[Double]): Self = this.set("iconOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconOffset: Self = this.set("iconOffset", js.undefined)
    @scala.inline
    def setIconShape(value: IGeometryJson): Self = this.set("iconShape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconShape: Self = this.set("iconShape", js.undefined)
    @scala.inline
    def setIconShapeNull: Self = this.set("iconShape", null)
    @scala.inline
    def setInteractiveZIndex(value: Boolean): Self = this.set("interactiveZIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractiveZIndex: Self = this.set("interactiveZIndex", js.undefined)
    @scala.inline
    def setInteractivityModel(value: String): Self = this.set("interactivityModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractivityModel: Self = this.set("interactivityModel", js.undefined)
    @scala.inline
    def setOpenBalloonOnClick(value: Boolean): Self = this.set("openBalloonOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenBalloonOnClick: Self = this.set("openBalloonOnClick", js.undefined)
    @scala.inline
    def setOpenEmptyBalloon(value: Boolean): Self = this.set("openEmptyBalloon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenEmptyBalloon: Self = this.set("openEmptyBalloon", js.undefined)
    @scala.inline
    def setOpenEmptyHint(value: Boolean): Self = this.set("openEmptyHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenEmptyHint: Self = this.set("openEmptyHint", js.undefined)
    @scala.inline
    def setOpenHintOnHover(value: Boolean): Self = this.set("openHintOnHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenHintOnHover: Self = this.set("openHintOnHover", js.undefined)
    @scala.inline
    def setPane(value: String): Self = this.set("pane", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePane: Self = this.set("pane", js.undefined)
    @scala.inline
    def setPointOverlay(value: String): Self = this.set("pointOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointOverlay: Self = this.set("pointOverlay", js.undefined)
    @scala.inline
    def setSyncOverlayInit(value: Boolean): Self = this.set("syncOverlayInit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncOverlayInit: Self = this.set("syncOverlayInit", js.undefined)
    @scala.inline
    def setUseMapMarginInDragging(value: Boolean): Self = this.set("useMapMarginInDragging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMapMarginInDragging: Self = this.set("useMapMarginInDragging", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
    @scala.inline
    def setZIndexActive(value: Double): Self = this.set("zIndexActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndexActive: Self = this.set("zIndexActive", js.undefined)
    @scala.inline
    def setZIndexDrag(value: Double): Self = this.set("zIndexDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndexDrag: Self = this.set("zIndexDrag", js.undefined)
    @scala.inline
    def setZIndexHover(value: Double): Self = this.set("zIndexHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndexHover: Self = this.set("zIndexHover", js.undefined)
  }
  
}

