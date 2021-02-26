package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.page
import typingsSlinky.sketchapp.sketchappStrings.symbolMaster
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSPageLayer extends SketchMSContainerLayer {
  
  @JSName("_class")
  var _class_SketchMSPageLayer: page | symbolMaster = js.native
  
  var hasClickThrough: Boolean = js.native
  
  var horizontalRulerData: SketchMSRulerData = js.native
  
  var includeInCloudUpload: Boolean = js.native
  
  var verticalRulerData: SketchMSRulerData = js.native
}
object SketchMSPageLayer {
  
  @scala.inline
  def apply(
    _class: page | symbolMaster,
    booleanOperation: SketchMSLayerBooleanOperation,
    clippingMaskMode: SketchMSLayerClippingMaskMode,
    do_objectID: String,
    exportOptions: SketchMSLayerExportOptions,
    frame: SketchMSLayerFrame,
    hasClickThrough: Boolean,
    hasClippingMask: Boolean,
    horizontalRulerData: SketchMSRulerData,
    includeInCloudUpload: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isVisible: Boolean,
    layerListExpandedType: Double,
    layers: js.Array[SketchMSContainerLayer],
    name: String,
    nameIsFixed: Boolean,
    resizingConstraint: Double,
    resizingType: SketchMSLayerResizingType,
    rotation: Double,
    shouldBreakMaskChain: Boolean,
    style: SketchMSStyle,
    verticalRulerData: SketchMSRulerData
  ): SketchMSPageLayer = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], booleanOperation = booleanOperation.asInstanceOf[js.Any], clippingMaskMode = clippingMaskMode.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasClickThrough = hasClickThrough.asInstanceOf[js.Any], hasClippingMask = hasClippingMask.asInstanceOf[js.Any], horizontalRulerData = horizontalRulerData.asInstanceOf[js.Any], includeInCloudUpload = includeInCloudUpload.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], verticalRulerData = verticalRulerData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSPageLayer]
  }
  
  @scala.inline
  implicit class SketchMSPageLayerMutableBuilder[Self <: SketchMSPageLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasClickThrough(value: Boolean): Self = StObject.set(x, "hasClickThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalRulerData(value: SketchMSRulerData): Self = StObject.set(x, "horizontalRulerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeInCloudUpload(value: Boolean): Self = StObject.set(x, "includeInCloudUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalRulerData(value: SketchMSRulerData): Self = StObject.set(x, "verticalRulerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: page | symbolMaster): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
