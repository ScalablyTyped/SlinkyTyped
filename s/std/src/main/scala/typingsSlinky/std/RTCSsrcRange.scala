package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCSsrcRange extends StObject {
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
}
object RTCSsrcRange {
  
  @scala.inline
  def apply(): RTCSsrcRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCSsrcRange]
  }
  
  @scala.inline
  implicit class RTCSsrcRangeMutableBuilder[Self <: RTCSsrcRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
