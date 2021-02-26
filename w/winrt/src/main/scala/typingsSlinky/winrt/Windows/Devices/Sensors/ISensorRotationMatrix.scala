package typingsSlinky.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISensorRotationMatrix extends StObject {
  
  var m11: Double = js.native
  
  var m12: Double = js.native
  
  var m13: Double = js.native
  
  var m21: Double = js.native
  
  var m22: Double = js.native
  
  var m23: Double = js.native
  
  var m31: Double = js.native
  
  var m32: Double = js.native
  
  var m33: Double = js.native
}
object ISensorRotationMatrix {
  
  @scala.inline
  def apply(
    m11: Double,
    m12: Double,
    m13: Double,
    m21: Double,
    m22: Double,
    m23: Double,
    m31: Double,
    m32: Double,
    m33: Double
  ): ISensorRotationMatrix = {
    val __obj = js.Dynamic.literal(m11 = m11.asInstanceOf[js.Any], m12 = m12.asInstanceOf[js.Any], m13 = m13.asInstanceOf[js.Any], m21 = m21.asInstanceOf[js.Any], m22 = m22.asInstanceOf[js.Any], m23 = m23.asInstanceOf[js.Any], m31 = m31.asInstanceOf[js.Any], m32 = m32.asInstanceOf[js.Any], m33 = m33.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISensorRotationMatrix]
  }
  
  @scala.inline
  implicit class ISensorRotationMatrixMutableBuilder[Self <: ISensorRotationMatrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setM11(value: Double): Self = StObject.set(x, "m11", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM12(value: Double): Self = StObject.set(x, "m12", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM13(value: Double): Self = StObject.set(x, "m13", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM21(value: Double): Self = StObject.set(x, "m21", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM22(value: Double): Self = StObject.set(x, "m22", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM23(value: Double): Self = StObject.set(x, "m23", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM31(value: Double): Self = StObject.set(x, "m31", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM32(value: Double): Self = StObject.set(x, "m32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM33(value: Double): Self = StObject.set(x, "m33", value.asInstanceOf[js.Any])
  }
}
