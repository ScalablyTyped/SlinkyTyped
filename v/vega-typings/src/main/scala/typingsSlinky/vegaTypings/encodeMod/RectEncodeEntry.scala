package typingsSlinky.vegaTypings.encodeMod

import typingsSlinky.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RectEncodeEntry extends EncodeEntry {
  
  var cornerRadius: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  
  var cornerRadiusBottomLeft: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  
  var cornerRadiusBottomRight: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  
  var cornerRadiusTopLeft: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  
  var cornerRadiusTopRight: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
}
object RectEncodeEntry {
  
  @scala.inline
  def apply(): RectEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectEncodeEntry]
  }
  
  @scala.inline
  implicit class RectEncodeEntryMutableBuilder[Self <: RectEncodeEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCornerRadius(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadiusBottomLeft(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "cornerRadiusBottomLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadiusBottomLeftUndefined: Self = StObject.set(x, "cornerRadiusBottomLeft", js.undefined)
    
    @scala.inline
    def setCornerRadiusBottomLeftVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "cornerRadiusBottomLeft", js.Array(value :_*))
    
    @scala.inline
    def setCornerRadiusBottomRight(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "cornerRadiusBottomRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadiusBottomRightUndefined: Self = StObject.set(x, "cornerRadiusBottomRight", js.undefined)
    
    @scala.inline
    def setCornerRadiusBottomRightVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "cornerRadiusBottomRight", js.Array(value :_*))
    
    @scala.inline
    def setCornerRadiusTopLeft(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "cornerRadiusTopLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadiusTopLeftUndefined: Self = StObject.set(x, "cornerRadiusTopLeft", js.undefined)
    
    @scala.inline
    def setCornerRadiusTopLeftVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "cornerRadiusTopLeft", js.Array(value :_*))
    
    @scala.inline
    def setCornerRadiusTopRight(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "cornerRadiusTopRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadiusTopRightUndefined: Self = StObject.set(x, "cornerRadiusTopRight", js.undefined)
    
    @scala.inline
    def setCornerRadiusTopRightVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "cornerRadiusTopRight", js.Array(value :_*))
    
    @scala.inline
    def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    @scala.inline
    def setCornerRadiusVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "cornerRadius", js.Array(value :_*))
  }
}
