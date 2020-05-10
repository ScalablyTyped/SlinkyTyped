package typingsSlinky.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSLayer extends js.Object {
  var _class: String = js.native
  var booleanOperation: SketchMSLayerBooleanOperation = js.native
  var clippingMaskMode: SketchMSLayerClippingMaskMode = js.native
  // xLayers custom property
  var css: js.UndefOr[String] = js.native
  var do_objectID: String = js.native
  var exportOptions: SketchMSLayerExportOptions = js.native
  var frame: SketchMSLayerFrame = js.native
  var hasClippingMask: Boolean = js.native
  var isFixedToViewport: Boolean = js.native
  var isFlippedHorizontal: Boolean = js.native
  var isFlippedVertical: Boolean = js.native
  var isLocked: Boolean = js.native
  var isVisible: Boolean = js.native
  var layerListExpandedType: Double = js.native
  var layers: js.UndefOr[js.Array[SketchMSLayer]] = js.native
  var name: String = js.native
  var nameIsFixed: Boolean = js.native
  var resizingConstraint: Double = js.native
  var resizingType: SketchMSLayerResizingType = js.native
  var rotation: Double = js.native
  var shouldBreakMaskChain: Boolean = js.native
  var style: SketchMSStyle = js.native
}

object SketchMSLayer {
  @scala.inline
  def apply(
    _class: String,
    booleanOperation: SketchMSLayerBooleanOperation,
    clippingMaskMode: SketchMSLayerClippingMaskMode,
    do_objectID: String,
    exportOptions: SketchMSLayerExportOptions,
    frame: SketchMSLayerFrame,
    hasClippingMask: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isVisible: Boolean,
    layerListExpandedType: Double,
    name: String,
    nameIsFixed: Boolean,
    resizingConstraint: Double,
    resizingType: SketchMSLayerResizingType,
    rotation: Double,
    shouldBreakMaskChain: Boolean,
    style: SketchMSStyle
  ): SketchMSLayer = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], booleanOperation = booleanOperation.asInstanceOf[js.Any], clippingMaskMode = clippingMaskMode.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasClippingMask = hasClippingMask.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSLayer]
  }
  @scala.inline
  implicit class SketchMSLayerOps[Self <: SketchMSLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBooleanOperation(value: SketchMSLayerBooleanOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleanOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClippingMaskMode(value: SketchMSLayerClippingMaskMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clippingMaskMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDo_objectID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("do_objectID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportOptions(value: SketchMSLayerExportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrame(value: SketchMSLayerFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasClippingMask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasClippingMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFixedToViewport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFixedToViewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFlippedHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFlippedHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFlippedVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFlippedVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayerListExpandedType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerListExpandedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameIsFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameIsFixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResizingConstraint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizingConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResizingType(value: SketchMSLayerResizingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldBreakMaskChain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldBreakMaskChain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: SketchMSStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[SketchMSLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
  }
  
}

