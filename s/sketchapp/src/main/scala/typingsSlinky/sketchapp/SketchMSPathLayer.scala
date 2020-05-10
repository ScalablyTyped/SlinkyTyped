package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.oval
import typingsSlinky.sketchapp.sketchappStrings.path
import typingsSlinky.sketchapp.sketchappStrings.rectangle
import typingsSlinky.sketchapp.sketchappStrings.shapePath
import typingsSlinky.sketchapp.sketchappStrings.triangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSPathLayer extends SketchMSLayer {
  @JSName("_class")
  var _class_SketchMSPathLayer: path | shapePath | rectangle | oval | triangle = js.native
  var edited: Boolean = js.native
  var isClosed: Boolean = js.native
  var pointRadiusBehaviour: Double = js.native
  var points: js.Array[SketchMSPoint] = js.native
}

object SketchMSPathLayer {
  @scala.inline
  def apply(
    _class: path | shapePath | rectangle | oval | triangle,
    booleanOperation: SketchMSLayerBooleanOperation,
    clippingMaskMode: SketchMSLayerClippingMaskMode,
    do_objectID: String,
    edited: Boolean,
    exportOptions: SketchMSLayerExportOptions,
    frame: SketchMSLayerFrame,
    hasClippingMask: Boolean,
    isClosed: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isVisible: Boolean,
    layerListExpandedType: Double,
    name: String,
    nameIsFixed: Boolean,
    pointRadiusBehaviour: Double,
    points: js.Array[SketchMSPoint],
    resizingConstraint: Double,
    resizingType: SketchMSLayerResizingType,
    rotation: Double,
    shouldBreakMaskChain: Boolean,
    style: SketchMSStyle
  ): SketchMSPathLayer = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], booleanOperation = booleanOperation.asInstanceOf[js.Any], clippingMaskMode = clippingMaskMode.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], edited = edited.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasClippingMask = hasClippingMask.asInstanceOf[js.Any], isClosed = isClosed.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], pointRadiusBehaviour = pointRadiusBehaviour.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSPathLayer]
  }
  @scala.inline
  implicit class SketchMSPathLayerOps[Self <: SketchMSPathLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: path | shapePath | rectangle | oval | triangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdited(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsClosed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClosed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointRadiusBehaviour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointRadiusBehaviour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(value: js.Array[SketchMSPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

