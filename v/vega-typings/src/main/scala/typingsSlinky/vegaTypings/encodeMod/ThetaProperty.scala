package typingsSlinky.vegaTypings.encodeMod

import typingsSlinky.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThetaProperty extends StObject {
  
  var theta: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
}
object ThetaProperty {
  
  @scala.inline
  def apply(): ThetaProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThetaProperty]
  }
  
  @scala.inline
  implicit class ThetaPropertyMutableBuilder[Self <: ThetaProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTheta(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
    
    @scala.inline
    def setThetaVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "theta", js.Array(value :_*))
  }
}
