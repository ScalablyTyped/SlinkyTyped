package typingsSlinky.vegaTypings.encodeMod

import typingsSlinky.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineEncodeEntry
  extends EncodeEntry
     with DefinedProperty {
  
  var interpolate: js.UndefOr[ProductionRule[ScaledValueRef[Interpolate]]] = js.native
  
  var tension: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
}
object LineEncodeEntry {
  
  @scala.inline
  def apply(): LineEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineEncodeEntry]
  }
  
  @scala.inline
  implicit class LineEncodeEntryMutableBuilder[Self <: LineEncodeEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterpolate(value: ProductionRule[ScaledValueRef[Interpolate]]): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
    
    @scala.inline
    def setInterpolateVarargs(value: (Test with ScaledValueRef[Interpolate])*): Self = StObject.set(x, "interpolate", js.Array(value :_*))
    
    @scala.inline
    def setTension(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
    
    @scala.inline
    def setTensionVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "tension", js.Array(value :_*))
  }
}
