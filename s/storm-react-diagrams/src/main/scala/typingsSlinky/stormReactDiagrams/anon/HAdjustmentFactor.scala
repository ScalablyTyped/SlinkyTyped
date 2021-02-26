package typingsSlinky.stormReactDiagrams.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HAdjustmentFactor extends StObject {
  
  var hAdjustmentFactor: Double = js.native
  
  var height: Double = js.native
  
  var vAdjustmentFactor: Double = js.native
  
  var width: Double = js.native
}
object HAdjustmentFactor {
  
  @scala.inline
  def apply(hAdjustmentFactor: Double, height: Double, vAdjustmentFactor: Double, width: Double): HAdjustmentFactor = {
    val __obj = js.Dynamic.literal(hAdjustmentFactor = hAdjustmentFactor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], vAdjustmentFactor = vAdjustmentFactor.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HAdjustmentFactor]
  }
  
  @scala.inline
  implicit class HAdjustmentFactorMutableBuilder[Self <: HAdjustmentFactor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHAdjustmentFactor(value: Double): Self = StObject.set(x, "hAdjustmentFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVAdjustmentFactor(value: Double): Self = StObject.set(x, "vAdjustmentFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
