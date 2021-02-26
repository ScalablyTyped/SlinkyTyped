package typingsSlinky.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Firstx extends StObject {
  
  var first_x: Double = js.native
  
  var first_y: Double = js.native
  
  var last_x: Double = js.native
  
  var last_y: Double = js.native
  
  var staff_height: Double = js.native
}
object Firstx {
  
  @scala.inline
  def apply(first_x: Double, first_y: Double, last_x: Double, last_y: Double, staff_height: Double): Firstx = {
    val __obj = js.Dynamic.literal(first_x = first_x.asInstanceOf[js.Any], first_y = first_y.asInstanceOf[js.Any], last_x = last_x.asInstanceOf[js.Any], last_y = last_y.asInstanceOf[js.Any], staff_height = staff_height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firstx]
  }
  
  @scala.inline
  implicit class FirstxMutableBuilder[Self <: Firstx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst_x(value: Double): Self = StObject.set(x, "first_x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_y(value: Double): Self = StObject.set(x, "first_y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_x(value: Double): Self = StObject.set(x, "last_x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_y(value: Double): Self = StObject.set(x, "last_y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaff_height(value: Double): Self = StObject.set(x, "staff_height", value.asInstanceOf[js.Any])
  }
}
