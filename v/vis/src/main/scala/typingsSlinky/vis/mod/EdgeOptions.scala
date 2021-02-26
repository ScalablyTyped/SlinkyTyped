package typingsSlinky.vis.mod

import typingsSlinky.vis.anon.Angle
import typingsSlinky.vis.anon.Enabled
import typingsSlinky.vis.anon.From
import typingsSlinky.vis.anon.To
import typingsSlinky.vis.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EdgeOptions extends StObject {
  
  var arrowStrikethrough: js.UndefOr[Boolean] = js.native
  
  var arrows: js.UndefOr[String | From] = js.native
  
  var chosen: js.UndefOr[Boolean | typingsSlinky.vis.anon.Edge] = js.native
  
  var color: js.UndefOr[String | typingsSlinky.vis.anon.Color] = js.native
  
  var dashes: js.UndefOr[Boolean | js.Array[Double]] = js.native
  
  var endPointOffset: js.UndefOr[To] = js.native
  
  var font: js.UndefOr[String | Font] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var hoverWidth: js.UndefOr[Double] = js.native
  
  // please note, hoverWidth could be also a function. This case is not represented here
  var label: js.UndefOr[String] = js.native
  
  var labelHighlightBold: js.UndefOr[Boolean] = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var physics: js.UndefOr[Boolean] = js.native
  
  var scaling: js.UndefOr[OptionsScaling] = js.native
  
  var selectionWidth: js.UndefOr[Double] = js.native
  
  var selfReference: js.UndefOr[Angle] = js.native
  
  // please note, selectionWidth could be also a function. This case is not represented here
  var selfReferenceSize: js.UndefOr[Double] = js.native
  
  var shadow: js.UndefOr[Boolean | OptionsShadow] = js.native
  
  var smooth: js.UndefOr[Boolean | Enabled] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var widthConstraint: js.UndefOr[Double | Boolean | `0`] = js.native
}
object EdgeOptions {
  
  @scala.inline
  def apply(): EdgeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeOptions]
  }
  
  @scala.inline
  implicit class EdgeOptionsMutableBuilder[Self <: EdgeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrowStrikethrough(value: Boolean): Self = StObject.set(x, "arrowStrikethrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowStrikethroughUndefined: Self = StObject.set(x, "arrowStrikethrough", js.undefined)
    
    @scala.inline
    def setArrows(value: String | From): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
    
    @scala.inline
    def setChosen(value: Boolean | typingsSlinky.vis.anon.Edge): Self = StObject.set(x, "chosen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChosenUndefined: Self = StObject.set(x, "chosen", js.undefined)
    
    @scala.inline
    def setColor(value: String | typingsSlinky.vis.anon.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDashes(value: Boolean | js.Array[Double]): Self = StObject.set(x, "dashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashesUndefined: Self = StObject.set(x, "dashes", js.undefined)
    
    @scala.inline
    def setDashesVarargs(value: Double*): Self = StObject.set(x, "dashes", js.Array(value :_*))
    
    @scala.inline
    def setEndPointOffset(value: To): Self = StObject.set(x, "endPointOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPointOffsetUndefined: Self = StObject.set(x, "endPointOffset", js.undefined)
    
    @scala.inline
    def setFont(value: String | Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setHoverWidth(value: Double): Self = StObject.set(x, "hoverWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverWidthUndefined: Self = StObject.set(x, "hoverWidth", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelHighlightBold(value: Boolean): Self = StObject.set(x, "labelHighlightBold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelHighlightBoldUndefined: Self = StObject.set(x, "labelHighlightBold", js.undefined)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setPhysics(value: Boolean): Self = StObject.set(x, "physics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicsUndefined: Self = StObject.set(x, "physics", js.undefined)
    
    @scala.inline
    def setScaling(value: OptionsScaling): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingUndefined: Self = StObject.set(x, "scaling", js.undefined)
    
    @scala.inline
    def setSelectionWidth(value: Double): Self = StObject.set(x, "selectionWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionWidthUndefined: Self = StObject.set(x, "selectionWidth", js.undefined)
    
    @scala.inline
    def setSelfReference(value: Angle): Self = StObject.set(x, "selfReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfReferenceSize(value: Double): Self = StObject.set(x, "selfReferenceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfReferenceSizeUndefined: Self = StObject.set(x, "selfReferenceSize", js.undefined)
    
    @scala.inline
    def setSelfReferenceUndefined: Self = StObject.set(x, "selfReference", js.undefined)
    
    @scala.inline
    def setShadow(value: Boolean | OptionsShadow): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    @scala.inline
    def setSmooth(value: Boolean | Enabled): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthConstraint(value: Double | Boolean | `0`): Self = StObject.set(x, "widthConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthConstraintUndefined: Self = StObject.set(x, "widthConstraint", js.undefined)
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
